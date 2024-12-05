package main;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;

public class IP {

    static InputStream inputStream;

    public static String getIPAddress() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String command = "";

            // Determine command based on the OS
            if (os.contains("win")) {
                command = "ipconfig";
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                command = "netstat -rn";
            } else {
                System.out.println("Unsupported operating system.");

            }

            // Execute the command
            ProcessBuilder builder = new ProcessBuilder(command.split(" "));
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            String gatewayPattern = os.contains("win") ? "Default Gateway" : "0.0.0.0";

            while ((line = reader.readLine()) != null) {
                // Check for default gateway in the output
                if (line.contains(gatewayPattern)) {
                    if (os.contains("win")) {
                        // For Windows, extract the IP address from the line
                        String gateway = line.split(":")[1].trim();
                        return gateway.trim();
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void Send(String IP_ADDRESS, String SEND_TO, String MESSSAGE, boolean appear) {

        String FINAL_MESSAGE = MESSSAGE.replaceAll("\\s", "+");
        try {
            String link = "http://" + IP_ADDRESS + ":8080/v1/sms/send/?phone=" + SEND_TO
                    + "&message=" + FINAL_MESSAGE;
            URL url = new URL(link);
            inputStream = url.openStream();
       
            if (appear == true) {
                JOptionPane.showMessageDialog(null, "Message has been sent");
            }
                inputStream.close();

        } catch (IOException | HeadlessException e) {
            System.err.println(e.getMessage());
        }
    }

}
