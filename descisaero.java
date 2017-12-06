
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class descisaero extends javax.swing.JFrame {

   
    public descisaero() {
        initComponents();
        this.setSize(753,300);
        this.setResizable(false);
        this.setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("DO U WISH TO ADD THIS MEMBER TO YOUR CLUB???");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(87, 28, 660, 53);

        jButton1.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton1.setText("ACCEPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 150, 110, 40);

        jButton2.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton2.setText("REJECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 150, 110, 40);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 100, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/club2.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Connection conn = null;
         Statement st=null;
         String checkpass=null;
   
      
   try{
  
   Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
    st=conn.createStatement();
    String nam=null;
    String us=null;
    String in=null;
    String p=null;
    
    ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1001");   
        
         Statement pst=null;
      
         rs.next();
         nam=rs.getString("name");
         us=rs.getString("USN");
         int cid=11;
         p=rs.getString("pass");
   String sql="INSERT INTO `member`(`USN`, `Name`,`CID`,`passw`) VALUES ('"+us+"','"+nam+"','"+cid+"','"+p+"')";
  
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
  
    st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null, "MEMBER IS ADDED TO THE CLUB");
    
   //String q = "DELETE FROM `messages` WHERE USN='"+us+"'";         
  // st.executeUpdate(q);
   }catch(Exception e){
   
  
      JOptionPane.showMessageDialog(null,e);
  
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              Connection conn = null;
         Statement st=null;
       try{
       String us=null;
     Class.forName("com.mysql.jdbc.Driver");
     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
     st=conn.createStatement();
      ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1001");  
      rs.next();
      us=rs.getString("USN");
     String q = "DELETE FROM `messages` WHERE USN='"+us+"'";         
     st.executeUpdate(q);
    }                                        

catch(Exception e){
       JOptionPane.showMessageDialog(null,e);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        msgaero obj=new msgaero(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new descisaero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
