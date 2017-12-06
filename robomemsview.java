
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class robomemsview extends javax.swing.JFrame {

    
    public robomemsview() {
        initComponents();
        showuser();
        this.setSize(800,500);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("FangSong", 3, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.infoText);
        jLabel1.setText("THE MEMBERS BELONGING TO YOUR CLUB ARE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 670, 71);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 100, 453, 400);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 90, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/beasts_2k.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        robo rb=new robo();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new robomemsview().setVisible(true);
            }
        });
    }
     public ArrayList<User> userlist(){
        ArrayList<User> userlist=new ArrayList<>();
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
         
           int no=12;
           Statement stmt=conn.createStatement();
           String sql= "SELECT * FROM `member` WHERE CID= '"+no+"'";
             ResultSet rs=stmt.executeQuery(sql);
             User user;
             while(rs.next()){
                 user=new User(rs.getString("USN"),rs.getString("Name"));
                 userlist.add(user);
             }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       return userlist;
    }
      public void showuser(){
        ArrayList<User> list=userlist();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getname();
            row[1]=list.get(i).getusn();
            model.addRow(row);
        }
      }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
