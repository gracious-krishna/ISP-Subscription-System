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
import javax.swing.table.DefaultTableModel;
import objectFactory.User;


/**
 *
 * @author Kriss
 */
public class ViewClientProfile extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewClientProfile1
     */
    public ViewClientProfile() {
        super("Client Profile");
        initComponents();
        bluser = new BLUser();
        user = new User();
        
    }

    public void setUser(User usr){
        this.user = usr;
    }
    
    public void viewClientProfile() {
        DefaultTableModel dtm = new DefaultTableModel(){

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        
        try{
            dtm.addColumn("User ID");
            dtm.addColumn("Username");
            dtm.addColumn("First Name");
            dtm.addColumn("Middle Name");
            dtm.addColumn("Last Name");
            dtm.addColumn("Block Code");
            dtm.addColumn("Street Name");
            dtm.addColumn("City Code");
            dtm.addColumn("City Name");
            dtm.addColumn("Telephone");
            dtm.addColumn("Email");
            dtm.addColumn("Status");
            
            bluser.setUser(this.user);
            ResultSet rs = bluser.selectClientProfile();//.selectOfficeStaffProfile();
            while(rs.next()) {
                Object ObjData[] = new Object[12];
                ObjData[0] = rs.getInt("userId");
                ObjData[1] = rs.getString("username");
                ObjData[2] = rs.getString("firstName");
                ObjData[3] = rs.getString("middleName");
                ObjData[4] = rs.getString("lastName");
                ObjData[5] = rs.getString("blockCode");
                ObjData[6] = rs.getString("streetName");
                ObjData[7] = rs.getString("cityCode");
                ObjData[8] = rs.getString("cityName");
                ObjData[9] = rs.getString("telephone");
                ObjData[10] = rs.getString("email");
                ObjData[11] = rs.getString("status");
                
                dtm.addRow(ObjData);
            }
            this.jTable1.setModel(dtm);
        

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

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 204, 255));
        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1265, 643));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1265, 652));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private businessLayer.BLUser bluser;
    private objectFactory.User user;
}
