package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;

public class Verification extends javax.swing.JFrame {

    private final String generatedCode;

    String MESSAGE;
    String phone;
    String user_id;
    Connection conn = null;
    String IP_ADDRESS;

    public Verification(String user_id,String phone) {
        initComponents();
        conn = Database.JavaConnection.DB();
        this.phone = phone;
        this.user_id = user_id;
        IP_ADDRESS = IP.getIPAddress();
        generatedCode = generateRandomCode(5);
        MESSAGE = "Your code is " + generatedCode;
        IP.Send(IP_ADDRESS, phone, MESSAGE, false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        registerButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number here");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 240, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MISYUBIBI Verification");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 380, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To proceed please verify your account, the code will be send to: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 480, 50));

        codeField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        codeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(codeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 440, 40));

        registerButton.setBackground(new java.awt.Color(51, 0, 51));
        registerButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Resend code");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, 40));

        registerButton1.setBackground(new java.awt.Color(51, 0, 51));
        registerButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        registerButton1.setForeground(new java.awt.Color(255, 255, 255));
        registerButton1.setText("Verify");
        registerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 100, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(575, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        IP.Send(IP_ADDRESS, phone, MESSAGE, false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void codeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFieldActionPerformed

        verify();
    }//GEN-LAST:event_codeFieldActionPerformed

    private void registerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButton1ActionPerformed

    private String generateRandomCode(int length) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            code.append(random.nextInt(10));
        }
        return code.toString();
    }

    public void verify() {

        String enteredCode = codeField.getText();

        if (enteredCode.equals(generatedCode)) {
            try (PreparedStatement pst = conn.prepareStatement("update users set isVerified =1 where phone =?")) {
                pst.setString(1, phone);
                pst.execute();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            JOptionPane.showMessageDialog(this, "Verification successful!");

            new Home(user_id,phone).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid code. Please try again.");
        }
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Verification("","").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton registerButton1;
    // End of variables declaration//GEN-END:variables
}
