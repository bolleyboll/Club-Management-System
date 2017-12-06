
package clubmgmtstyst;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class leavememclub extends javax.swing.JFrame {

    
    public leavememclub() {
        initComponents();
        this.setSize(804, 529);
        this.setResizable(false);
        this.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leave Club ?");
        getContentPane().setLayout(null);

        jButton1.setForeground(java.awt.SystemColor.desktop);
        jButton1.setText("Leave Club");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 370, 200, 40);

        jButton2.setForeground(java.awt.SystemColor.desktop);
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 370, 180, 40);

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

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.desktop);
        jLabel4.setText("LEAVE CLUB???");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 20, 670, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 80, 770, 20);

        jLabel5.setForeground(java.awt.SystemColor.desktop);
        jLabel5.setText("ENTER CLUB ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 250, 120, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(290, 250, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/blue-black-gradient-1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 810, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        int a=Integer.parseInt(jTextField2.getText());
        if(a==10){
            member m=new member();
        }else{
            memberaero ae=new memberaero();
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

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

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leavememclub().setVisible(true);
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
