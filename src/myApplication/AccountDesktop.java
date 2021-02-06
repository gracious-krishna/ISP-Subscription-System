/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myApplication;

import objectFactory.User;
import javax.swing.JOptionPane;
import objectFactory.Rating;

/**
 *
 * @author Kriss
 */
public class AccountDesktop extends javax.swing.JFrame {

    /**
     * Creates new form AccountDesktop
     */
    public AccountDesktop() {
        super("Account Desktop");
        initComponents();
        this.user = new User();
    }

    public void setUser(User usr) {
        this.user = usr;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menu_logOut = new javax.swing.JMenuItem();
        menu_exit = new javax.swing.JMenuItem();
        menu_view = new javax.swing.JMenu();
        menu_viewAccountData1 = new javax.swing.JMenuItem();
        menu_viewPi_chart1 = new javax.swing.JMenuItem();
        menu_input_Data = new javax.swing.JMenu();
        menu_payAccount = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 700));

        menu_file.setMnemonic('f');
        menu_file.setText("File");

        menu_logOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menu_logOut.setText("Log out");
        menu_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logOutActionPerformed(evt);
            }
        });
        menu_file.add(menu_logOut);

        menu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menu_exit.setMnemonic('x');
        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        menu_file.add(menu_exit);

        menuBar.add(menu_file);

        menu_view.setText("View");

        menu_viewAccountData1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        menu_viewAccountData1.setText("Account Data");
        menu_viewAccountData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_viewAccountData1ActionPerformed(evt);
            }
        });
        menu_view.add(menu_viewAccountData1);

        menu_viewPi_chart1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menu_viewPi_chart1.setText("Rating");
        menu_viewPi_chart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_viewPi_chart1ActionPerformed(evt);
            }
        });
        menu_view.add(menu_viewPi_chart1);

        menuBar.add(menu_view);

        menu_input_Data.setText("Data");

        menu_payAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menu_payAccount.setText("Pay Account");
        menu_payAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_payAccountActionPerformed(evt);
            }
        });
        menu_input_Data.add(menu_payAccount);

        menuBar.add(menu_input_Data);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logOutActionPerformed
        // TODO add your handling code here:
        this.dispose();//setVisible(false);
        LoginForm1 lf = new LoginForm1();
        lf.setVisible(true);
    }//GEN-LAST:event_menu_logOutActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you really want to exit the program?", null, 2);
        if (option == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
        else {
            JOptionPane.getRootFrame();//setVisible(false);
        }
    }//GEN-LAST:event_menu_exitActionPerformed

    private void menu_viewAccountData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_viewAccountData1ActionPerformed
        ViewAccountData vad = new ViewAccountData();
        desktopPane.add(vad);
        //vad.setAccount(account);
        vad.setVisible(true);
        vad.viewAccountData();
    }//GEN-LAST:event_menu_viewAccountData1ActionPerformed

    private void menu_payAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_payAccountActionPerformed
        // TODO add your handling code here:
        //PayAccount pa = new PayAccount();
        PaySubscribedAccount pa = new PaySubscribedAccount();
        desktopPane.add(pa);
        //pa.setAccount(account);
        pa.setVisible(true);
        pa.viewAccountData();
        
    }//GEN-LAST:event_menu_payAccountActionPerformed

    private void menu_viewPi_chart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_viewPi_chart1ActionPerformed
        // TODO add your handling code here:
        ViewRating vpc = new ViewRating();
        Rating rating = new Rating();
        vpc.setRating(rating);
        vpc.drawPi_chart();      
        
    }//GEN-LAST:event_menu_viewPi_chart1ActionPerformed

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
            java.util.logging.Logger.getLogger(AccountDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenu menu_input_Data;
    private javax.swing.JMenuItem menu_logOut;
    private javax.swing.JMenuItem menu_payAccount;
    private javax.swing.JMenu menu_view;
    private javax.swing.JMenuItem menu_viewAccountData1;
    private javax.swing.JMenuItem menu_viewPi_chart1;
    // End of variables declaration//GEN-END:variables

    private objectFactory.User user;
    private businessLayer.BLUser blUser;
    private objectFactory.Account account;
    private businessLayer.BLAccount blaccount;
}
