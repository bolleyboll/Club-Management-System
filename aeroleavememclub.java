/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class aeroleavememclub extends javax.swing.JFrame {

    /**
     * Creates new form aeroleavememclub
     */
    public aeroleavememclub() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.desktop);
        jLabel4.setText("LEAVE CLUB???");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 20, 670, 60);

        jLabel1.setForeground(java.awt.SystemColor.desktop);
        jLabel1.setText("Enter USN to confirm:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 100, 130, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 104, 280, 30);

        jLabel2.setForeground(java.awt.SystemColor.desktop);
        jLabel2.setText("ENTER PASSWORD TO CONFIRM:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 190, 190, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(290, 190, 200, 30);

        jButton1.setForeground(java.awt.SystemColor.desktop);
        jButton1.setText("Leave Club");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 310, 200, 40);

        jButton2.setForeground(java.awt.SystemColor.desktop);
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 310, 180, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1024, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        Connection conn = null;
        Statement stmt = null;
        String str;
        PreparedStatement ps = null;
        try {
            str = jTextField1.getText();
            String c=jPasswordField1.getText();
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull", "root", "root");
            stmt = conn.createStatement();
            String sql = "DELETE FROM `member` WHERE USN='"+str+"' AND passw='"+c+"'";
            stmt.executeUpdate(sql);
            this.setVisible(false);
            start page=new start();

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Removal failed due to" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        memberaero z=new memberaero();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(aeroleavememclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aeroleavememclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aeroleavememclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aeroleavememclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aeroleavememclub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
