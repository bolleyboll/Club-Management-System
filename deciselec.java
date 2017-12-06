
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class deciselec extends javax.swing.JFrame {

 
    public deciselec() {
        initComponents();
        
        this.setSize(852,277);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.focus"));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("DO U WANT TO ADD THIS PERSON TO YOUR CLUB?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 30, 500, 51);

        jButton1.setText("ACCEPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 138, 87, 32);

        jButton2.setText("REJECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(470, 132, 84, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/ink-4001-group-alternative.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 280);

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

            ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1003");

            Statement pst=null;

            rs.next();
            nam=rs.getString("name");
            us=rs.getString("USN");
            int cid=13;
            p=rs.getString("pass");

            String sql="INSERT INTO `member`(`USN`, `Name`,`CID`,`passw`) VALUES ('"+us+"','"+nam+"','"+cid+"','"+p+"')";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "MEMBER IS ADDED TO THE CLUB");

          
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
            ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1003");
            rs.next();
            us=rs.getString("USN");
            String q = "DELETE FROM `messages` WHERE USN='"+us+"'";
            st.executeUpdate(q);
    }//GEN-LAST:event_jButton2ActionPerformed
catch(Exception e){
}
        
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deciselec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
