
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class elecmemins extends javax.swing.JFrame {

   
    public elecmemins() {
        initComponents();
         this.setSize(1050,500);
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
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENTER THE MEMBER'S DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 468, 72);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 70, 990, 30);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 150, 90, 30);

        jTextField1.setBackground(java.awt.SystemColor.windowText);
        jTextField1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 140, 200, 40);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(96, 250, 50, 30);

        jTextField2.setBackground(java.awt.SystemColor.windowText);
        jTextField2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 240, 200, 40);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PASSWORD:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 350, 100, 30);

        jPasswordField1.setBackground(java.awt.SystemColor.windowText);
        jPasswordField1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(190, 342, 210, 40);

        jButton1.setBackground(java.awt.SystemColor.windowText);
        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 430, 200, 40);

        jButton2.setBackground(java.awt.SystemColor.windowText);
        jButton2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jButton2.setText("DONE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 430, 200, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("\"IF  EVERYONE IS MOVING FORWARD TOGETHER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 140, 610, 50);

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(",THEN SUCCESS TAKES CARE OF ITSELF\"");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 190, 510, 40);

        jLabel7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\blue-black-gradient-1.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1060, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Connection conn = null;
         PreparedStatement pst=null;
      
   try{
   String sql="INSERT INTO `member`(`USN`,`Name`,`CID`,`passw`) VALUES (?,?,13,?)";
   Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
   pst=conn.prepareStatement(sql);
   pst.setString(1,jTextField1.getText());
   pst.setString(2,jTextField2.getText());
   pst.setString(3,jPasswordField1.getText());
   pst.execute();
     JOptionPane.showMessageDialog(null, "MEMBER SUCCESSFULLY ADDED!");
  
   }catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex);
          
   }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
       elec e=new elec();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elecmemins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
