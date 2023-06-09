/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quickdrop;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import quickdrop.Classes.Payment;
import quickdrop.Classes.Request;
import quickdrop.Classes.User;

/**
 *
 * @author Kyla Manatad
 */
public class PaymentMethod extends javax.swing.JFrame {

    /**
     * Creates new form PaymentMethod
     */
    Connect conn;
    ButtonGroup bg;
    ButtonGroup bgtip;
    User user;
    Request request;
    VerifyRequest vr;
    public PaymentMethod(User u, Request r) {
        initComponents();
        conn = new Connect();
        user = u;
        request = r;
        vr = conn.getVerificationById(request);
        bg = new ButtonGroup();
        bg.add(cdbc);
        bg.add(cash);
        bg.add(gcash);
        total_lbl.setText("Total: " + (vr.getFee()+2));
        //tip
        bgtip = new ButtonGroup();
        bgtip.add(not);
        bgtip.add(ten);
        bgtip.add(twenty);
        bgtip.add(forty);
        bgtip.add(sixty);
        bgtip.add(eighty);
        bgtip.add(onehundred);
        not.isSelected();
        
    }
    
    public PaymentMethod(){
        initComponents();
        conn = new Connect();
        bg.add(cdbc);
        bg.add(cash);
        bg.add(gcash);
        //tip
        bgtip.add(not);
        bgtip.add(ten);
        bgtip.add(twenty);
        bgtip.add(forty);
        bgtip.add(sixty);
        bgtip.add(eighty);
        bgtip.add(onehundred);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cash = new javax.swing.JRadioButton();
        gcash = new javax.swing.JRadioButton();
        cdbc = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        not = new javax.swing.JButton();
        ten = new javax.swing.JButton();
        twenty = new javax.swing.JButton();
        forty = new javax.swing.JButton();
        sixty = new javax.swing.JButton();
        eighty = new javax.swing.JButton();
        onehundred = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        confirmbtn = new javax.swing.JButton();
        total_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180)));
        jPanel3.setForeground(new java.awt.Color(96, 150, 180));

        cash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cash.setText("Cash");
        cash.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cash.setIconTextGap(825);

        gcash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gcash.setText("GCash");
        gcash.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gcash.setIconTextGap(815);

        cdbc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cdbc.setText("Credit or Debit Card");
        cdbc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cdbc.setIconTextGap(722);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cdbc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gcash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cdbc)
                .addGap(18, 18, 18)
                .addComponent(cash)
                .addGap(26, 26, 26)
                .addComponent(gcash)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180)));
        jPanel2.setForeground(new java.awt.Color(96, 150, 180));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("Tip your rider");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setToolTipText("");

        jLabel9.setText("100% of the tips go to your rider, we don;t deduct anything from it.");
        jLabel9.setToolTipText("");

        not.setText("Not now");
        not.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notActionPerformed(evt);
            }
        });

        ten.setText("₱10.00");
        ten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        twenty.setText("₱20.00");
        twenty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        twenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyActionPerformed(evt);
            }
        });

        forty.setText("₱40.00");
        forty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        forty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fortyActionPerformed(evt);
            }
        });

        sixty.setText("₱60.00");
        sixty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        sixty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixtyActionPerformed(evt);
            }
        });

        eighty.setText("₱80.00");
        eighty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        eighty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightyActionPerformed(evt);
            }
        });

        onehundred.setText("₱100.00");
        onehundred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180), 3));
        onehundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onehundredActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 150, 180));
        jLabel10.setText("Most common");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(twenty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(forty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(sixty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(eighty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(onehundred, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twenty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(forty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sixty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eighty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(onehundred, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 150, 180)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setText("(incl. VAT)");

        confirmbtn.setBackground(new java.awt.Color(96, 150, 180));
        confirmbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmbtn.setText("Confirm Payment");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        total_lbl.setText("Total");
        total_lbl.setName("jTotal"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 758, Short.MAX_VALUE)
                        .addComponent(total_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(total_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        // TODO add your handling code here:
        // perform payment confirmation actions
        Payment p;
        if(selection() == 0 || checkPaymentMethod() == 0) {
              JOptionPane.showMessageDialog(null, "Please complete the fields");
        } else {
            int total = getTip() + 2 + (int)vr.getFee();
            p = new Payment(vr.getRequestID(), checkPaymentMethod(), getTip(), total);
            boolean b = conn.addPayment(p);
            if(b) {
                JOptionPane.showMessageDialog(null, "Payment Confirm");
                JMain j = new JMain(user);
                j.show();
                this.dispose();
            } else {
                 JOptionPane.showMessageDialog(null, "Payment Failed! Try Again!");
                 PaymentMethod pay = new PaymentMethod(user, request);
                 pay.show();
                 this.dispose();
            }
        }
        
        
        
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notActionPerformed
        // TODO add your handling code here:
        not.setSelected(true);
        ten.setSelected(false);
        twenty.setSelected(false);
        forty.setSelected(false);
        sixty.setSelected(false);
        eighty.setSelected(false);
        onehundred.setSelected(false);
        
        onehundred.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(UIManager.getColor("Button.background"));
        twenty.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(Color.WHITE);
        total_lbl.setText("Total: " + (vr.getFee()+2));
    }//GEN-LAST:event_notActionPerformed

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
        // TODO add your handling code here:
        not.setSelected(false);
        ten.setSelected(true);
        twenty.setSelected(false);
        forty.setSelected(false);
        sixty.setSelected(false);
        eighty.setSelected(false);
        onehundred.setSelected(false);
        
        onehundred.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(UIManager.getColor("Button.background"));
        twenty.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(Color.WHITE);
        total_lbl.setText("Total: " + (vr.getFee()+12));
    }//GEN-LAST:event_tenActionPerformed

    private void twentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyActionPerformed
        // TODO add your handling code here:
        not.setSelected(false);
        ten.setSelected(false);
        twenty.setSelected(true);
        forty.setSelected(false);
        sixty.setSelected(false);
        eighty.setSelected(false);
        onehundred.setSelected(false);
        
        onehundred.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(UIManager.getColor("Button.background"));
        twenty.setBackground(Color.WHITE);
        total_lbl.setText("Total: " + (vr.getFee()+22));
    }//GEN-LAST:event_twentyActionPerformed

    private void fortyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fortyActionPerformed
        // TODO add your handling code here:
        not.setSelected(false);
        ten.setSelected(false);
        twenty.setSelected(false);
        forty.setSelected(true);
        sixty.setSelected(false);
        eighty.setSelected(false);
        onehundred.setSelected(false);
        
        onehundred.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(UIManager.getColor("Button.background"));
        twenty.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(Color.WHITE);
        total_lbl.setText("Total: " + (vr.getFee()+42));
    }//GEN-LAST:event_fortyActionPerformed

    private void sixtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixtyActionPerformed
        // TODO add your handling code here:
        not.setSelected(false);
        ten.setSelected(false);
        twenty.setSelected(false);
        forty.setSelected(false);
        sixty.setSelected(true);
        eighty.setSelected(false);
        onehundred.setSelected(false);
        
        onehundred.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(UIManager.getColor("Button.background"));
        twenty.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(Color.WHITE);
        total_lbl.setText("Total: " + (vr.getFee()+62));
    }//GEN-LAST:event_sixtyActionPerformed

    private void eightyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightyActionPerformed
        // TODO add your handling code here:
        not.setSelected(false);
        ten.setSelected(false);
        twenty.setSelected(false);
        forty.setSelected(false);
        sixty.setSelected(false);
        eighty.setSelected(true);
        onehundred.setSelected(false);
        
        
        onehundred.setBackground(UIManager.getColor("Button.background"));
        twenty.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(Color.WHITE);
        
        total_lbl.setText("Total: " + (vr.getFee()+82));
    }//GEN-LAST:event_eightyActionPerformed

    private void onehundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onehundredActionPerformed
        // TODO add your handling code here:
        not.setSelected(false);
        ten.setSelected(false);
        twenty.setSelected(false);
        forty.setSelected(false);
        sixty.setSelected(false);
        eighty.setSelected(false);
        onehundred.setSelected(true);
        
        twenty.setBackground(UIManager.getColor("Button.background"));
        eighty.setBackground(UIManager.getColor("Button.background"));
        sixty.setBackground(UIManager.getColor("Button.background"));
        forty.setBackground(UIManager.getColor("Button.background"));
        ten.setBackground(UIManager.getColor("Button.background"));
        not.setBackground(UIManager.getColor("Button.background"));
        onehundred.setBackground(Color.WHITE);
        total_lbl.setText("Total: " + (vr.getFee()+102));
    }//GEN-LAST:event_onehundredActionPerformed
    
    public int checkPaymentMethod() {
        if(cdbc.isSelected()) {
            return 1;
        } else if(cash.isSelected()) {
            return 2;
        } else if(gcash.isSelected()) {
            return 3;
        }
        return 0;
    }
    public int selection() {
        if(not.isSelected()) {
            return 1;
        } else if(ten.isSelected()) {
            return 2;
        } else if(twenty.isSelected()) {
            return 3;
        } else if(forty.isSelected()) {
            return 4;
        } else if(sixty.isSelected()) {
            return 5;
        } else if(eighty.isSelected()) {
            return  6;
        } else if(onehundred.isSelected()) {
            return 7;
        }
        return 0;
    }
    public int getTip() {
        if(not.isSelected()) {
            return 0;
        } else if(ten.isSelected()) {
            return 10;
        } else if(twenty.isSelected()) {
            return 20;
        } else if(forty.isSelected()) {
            return 40;
        } else if(sixty.isSelected()) {
            return 60;
        } else if(eighty.isSelected()) {
            return  80;
        } else if(onehundred.isSelected()) {
            return 100;
        }
        return 0;
    }
    /*public void reColor() {
        ArrayList<JButton> arr = new ArrayList<>();
        arr.add(not);
        arr.add(ten);
        arr.add(twenty);
        arr.add(forty);
        arr.add(sixty);
        arr.add(eighty);
        arr.add(onehundred);
        for(JButton j : arr) {
            if(j.isSelected()) {
               j.setBackground(Color.WHITE);
            } else {
                j.setSelected(false);
                j.setBackground(UIManager.getColor("Button.Background"));
            }
        }
    }*/
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
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cash;
    private javax.swing.JRadioButton cdbc;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JButton eighty;
    private javax.swing.JButton forty;
    private javax.swing.JRadioButton gcash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton not;
    private javax.swing.JButton onehundred;
    private javax.swing.JButton sixty;
    private javax.swing.JButton ten;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JButton twenty;
    // End of variables declaration//GEN-END:variables

    
}
