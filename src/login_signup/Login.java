/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_signup;

import admin.admin;
import dao.AdminDAO;
import dao.UserDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Admin;
import model.User;
import util.Authentication;

/**
 *
 * @author sukay
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
//        jButton1.setBorder(new EmptyBorder(10,10,10,10));
        //jButton1.setBackground(Color.red);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        visible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-ibooks-250.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Sitka Text", 2, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LIBRARY BOOKS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("copyright © company name All rights reserved");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 630));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 34, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN\n");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Phone_Number : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Password :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 24));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-phone-30.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 358, -1, -1));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-invisible-30.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jCheckBox2.setText(" Remember Password");
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel9.setText("Forget Password ?");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 419, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 384, -1));

        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-eye-30.png"))); // NOI18N
        visible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibleMouseClicked(evt);
            }
        });
        jPanel2.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 510, 630));

        setSize(new java.awt.Dimension(989, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        // TODO add your handling code here:
        jPasswordField2.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        visible.setEnabled(true);
        visible.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleMouseClicked
        // TODO add your handling code here:
        jPasswordField2.setEchoChar((char) 8270);
        disable.setVisible(true);
        disable.setEnabled(true);
        visible.setEnabled(false);
        visible.setEnabled(false);
    }//GEN-LAST:event_visibleMouseClicked

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
        SignUp sign = new SignUp();
        sign.setVisible(true);

    }//GEN-LAST:event_SignUpActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String phone = jCTextField1.getText(); 
        String password = String.valueOf(Authentication.getMd5Password(new String(jPasswordField2.getPassword())));
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        UserDAO userDAO = new UserDAO();
        User user = userDAO.findUserByPhoneNo(phone);
        AdminDAO adminDao = new AdminDAO();
        Admin admin = adminDao.findUserByPhoneNoForReg(phone);
        if (user != null && user.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(frame, "Đăng nhập thành công");
           
            
        } else if (admin != null && admin.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(frame, "Admin đăng nhập!");
          
            admin ad = new admin();
            ad.setVisible(true);
            dispose();
            

        } else {
               JOptionPane.showMessageDialog(frame, "Mật khẩu hoặc tài khoản chưa chính xác");
        }


    }//GEN-LAST:event_loginActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel visible;
    // End of variables declaration//GEN-END:variables
}