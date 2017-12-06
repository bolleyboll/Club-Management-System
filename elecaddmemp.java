
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class elecaddmemp extends javax.swing.JFrame {

  
    public elecaddmemp() {
        initComponents();
          this.setSize(700,500);
        this.setResizable(false);
        this.setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usnfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pidfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 9, 9));
        jLabel1.setText("ASSIGNING MEMBERS TO THE PROJECT?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 700, 59);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 60, 700, 20);
        getContentPane().add(usnfield);
        usnfield.setBounds(280, 140, 230, 40);

        jLabel2.setText("ENTER THE MEMBER'S USN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 210, 30);

        jLabel4.setText("PROJECT ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 250, 170, 30);
        getContentPane().add(pidfield);
        pidfield.setBounds(280, 240, 230, 40);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 390, 130, 32);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 390, 130, 32);

        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 390, 120, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/another_galaxy_2k.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 830, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = null;
      boolean flag=false;
        PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull", "root", "root");

            String f = usnfield.getText();

            int id = Integer.parseInt(pidfield.getText());
            int no = 11;
            int cond = 0;
            String usn = usnfield.getText();
            String rclubcheck = "SELECT `cid` FROM `member` WHERE USN='" + usn + "'";
            ResultSet cid;
            Statement save = conn.createStatement();
            cid = save.executeQuery(rclubcheck);
            cid.next();
            int club = cid.getInt("CID");
            System.out.println(club);
            String s = "SELECT DISTINCT `pid` FROM `projects` where cid='" + club + "'";
            cid = save.executeQuery(s);
            while (cid.next()) {
                if (cid.getInt("pid") == Integer.parseInt(pidfield.getText())) {
                 flag=true;
                break;
                }
            }if(flag){
                   String ins = "INSERT INTO `member`(`USN`, `Name`, `CID`,`ProjectID`,`passw`) VALUES (?,?,11,?,?)";
                    PreparedStatement ps = null;
                    String e = "SELECT `passw`,`Name` FROM `member` WHERE USN='" + f + "'";
                    ResultSet aq = save.executeQuery(e);
                    aq.next();
                    String req = aq.getString("passw");
                    String reqn = aq.getString("Name");

                    ps = conn.prepareStatement(ins);
                    ps.setString(1, usnfield.getText());
                    ps.setString(2, reqn);
                    ps.setString(3, pidfield.getText());
                    ps.setString(4, req);
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Added"); 
            }
            else {
                    JOptionPane.showMessageDialog(null, "Incorrect Input");
                   
                }
            }
            

         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
         }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        elec el=new elec();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        usnfield.setText(null);

        pidfield.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(elecaddmemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elecaddmemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elecaddmemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elecaddmemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elecaddmemp().setVisible(true);
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
    private javax.swing.JTextField pidfield;
    private javax.swing.JTextField usnfield;
    // End of variables declaration//GEN-END:variables
}
