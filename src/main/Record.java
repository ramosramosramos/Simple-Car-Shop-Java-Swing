package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;

public final class Record extends javax.swing.JFrame {
    
    Connection conn = null;
    String phone;
    String user_id;
    
    public Record(String user_id, String phone) {
        initComponents();
        this.phone = phone;
        this.user_id = user_id;
        this.setExtendedState(MAXIMIZED_BOTH);
        conn = Database.JavaConnection.DB();
        getRecords();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recordPop = new javax.swing.JPopupMenu();
        deleteItem = new javax.swing.JMenuItem();
        warningItem = new javax.swing.JMenuItem();
        paidItem = new javax.swing.JMenuItem();
        amount_paymentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        add_payment_button = new javax.swing.JButton();
        amount_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        deleteItem.setText("Delete");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        recordPop.add(deleteItem);

        warningItem.setText("Send warning");
        warningItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningItemActionPerformed(evt);
            }
        });
        recordPop.add(warningItem);

        paidItem.setText("Set as paid");
        paidItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidItemActionPerformed(evt);
            }
        });
        recordPop.add(paidItem);

        amount_paymentPanel.setBackground(new java.awt.Color(51, 0, 51));
        amount_paymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        amount_paymentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 330, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Amount");
        amount_paymentPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 30));

        id_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_fieldActionPerformed(evt);
            }
        });
        id_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_fieldKeyTyped(evt);
            }
        });
        amount_paymentPanel.add(id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 40));

        add_payment_button.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add_payment_button.setText("Save");
        add_payment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_payment_buttonActionPerformed(evt);
            }
        });
        amount_paymentPanel.add(add_payment_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 260, 40));

        amount_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_fieldActionPerformed(evt);
            }
        });
        amount_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amount_fieldKeyTyped(evt);
            }
        });
        amount_paymentPanel.add(amount_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Amount");
        amount_paymentPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ID");
        amount_paymentPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Print table");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 0, 51));
        jButton4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Paid list");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(15, 479));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(15, 479));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(923, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Billing records");

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(797, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(939, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            recordPop.show(table, evt.getX(), evt.getY());
            
        }
    }//GEN-LAST:event_tableMousePressed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        String id = table.getValueAt(table.getSelectedRow(), 0).toString();
        try (PreparedStatement pst = conn.prepareStatement("Delete from records where id = ?")) {
            pst.setString(1, id);
            pst.executeUpdate();
            getRecords();
            JOptionPane.showMessageDialog(null, "Successfully deleted");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_deleteItemActionPerformed

    private void warningItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningItemActionPerformed
        String IP_ADDRESS = IP.getIPAddress();
        String phone_number = table.getValueAt(table.getSelectedRow(), 2).toString();
        String car = table.getValueAt(table.getSelectedRow(), 3).toString();
        String price = table.getValueAt(table.getSelectedRow(), 4).toString();
        String MESSAGE = "I remind you to pay your bill of car " + car + " with the price of " + price;
        IP.Send(IP_ADDRESS, phone_number, MESSAGE, true);
    }//GEN-LAST:event_warningItemActionPerformed

    private void paidItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidItemActionPerformed
        String id = table.getValueAt(table.getSelectedRow(), 0).toString();
        try (PreparedStatement pst = conn.prepareStatement("Update records set is_paid =? where id = ?")) {
            pst.setBoolean(1, true);
            pst.setString(2, id);
            pst.executeUpdate();
            getRecords();
            JOptionPane.showMessageDialog(null, "Successfully set as paid");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_paidItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home(user_id, phone).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, amount_paymentPanel, "", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_fieldActionPerformed
        addAmountPaid();        // TODO add your handling code here:
    }//GEN-LAST:event_id_fieldActionPerformed

    private void id_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_fieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_id_fieldKeyTyped

    private void amount_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amount_fieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_amount_fieldKeyTyped

    private void add_payment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_payment_buttonActionPerformed
        addAmountPaid();
    }//GEN-LAST:event_add_payment_buttonActionPerformed

    private void amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_fieldActionPerformed
        addAmountPaid();
    }//GEN-LAST:event_amount_fieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tools.PrintHelper.getPrintTable(table);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new PaidList().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Record("", "").setVisible(true);
        });
    }
    
    public void getRecords() {
        try (PreparedStatement pst = conn.prepareStatement(
                "SELECT "
                + "r.id AS `ID`, "
                + "u.name AS `Buyer's name`, "
                + "u.phone AS `Phone number`, "
                + "r.name AS `Car name`, "
                + "r.price AS `Car price`, "
                + "r.is_monthly AS `Monthly`, "
                + "r.is_cash AS `On cash`, "
                + "r.is_paid AS `Paid`, "
                + "r.amount_paid `Amount paid` "
                + "FROM records r "
                + "JOIN users u on r.user_id = u.id ")) {
            
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
 public void addAmountPaid() {
    String id = id_field.getText().trim();
    String amount = amount_field.getText().trim();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(null, "ID is Empty!");
        return;
    }
    if (amount.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Amount is Empty!");
        return;
    }
    
    try {
        // Start transaction
        conn.setAutoCommit(false);

        // Update amount_paid in records table
        try (PreparedStatement pst = conn.prepareStatement(
                "UPDATE records SET amount_paid = ? WHERE id = ?")) {
            pst.setDouble(1, Double.parseDouble(amount));
            pst.setString(2, id);
            pst.executeUpdate();
        }

        // Insert into paids table
        try (PreparedStatement pstPaidList = conn.prepareStatement(
                "INSERT INTO paids (user_id, amount_paid) VALUES (?, ?)")) {
            pstPaidList.setString(1, id); // Assuming user_id is the same as id
            pstPaidList.setDouble(2, Double.parseDouble(amount));
            pstPaidList.executeUpdate();
        }

        // Commit transaction
        conn.commit();
        JOptionPane.showMessageDialog(null, "Successfully added!");

        // Clear fields and update records
        amount_field.setText("");
        id_field.setText("");
        getRecords();
    } catch (Exception e) {
        try {
            // Rollback transaction in case of an error
            conn.rollback();
        } catch (Exception rollbackEx) {
            System.err.println("Rollback failed: " + rollbackEx.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        try {
            // Restore auto-commit mode
            conn.setAutoCommit(true);
        } catch (Exception autoCommitEx) {
            System.err.println("Failed to restore auto-commit: " + autoCommitEx.getMessage());
        }
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_payment_button;
    private javax.swing.JTextField amount_field;
    private javax.swing.JPanel amount_paymentPanel;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JTextField id_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem paidItem;
    private javax.swing.JPopupMenu recordPop;
    private javax.swing.JTable table;
    private javax.swing.JMenuItem warningItem;
    // End of variables declaration//GEN-END:variables
}
