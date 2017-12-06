
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class loginpgadmin extends javax.swing.JFrame {

    
    public loginpgadmin() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("HELLO,MANAGER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 0, 880, 90);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 60, 980, 20);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 170, 220, 26);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setText("CHOOSE CLUB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 110, 260, 50);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("USERNAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 150, 140, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(570, 154, 270, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 240, 140, 40);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 380, 210, 40);

        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 380, 220, 40);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(570, 250, 270, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\clubmgmtstyst\\src\\clubmgmtstyst\\lamps_lighting_ceiling_117880_1366x768.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 990, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          String a=(String) jComboBox1.getSelectedItem();      
        Connection conn = null;
         PreparedStatement pst=null;
      
        try{
           String us=jTextField1.getText();
           String pw=jPasswordField1.getText();
           String ar="Mark";
           String asp="Shady";
           String rob="Steve";
           String elec="Tesla";
            String sql="SELECT Name,Pass FROM `manager` m,`clubs` c WHERE m.CLUBID=C.cid and c.clbname='"+a+"'" ;
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
             rs.next();
                String chkpass=rs.getString("Pass");
                String chkusn=rs.getString("Name");
             if((us.equals(chkusn))&&(pw.equals(chkpass))){
                 JOptionPane.showMessageDialog(null,"LOGIN SUCCESFUL");
               if(us.equals(ar)){
                 this.setVisible(false);
                 CLUBMANAGER o=new CLUBMANAGER();
               }else if(us.equals(asp)){
                 this.setVisible(false);
                 Aero air=new Aero();
             }else if(us.equals(rob)){
                 this.setVisible(false);
                 robo air=new robo();
             }
               
             }else{
                 JOptionPane.showMessageDialog(null,"LOGIN Failed!");
             }
              
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        start ob=new start();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpgadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
