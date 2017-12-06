
package clubmgmtstyst;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class meminfobefdel extends javax.swing.JFrame {

   
    public meminfobefdel() {
        initComponents();
        this.setSize(1080,481);
        this.setResizable(false);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("QUICK MEMBER REPLACEMENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 530, 58);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 50, 1100, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USN :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 200, 40, 30);

        jTextField1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.darcula.checkSignColor"));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(400, 190, 170, 40);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.darcula.checkSignColor"));
        jButton1.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton1.setText("REPLACE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 390, 200, 40);

        jLabel6.setText("USN:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(650, 150, 60, 30);

        jSeparator2.setBackground(java.awt.SystemColor.activeCaptionText);
        jSeparator2.setForeground(java.awt.SystemColor.activeCaptionText);
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(620, 50, 30, 430);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("OLD MEMBER'S  DETAILS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 70, 210, 40);

        jLabel7.setText("Name:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 230, 50, 30);

        jTextField3.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.darcula.checkSignColor"));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(720, 140, 170, 40);

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel9.setText("NEW MEMBER'S DETAILS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(700, 70, 210, 50);

        jTextField4.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.disabledText"));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(720, 230, 170, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/inblltmpuvkxlsdzwuzs.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-50, 240, 400, 180);

        jPasswordField1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.disabledText"));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(720, 310, 170, 40);

        jLabel4.setText("PASS:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(650, 320, 35, 16);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 130, 40);

        jLabel10.setText("CLUB ID:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 130, 60, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 130, 160, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/another_galaxy_2k.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection myco=null;
        CallableStatement stmt=null;
        String usn=jTextField1.getText();
        
        String newusn=jTextField3.getText();
        String newname=jTextField4.getText();
        String newpass=jPasswordField1.getText();
        int cid=Integer.parseInt(jTextField2.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            myco=DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull", "root", "root");
            stmt=myco.prepareCall("{call clubmemberinfocheck(?,?,?,?,?)}");
            stmt.setString(1,usn);
            stmt.setInt(2,cid);
            stmt.setString(3,newusn);
            stmt.setString(4,newname);
            stmt.setString(5,newpass);
           ResultSet rs=stmt.executeQuery();
          
           JOptionPane.showMessageDialog(null,",MEMBER REPLACEMENT SUCCESSFUL");
           this.setVisible(false);
           super.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       int a=Integer.parseInt(jTextField2.getText());
       if(a==10){
       CLUBMANAGER CB=new CLUBMANAGER();    
    }//GEN-LAST:event_jButton2ActionPerformed
       else if(a==11){
           Aero ar=new Aero();
       }else if(a==12){
           robo row=new robo();
       }else{
           elec el=new elec();
       }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new meminfobefdel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
