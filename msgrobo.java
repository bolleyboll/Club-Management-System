package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class msgrobo extends javax.swing.JFrame {

   
    public msgrobo() {
        initComponents();
        jTextArea1.setEditable(false);
         jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        this.setSize(1000,630);
        this.setTitle("Messages");
        this.setResizable(false);
        this.setVisible(true);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.windowText);
        jLabel1.setText("USN:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 260, 82, 31);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(450, 260, 160, 24);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.windowText);
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(750, 260, 90, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(800, 260, 150, 24);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTextArea1.setForeground(java.awt.SystemColor.textText);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 300, 520, 250);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.windowText);
        jLabel3.setText("MESSAGE BOX");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 50, 770, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(130, 110, 1030, 20);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.windowText);
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 550, 120, 40);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(java.awt.SystemColor.windowText);
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(630, 550, 110, 40);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(java.awt.SystemColor.windowText);
        jButton3.setText("CHECK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(790, 550, 110, 40);

        jLabel4.setForeground(java.awt.SystemColor.windowText);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/messenger.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     robodecis rd=new robodecis();         
     jTextArea1.setText(null);
     jTextField1.setText(null);
     jTextField2.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       robo roo=new robo();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1002");         
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

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new msgrobo().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
