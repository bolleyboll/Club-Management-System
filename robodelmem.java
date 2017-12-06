/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class robodelmem extends javax.swing.JDialog {

   
    public robodelmem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
     public robodelmem(){
         super();
        initComponents();
        this.setSize(839, 300);
        this.setResizable(false);
        this.setVisible(true);
   }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("REMOVE MEMBER???");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 435, 39);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 60, 830, 20);

        jLabel2.setText("ENTER THE MEMBER'S USN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 126, 180, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 130, 190, 30);

        jButton1.setText("REMOVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 222, 180, 40);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 222, 190, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\blue-black-gradient-1.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 870, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection conn = null;
   Statement stmt = null;
   String str;
   int clid=12;
   try{
       str=jTextField1.getText();
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
      stmt = conn.createStatement();
      String sql = "DELETE FROM `member` WHERE USN='"+str+"'and CID='"+clid+"'";         
     int val=stmt.executeUpdate(sql);
     if(val==0){
         JOptionPane.showMessageDialog(null,"NO SUCH MEMBER EXISTS IN THE CLUB");
     }else{
      JOptionPane.showMessageDialog(null,"MEMBER SUCCESSFULLY REMOVED FROM THE CLUB");
    }      
   }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "deletion operation failed due to"+e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       robo rob=new robo();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                robodelmem dialog = new robodelmem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
