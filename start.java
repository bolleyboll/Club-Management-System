
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class start extends javax.swing.JFrame {

   
    public start() {
        initComponents();
        this.setSize(1280,540);
        this.setResizable(false);
        this.setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(java.awt.SystemColor.menuText);
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.menu);
        jButton1.setText("JUST A VIEWER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 200, 226, 74);

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(java.awt.SystemColor.menu);
        jButton2.setText("CLUB MANAGER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 200, 228, 74);

        jButton3.setBackground(java.awt.SystemColor.menuText);
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(java.awt.SystemColor.menu);
        jButton3.setText("CLUB MEMBER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 200, 234, 74);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.menuText);
        jLabel2.setText("IDENTIFY YOURSELF...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 797, 63);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.menuText);
        jLabel3.setText("\"CLUBS ARE A USEFUL WAY FOR WORTHY ENGINEERS TO PUT THEIR APPLICATION SKILLS TO THE TEST");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 390, 1010, 70);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.menuText);
        jLabel4.setText("AND SHOULD BE PRESENT IN ALL INSTITUTIONS\"");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 460, 630, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(java.awt.SystemColor.menuText);
        jLabel6.setText("BREAKING THE ICE...");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 300, 780, 100);

        jPanel1.setBackground(java.awt.SystemColor.infoText);
        jPanel1.setLayout(null);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TOTAL NO OF PEOPLE INVOLVED:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 10, 200, 30);

        jButton4.setForeground(java.awt.Color.green);
        jButton4.setText("READ FACTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(150, 160, 130, 32);

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 20, 80, 24);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TOTAL NO OF PROJECTS:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 50, 180, 30);

        jTextField2.setEditable(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 60, 80, 24);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CLUB WITH MOST NO OF MEMBERS:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 100, 210, 40);

        jTextField3.setEditable(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 110, 80, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/facts.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(980, 0, 300, 570);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/mineral_2k.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 980, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
        loginpgadmin lg=new loginpgadmin();
       
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   outsiderview v=new outsiderview();  
   this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   
          Connection conn = null;
        Statement pst=null;
          Connection con=null;
      Statement ps=null;
        Connection co=null;
      Statement p=null;
        try{
           
            String sql="SELECT COUNT(USN) FROM member";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            rs.next();
            int tot=rs.getInt("COUNT(USN)");
            jTextField1.setText(""+tot);
          String s="SELECT COUNT(pname) FROM projects";
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
             ps=con.prepareStatement(s);
            ResultSet rq=ps.executeQuery(s);
            rq.next();
            int totp=rq.getInt("COUNT(pname)");
            jTextField2.setText(""+totp);
              String q="SELECT COUNT(*) FROM member group by cid";
          co= DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
             p=co.prepareStatement(q);
            ResultSet rz=p.executeQuery(q);
            rz.next();
            int t=rz.getInt("COUNT(*)");
            jTextField3.setText(""+t);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
              
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
       memberlog ml=new memberlog();
    }//GEN-LAST:event_jButton3ActionPerformed

  
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
