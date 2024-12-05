package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public final class Home extends javax.swing.JFrame {
  int time =10;
    String phone;
    Connection conn = null;
    String user_id;

    public Home(String user_id, String phone) {
        initComponents();
        conn = Database.JavaConnection.DB();
        this.phone = phone;
        this.user_id = user_id;
  timeSelector.setSelectedIndex(20);
        alertUnpaidUsers();
        scheduleTask();

    }

    public void alertUnpaidUsers() {
        try (PreparedStatement pst = conn.prepareStatement("Select * from records where is_paid=?")) {
            pst.setBoolean(1, false);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("user_id"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowCarPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        monthlyPriceLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        onCashPriceLabel = new javax.swing.JLabel();
        onCashButton = new javax.swing.JButton();
        monthlyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        price6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        carLabel3 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        carLabel16 = new javax.swing.JLabel();
        carLabel2 = new javax.swing.JLabel();
        carLabel1 = new javax.swing.JLabel();
        carLabel4 = new javax.swing.JLabel();
        carLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        timeSelector = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        ShowCarPanel.setBackground(new java.awt.Color(51, 0, 51));
        ShowCarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        ShowCarPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 690, 30));

        monthlyPriceLabel.setBackground(new java.awt.Color(255, 255, 255));
        monthlyPriceLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        monthlyPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        monthlyPriceLabel.setText("Price montly:");
        ShowCarPanel.add(monthlyPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 260, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MISYUBIBI CAR");
        ShowCarPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 680, 30));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Car name");
        ShowCarPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 690, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price montly:");
        ShowCarPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 190, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cash:");
        ShowCarPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 90, 30));

        onCashPriceLabel.setBackground(new java.awt.Color(255, 255, 255));
        onCashPriceLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        onCashPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        onCashPriceLabel.setText("Price full cash");
        ShowCarPanel.add(onCashPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 280, 30));

        onCashButton.setBackground(new java.awt.Color(51, 0, 51));
        onCashButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        onCashButton.setForeground(new java.awt.Color(255, 255, 255));
        onCashButton.setText("Pay full cash");
        onCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCashButtonActionPerformed(evt);
            }
        });
        ShowCarPanel.add(onCashButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 280, 40));

        monthlyButton.setBackground(new java.awt.Color(51, 0, 51));
        monthlyButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        monthlyButton.setForeground(new java.awt.Color(255, 255, 255));
        monthlyButton.setText("Pay monthly");
        monthlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyButtonActionPerformed(evt);
            }
        });
        ShowCarPanel.add(monthlyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 280, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("car 6");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 280, 160));

        jButton2.setText("car 4");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 280, 160));

        jButton3.setText("car 5");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 280, 160));

        jButton4.setText("car 1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 160));

        jButton5.setText("car 2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 280, 160));

        jButton6.setText("car 3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 280, 160));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USED CARS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 280, 30));

        price6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        price6.setForeground(new java.awt.Color(255, 255, 255));
        price6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price6.setText("7500");
        jPanel1.add(price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 280, 50));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NEW CARS");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 280, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Run schedule of unpaid every (seconds)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 20));

        carLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        carLabel3.setForeground(new java.awt.Color(255, 255, 255));
        carLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carLabel3.setText("Car 3");
        jPanel1.add(carLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 280, 30));

        price2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        price2.setForeground(new java.awt.Color(255, 255, 255));
        price2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price2.setText("2500");
        jPanel1.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 280, 20));

        price3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        price3.setForeground(new java.awt.Color(255, 255, 255));
        price3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price3.setText("4500");
        jPanel1.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 280, 20));

        price4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        price4.setForeground(new java.awt.Color(255, 255, 255));
        price4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price4.setText("5500");
        jPanel1.add(price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 280, 40));

        price5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        price5.setForeground(new java.awt.Color(255, 255, 255));
        price5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price5.setText("6500");
        jPanel1.add(price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 280, 50));

        price1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        price1.setForeground(new java.awt.Color(255, 255, 255));
        price1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price1.setText("1500");
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 280, 20));

        carLabel16.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        carLabel16.setForeground(new java.awt.Color(255, 255, 255));
        carLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carLabel16.setText("Car 6");
        jPanel1.add(carLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 280, 30));

        carLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        carLabel2.setForeground(new java.awt.Color(255, 255, 255));
        carLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carLabel2.setText("Car 2");
        jPanel1.add(carLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 280, 30));

        carLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        carLabel1.setForeground(new java.awt.Color(255, 255, 255));
        carLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carLabel1.setText("Car 1");
        jPanel1.add(carLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 280, 30));

        carLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        carLabel4.setForeground(new java.awt.Color(255, 255, 255));
        carLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carLabel4.setText("Car 4");
        jPanel1.add(carLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 280, 30));

        carLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        carLabel5.setForeground(new java.awt.Color(255, 255, 255));
        carLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carLabel5.setText("Car 5");
        jPanel1.add(carLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 280, 30));

        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setText("Show billing records");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 190, 40));

        timeSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Run schedule every (seconds)", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "150", "200", "250", "300", "350", "400", "450", "1000000", "2000000", "3000000", " ", " ", " " }));
        timeSelector.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                timeSelectorPropertyChange(evt);
            }
        });
        jPanel1.add(timeSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, 40));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MISYUBIBI SHOP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 280, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1086, 773));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCashButtonActionPerformed
        String IP_ADDRESS = IP.getIPAddress();
        String MESSAGE = "Thank you for purchasing " + nameLabel.getText() + ": on Cash:$" + onCashPriceLabel.getText();
        IP.Send(IP_ADDRESS, phone, MESSAGE, false);
        insertRecords(false, true, onCashPriceLabel.getText());
        Window window = SwingUtilities.getWindowAncestor(onCashButton); // button is the button triggering the event
        if (window != null) {
            window.dispose();
        }
    }//GEN-LAST:event_onCashButtonActionPerformed

    private void monthlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyButtonActionPerformed
        String IP_ADDRESS = IP.getIPAddress();
        String MESSAGE = "Thank you for purchasing " + nameLabel.getText() + ":  Monthly:$" + monthlyPriceLabel.getText();
        IP.Send(IP_ADDRESS, phone, MESSAGE, false);
        insertRecords(true, false, monthlyPriceLabel.getText());
        Window window = SwingUtilities.getWindowAncestor(onCashButton); // button is the button triggering the event
        if (window != null) {
            window.dispose();
        }

    }//GEN-LAST:event_monthlyButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Record(user_id,phone).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void timeSelectorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_timeSelectorPropertyChange
        System.out.println("");
    }//GEN-LAST:event_timeSelectorPropertyChange

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        showCart(carLabel3, price3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        showCart(carLabel2, price2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        showCart(carLabel1, price1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showCart(carLabel4, price4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showCart(carLabel5, price5);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showCart(carLabel16, price6);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Home("", "").setVisible(true);
        });
    }

    public void showCart(JLabel name, JLabel price) {
        nameLabel.setText(name.getText());
        int monthly = Integer.valueOf(price.getText()) / 10;
        String onCash = price.getText();
        monthlyPriceLabel.setText(String.valueOf(monthly));
        onCashPriceLabel.setText(onCash);

        JOptionPane.showMessageDialog(null, ShowCarPanel, "", JOptionPane.DEFAULT_OPTION);
    }

    public void insertRecords(Boolean is_monthly, Boolean is_cash, String price) {
        String sql = "INSERT INTO records (user_id, name, price, is_monthly, is_cash) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, user_id);
            pst.setString(2, nameLabel.getText());
            pst.setString(3, price);
            pst.setBoolean(4, is_monthly);
            pst.setBoolean(5, is_cash);
            pst.execute();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

public void getRecords() {
    try (PreparedStatement pst = conn.prepareStatement(
            "SELECT "
            + "r.id AS `ID`, "
            + "u.phone AS `Phone`, "
            + "r.name AS `Car Name`, "
            + "r.price AS `Car Price`, "
            + "r.is_monthly AS `Monthly`, "
            + "r.is_cash AS `On Cash`, "
            + "r.is_paid AS `Paid` "
            + "FROM records r "
            + "JOIN users u ON r.user_id = u.id "
            + "WHERE r.is_paid = false")) {

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            String IP_ADDRESS = IP.getIPAddress();
            String phone_number = rs.getString("Phone");
            String car = rs.getString("Car Name");
            String price = rs.getString("Car Price");
            boolean isMonthly = rs.getBoolean("Monthly");
            boolean isCash = rs.getBoolean("On Cash");

            // Build the message based on payment type
            String MESSAGE = "I remind you to pay your bill of car " + car + " with the price of " + price;
            if (isMonthly) {
                MESSAGE += " (Monthly installment).";
            } else if (isCash) {
                MESSAGE += " (Paid in cash).";
            }
            System.out.println("dumaan");
            // Send the message
            IP.Send(IP_ADDRESS, phone_number, MESSAGE, false);
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}

      public void scheduleTask() {
         
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
            time = Integer.valueOf(timeSelector.getSelectedItem().toString());
            System.out.println("Time selected"+time);
            getRecords();
            
         
        }, 0, time, TimeUnit.SECONDS); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ShowCarPanel;
    private javax.swing.JLabel carLabel1;
    private javax.swing.JLabel carLabel16;
    private javax.swing.JLabel carLabel2;
    private javax.swing.JLabel carLabel3;
    private javax.swing.JLabel carLabel4;
    private javax.swing.JLabel carLabel5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton monthlyButton;
    private javax.swing.JLabel monthlyPriceLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton onCashButton;
    private javax.swing.JLabel onCashPriceLabel;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel price6;
    private javax.swing.JComboBox timeSelector;
    // End of variables declaration//GEN-END:variables
}
