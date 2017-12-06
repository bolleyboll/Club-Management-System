
package clubmgmtstyst;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class insmem extends javax.swing.JDialog {

    public insmem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public insmem(){
        initComponents();
        this.setSize(700,500);
        this.setResizable(false);
        this.setVisible(true);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jf1 = new javax.swing.JTextField();
        jf2 = new javax.swing.JTextField();
        jf3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbs = new javax.swing.JButton();
        exi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 40, 32));
        jLabel1.setText("USN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 120, 130, 29);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 31, 31));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 170, 130, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(26, 207, 0, 0);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(189, 31, 31));
        jLabel4.setText("password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 220, 100, 32);

        jf1.setForeground(new java.awt.Color(189, 31, 31));
        jf1.setText("ENTER");
        jf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf1ActionPerformed(evt);
            }
        });
        getContentPane().add(jf1);
        jf1.setBounds(130, 120, 160, 24);

        jf2.setForeground(new java.awt.Color(189, 31, 31));
        jf2.setText("ENTER");
        jf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf2ActionPerformed(evt);
            }
        });
        getContentPane().add(jf2);
        jf2.setBounds(130, 170, 160, 24);

        jf3.setForeground(new java.awt.Color(189, 31, 31));
        jf3.setText("ENTER ");
        jf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf3ActionPerformed(evt);
            }
        });
        getContentPane().add(jf3);
        jf3.setBounds(130, 220, 160, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 51, 51));
        jLabel5.setText("ENTER MEMBER DETAILS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(63, 20, 500, 33);

        jbs.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbs.setForeground(new java.awt.Color(189, 31, 31));
        jbs.setText("SUBMIT");
        jbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsActionPerformed(evt);
            }
        });
        getContentPane().add(jbs);
        jbs.setBounds(70, 390, 200, 40);

        exi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exi.setForeground(new java.awt.Color(189, 31, 31));
        exi.setText("DONE");
        exi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exiActionPerformed(evt);
            }
        });
        getContentPane().add(exi);
        exi.setBounds(370, 390, 210, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\"It takes two flints to make a fire.\"");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 140, 470, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\mini.jpe")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 780, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf1ActionPerformed

    private void jbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsActionPerformed
         Connection conn = null;
         PreparedStatement pst=null;
      
   try{
   String sql="INSERT INTO `member`(`USN`, `Name`, `CID`,`passw`) VALUES (?,?,10,?)";
   Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
   pst=conn.prepareStatement(sql);
   pst.setString(1,jf1.getText());
   pst.setString(2,jf2.getText());
   
  
   pst.setString(3,jf3.getText());
   
   pst.execute();
     JOptionPane.showMessageDialog(null, "DATA INSERTED SUCCESSFULLY");
  
  
   }catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex);
          
   } 
   
    }//GEN-LAST:event_jbsActionPerformed

    private void jf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf2ActionPerformed

    private void jf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf3ActionPerformed

    private void exiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exiActionPerformed
         setVisible(false);
         CLUBMANAGER ob=new CLUBMANAGER();
         
    }//GEN-LAST:event_exiActionPerformed

    
    public static void open() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                insmem dialog = new insmem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbs;
    private javax.swing.JTextField jf1;
    private javax.swing.JTextField jf2;
    private javax.swing.JTextField jf3;
    // End of variables declaration//GEN-END:variables
}
