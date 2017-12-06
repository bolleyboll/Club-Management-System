
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class roboaddpro extends javax.swing.JFrame {

   
    public roboaddpro() {
        initComponents();
         this.setSize(847,449);
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
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.desktop);
        jLabel1.setText("START A NEW PROJECT???");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(92, 35, 730, 58);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 90, 1080, 20);

        jLabel2.setForeground(java.awt.SystemColor.desktop);
        jLabel2.setText("NAME OF THE PROJECT:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 160, 160, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 160, 240, 24);

        jLabel3.setForeground(java.awt.SystemColor.desktop);
        jLabel3.setText("PROJECT ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 236, 120, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(310, 234, 240, 30);

        jButton1.setForeground(java.awt.SystemColor.desktop);
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 342, 110, 40);

        jButton2.setForeground(java.awt.SystemColor.desktop);
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 340, 100, 40);

        jButton3.setForeground(java.awt.SystemColor.desktop);
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 340, 100, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\blue-black-gradient-1.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1120, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection conn = null;
         PreparedStatement pst=null;
      
     try{    
     
   String sql="INSERT INTO `projects`(`pname`, `pid`, `CID`) VALUES (?,?,12)";
   Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
   pst=conn.prepareStatement(sql);
   pst.setString(1,jTextField1.getText());
   pst.setInt(2,Integer.parseInt(jTextField2.getText()));  
   pst.execute();
     JOptionPane.showMessageDialog(null, "NEW PROJECT CREATED");
  }
   catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex);
   }

                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          this.setVisible(false);
          robo aro=new robo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jTextField1.setText(null);
     jTextField2.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roboaddpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
