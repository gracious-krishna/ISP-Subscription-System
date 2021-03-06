/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myApplication;

import businessLayer.BLUser;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import objectFactory.User;

/**
 *
 * @author Kriss
 */
public class TestViewOffice extends javax.swing.JInternalFrame {

    /**
     * Creates new form TestViewOffice
     */
    public TestViewOffice() {
        initComponents();
        bluser = new BLUser();
        user = new User();
        
    }

    public void setUser(User usr){
        this.user = usr;
    }
    
    public void officeStaffProfile() {
        DefaultTableModel dtm = new DefaultTableModel(){

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
            
        
        try{
            dtm.addColumn("User ID");
            dtm.addColumn("Middle Name");
            
            bluser.setUser(this.user);
            ResultSet rs = bluser.selectOfficeStaffProfile();
            while(rs.next()) {
                Object ObjData[] = new Object[2];
                ObjData[0] = rs.getInt("userId");
                ObjData[1] = rs.getString("middleName");
                
                dtm.addRow(ObjData);
            }
            
            this.jTable1.setModel(dtm);
            
            JScrollPane scroll = new JScrollPane( jTable1 );
        getContentPane().add( scroll );
            JPanel panel = new JPanel();
        getContentPane().add( panel, BorderLayout.CENTER );
            //jTable1.setEnabled(false);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private businessLayer.BLUser bluser;
    private objectFactory.User user;
}
