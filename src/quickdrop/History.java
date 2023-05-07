/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quickdrop;

import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Jadge
 */
public class History extends javax.swing.JPanel {

    /**
     * Creates new form History
     */
    public History() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        /*table.addRow(new Object[]{"1", "12/12/23", "Tisa,Labangon,Cebu", StatusType.PENDING});
        table.addRow(new Object[]{"2", "12/12/23", "Tisa,Labangon,Cebu", StatusType.APPROVED});
        table.addRow(new Object[]{"3", "12/12/23", "Tisa,Labangon,Cebu", StatusType.APPROVED});
        table.addRow(new Object[]{"4", "12/12/23", "Tisa,Labangon,Cebu", StatusType.REJECT});
        table.addRow(new Object[]{"5", "12/12/23", "Tisa,Labangon,Cebu", StatusType.PENDING});
        table.addRow(new Object[]{"6", "12/12/23", "Tisa,Labangon,Cebu", StatusType.APPROVED});
        table.addRow(new Object[]{"7", "12/12/23", "Tisa,Labangon,Cebu", StatusType.APPROVED});
        table.addRow(new Object[]{"8", "12/12/23", "Tisa,Labangon,Cebu", StatusType.REJECT});
        table.addRow(new Object[]{"9", "12/12/23", "Tisa,Labangon,Cebu", StatusType.PENDING});
        table.addRow(new Object[]{"10", "12/12/23", "Tisa,Labangon,Cebu", StatusType.PENDING});
        table.addRow(new Object[]{"11", "12/12/23", "Tisa,Labangon,Cebu", StatusType.APPROVED});
        table.addRow(new Object[]{"12", "12/12/23", "Tisa,Labangon,Cebu", StatusType.APPROVED});
        table.addRow(new Object[]{"13", "12/12/23", "Tisa,Labangon,Cebu", StatusType.REJECT});
        table.addRow(new Object[]{"14", "12/12/23", "Tisa,Labangon,Cebu", StatusType.PENDING});*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panelBorder1 = new com.raven.swing.PanelBorder();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();

        setMaximumSize(new java.awt.Dimension(1177, 540));
        setMinimumSize(new java.awt.Dimension(1177, 540));
        setPreferredSize(new java.awt.Dimension(1177, 540));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Date Delivered", "Drop-off Location", "Status"
            }
        ));
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel5;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}