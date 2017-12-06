
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class msgelec extends javax.swing.JFrame {

   
    public msgelec() {
        initComponents();
        jTextArea1.setEditable(false);
         jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        this.setSize(1020,561);
        this.setTitle("Messages");
        this.setResizable(false);
        this.setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("MESSAGE BOX");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 750, 74);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-10, 70, 1000, 30);

        jTextField1.setBackground(javax.swing.UIManager.getDefaults().getColor("Desktop.background"));
        jTextField1.setFont(new java.awt.Font("MS Mincho", 3, 18)); // NOI18N
        jTextField1.setForeground(java.awt.SystemColor.activeCaptionText);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(450, 240, 150, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel2.setText("USN:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 240, 60, 30);

        jTextField2.setBackground(javax.swing.UIManager.getDefaults().getColor("Desktop.background"));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(800, 240, 150, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 240, 50, 30);

        jButton4.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(470, 480, 110, 40);

        jButton5.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 480, 110, 40);

        jButton3.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton3.setText("CHECK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(780, 480, 120, 40);

        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("Desktop.background"));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 280, 460, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/messenger.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1020, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        elec eb=new elec();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection conn = null;
        Statement st=null;
        String checkpass=null;
        // int count=0;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            st=conn.createStatement();
            String nam=null;
            String us=null;
            String in=null;
            ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1003");
            if(rs.next()){
                nam=rs.getString("name");
                us=rs.getString("USN");
                in=rs.getString("mess");
                jTextField1.setText(us);
                jTextField2.setText(nam);
                jTextArea1.setText(in);
            }
            else{
                JOptionPane.showMessageDialog(null,"NO MESSAGES LEFT TO READ");
            }
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
          Connection conn = null;
        Statement st=null;
        
        try{ 
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            st=conn.createStatement();
            String nam=null;
            String us=null;
            String in=null;
            ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1003");
            rs.next();
            if(rs.next()){
         deciselec de=new deciselec();
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextArea1.setText(null);
        System.out.println("y i run?");
            }
            else{
                JOptionPane.showMessageDialog(null,"WE AGREE THAT THE JBUTTONS ARE PRETTY ATTRACTIVE BUT PLEASE GET A HOLD OF YOURSELF!");
            }
         }catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
         }      
    }//GEN-LAST:event_jButton4ActionPerformed

   
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
            java.util.logging.Logger.getLogger(msgelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(msgelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(msgelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(msgelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new msgelec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
