
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class memberlog extends javax.swing.JFrame {

   
    public memberlog() {
        initComponents();
        this.setSize(900,500);
        this.setResizable(false);
        this.setVisible(true);
        combofill();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("MEMBER LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 285, 47);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 60, 740, 20);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(80, 130, 180, 26);

        jLabel2.setText("ENTER USN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 170, 110, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(400, 164, 170, 30);

        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 236, 80, 30);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 340, 110, 40);

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 340, 110, 40);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 110, 32);

        jLabel4.setText("WHICH CLUB?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 80, 120, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(400, 232, 170, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 890, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     this.setVisible(false);
     start ob=new start();
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextField1.setText(null);
      jPasswordField1.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String a=(String) jComboBox1.getSelectedItem();
      System.out.println(a);
      boolean success=false;
         Connection c= null;
         PreparedStatement p=null;
      
        try{
           String us=jTextField1.getText();
           String pw=jPasswordField1.getText();
       
            String sql="SELECT USN,passw FROM `Member` m,`clubs` c WHERE c.cid=m.CID AND c.clbname='"+a+"'";
            
              Class.forName("com.mysql.jdbc.Driver");
           
              c=DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
                
            p=c.prepareStatement(sql);
            
            ResultSet rs=p.executeQuery();
             //rs.next();
             while(rs.next()){
              String chkusn=rs.getString("USN");
              
                String chkpass=rs.getString("passw");
             if((us.equals(chkusn))&&(pw.equals(chkpass))){
                 success=true;
               
                 break;
             } 
             }
             
             System.out.println(success);
             if(success==true){
                   JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFULL");
                   this.setVisible(false);
                if(a.equals("ai")){
                   member m=new member();
             }else if(a.equals("Aerospace club")){
             
                 memberaero mm=new memberaero();
            
             
             }else{
                 JOptionPane.showMessageDialog(null,"LOGIN FAILED");
             }
                
        }}catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
      private void combofill(){
         Connection conn = null;
         PreparedStatement pst=null;
      
        try{
           
            String sql="SELECT clbname FROM `clubs` WHERE 1";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                String name=rs.getString("clbname");
                jComboBox1.addItem(name);
              
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }    
      
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new memberlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
