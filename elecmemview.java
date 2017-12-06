
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class elecmemview extends javax.swing.JFrame {

    public elecmemview() {
        initComponents();
        showuser();
        this.setSize(907,502);
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("THE MEMBER BELONGING TO YOUR CLUB ARE:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 618, 60);

        jTable1.setBackground(java.awt.Color.darkGray);
        jTable1.setForeground(java.awt.SystemColor.infoText);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 80, 453, 360);

        jButton1.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/another_galaxy_2k.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 910, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        elec ec=new elec();
    }//GEN-LAST:event_jButton1ActionPerformed

      public ArrayList<User> userlist(){
        ArrayList<User> userlist=new ArrayList<>();
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
         
           int no=13;
           Statement stmt=conn.createStatement();
           String sql= "SELECT DISTINCT USN,Name FROM `member` WHERE CID= '"+no+"'";
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
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elecmemview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
