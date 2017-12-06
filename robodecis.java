/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class robodecis extends javax.swing.JDialog {

  
    public robodecis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
 public robodecis(){
        initComponents();
        this.setSize(400,400);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DO YOU WANT TO ADD THIS MEMBER TO YOUR CLUB??");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 40, 673, 46);

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ACCEPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 150, 110, 40);

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("REJECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 150, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\blue-black-gradient-1.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 920, 300);

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
    
    ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1002");   
        
         Statement pst=null;
      
         rs.next();
         nam=rs.getString("name");
         us=rs.getString("USN");
         int cid=10;
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
      ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1002");  
      rs.next();
      us=rs.getString("USN");
     String q = "DELETE FROM `messages` WHERE USN='"+us+"'";         
     st.executeUpdate(q);
    }                                        

catch(Exception e){
    
}
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                robodecis dialog = new robodecis(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
