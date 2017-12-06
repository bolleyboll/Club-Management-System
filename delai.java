
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class delai extends javax.swing.JFrame {

    public delai() {
        initComponents();
          this.setSize(800,500);
        this.setResizable(false);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel1.setText("REMOVE A MEMBER?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 510, 48);

        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton1.setText("REMOVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 219, 87, 32);

        jButton2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton2.setText("DONE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(391, 219, 87, 32);

        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel2.setText("ENTER USN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 110, 78, 36);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 120, 193, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\miniog.jpe")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection conn = null;
   Statement stmt = null;
   String str;
   int clid=10;
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

    
    
     
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        CLUBMANAGER cb=new CLUBMANAGER();
    }//GEN-LAST:event_jButton2ActionPerformed
    
  
 
    

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}