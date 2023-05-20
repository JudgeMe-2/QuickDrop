/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quickdrop;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import quickdrop.Classes.Location;
import quickdrop.Classes.Request;
import quickdrop.Classes.User;


/**
 *
 * @author Ruby Ann
 */
public class SetUpLocation extends javax.swing.JFrame {
    
    /**
     * Creates new form SetUpLocation
     */
    DefaultTableModel tbl;
    Connect conn;
    int request_ID = 1;
    JTextField tfp, tfd;
    User user;
    Request request;
    public SetUpLocation(User u, Request r) {
        initComponents();
        user = u;
        request = r;
        tbl = (DefaultTableModel)jTable1.getModel();
        conn = new Connect();
        populateTable();
        
         jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRowIndex = jTable1.getSelectedRow();
                    if (selectedRowIndex != -1) {
                        // Retrieve values from the selected row
                        String requestID = jTable1.getValueAt(selectedRowIndex, 0).toString();
                        String pickUpLocation = jTable1.getValueAt(selectedRowIndex, 1).toString();
                        String dropOffLocation = jTable1.getValueAt(selectedRowIndex, 2).toString();

                        // Set the retrieved values in the text fields
                        tfPickUp.setText(pickUpLocation);
                        tfDropOff.setText(dropOffLocation);
                    }
                }
            }
        });
    }

    
    

    public SetUpLocation() {
    }
    
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        ResultSet rs = conn.getLocations();
        
        try {
            while (rs.next()) {
                String requestID = rs.getString("location_ID");
                String pickUpLocation = rs.getString("pickUp_location");
                String dropOffLocation = rs.getString("dropOff_location");

                model.addRow(new Object[]{requestID, pickUpLocation, dropOffLocation});
            }
        } catch (SQLException ex) {
            Logger.getLogger(SetUpLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tfPickUp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfDropOff = new javax.swing.JTextField();
        btnAddLoc = new javax.swing.JButton();
        proceed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Pick-up Location", "Drop-off Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(96, 150, 180));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(96, 150, 180), 1, true));

        tfPickUp.setBackground(new java.awt.Color(255, 255, 255));
        tfPickUp.setForeground(new java.awt.Color(96, 150, 180));
        tfPickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPickUpActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pick Up Location:");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Drop off Location:");

        tfDropOff.setBackground(new java.awt.Color(255, 255, 255));
        tfDropOff.setForeground(new java.awt.Color(96, 150, 180));
        tfDropOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDropOffActionPerformed(evt);
            }
        });

        btnAddLoc.setBackground(new java.awt.Color(96, 150, 180));
        btnAddLoc.setForeground(new java.awt.Color(255, 255, 255));
        btnAddLoc.setText("Add Location");
        btnAddLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDropOff, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnAddLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDropOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddLoc)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        proceed.setBackground(new java.awt.Color(96, 150, 180));
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("Proceed");
        proceed.setBorderPainted(false);
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceed)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfDropOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDropOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDropOffActionPerformed

    private void tfPickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPickUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPickUpActionPerformed

    private void btnAddLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLocActionPerformed
        // TODO add your handling code here:
        if(tfPickUp.getText().equals("") || tfDropOff.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide locations for delivery.");
        }
        else {
            String display[] = {String.valueOf(request_ID++), tfPickUp.getText(), tfDropOff.getText()};
            Location location = new Location(tfPickUp.getText(), tfDropOff.getText());
            conn.addLocation(location);
            
            //tbl.addRow(display);
            tbl.setRowCount(0);
            populateTable();
            JOptionPane.showMessageDialog(this, "Location added Successfully!");
            tfPickUp.setText("");
            tfDropOff.setText("");
        }
    }//GEN-LAST:event_btnAddLocActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
         
         if (selectedRow == -1) {
             JOptionPane.showMessageDialog(this, "Please select a row to accept delivery.");
         } else {
             int location_ID = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());
             //String pickUpLocation = jTable1.getValueAt(selectedRow, 1).toString();
             //String dropOffLocation = jTable1.getValueAt(selectedRow, 2).toString();

             request.setLocation_id(location_ID);
             conn.proceed(request);
             
             
             //************Tester*********************
             System.out.println(request.toString());
             //***************************************
             
                
             JMain m = new JMain(user);
             m.show();
             m.setHistoryActive();
             this.dispose();

                //tfp.setText(pickUpLocation);
                //tfd.setText(dropOffLocation);
                //JOptionPane.showMessageDialog(this, "Request ID: " + requestID + "\nPick-up Location: " + pickUpLocation + "\nDrop-off Location: " + dropOffLocation);
                //ystem.out.println("Proceeding to the next step...");
        }
    }//GEN-LAST:event_proceedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetUpLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetUpLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetUpLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetUpLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUpLocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton proceed;
    private javax.swing.JTextField tfDropOff;
    private javax.swing.JTextField tfPickUp;
    // End of variables declaration//GEN-END:variables

}