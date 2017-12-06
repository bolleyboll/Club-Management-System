
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class medispro extends javax.swing.JFrame {

    public medispro() {
       
        initComponents();
        this.setSize(800,400);
        this.setVisible(true);
        
        combofill();
    }
    private void combofill(){
         Connection conn = null;
         PreparedStatement pst=null;
         int no=10;
        try{
           
            String sql="SELECT pname FROM `projects` WHERE CID= '"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                String name=rs.getString("pname");
                jComboBox1.addItem(name);
              
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    
    
    
    
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(90, 140, 218, 26);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MEMBER", "USN"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 190, 640, 240);

        jButton1.setText("VIEW MEMBERS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 140, 140, 32);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 80, 0, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 80, 820, 50);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SELECT A PROJECT FROM THE LIST BELOW:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 760, 30);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\blue-black-gradient-1.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a=(String) jComboBox1.getSelectedItem();
          Connection conn = null;
        Statement pst=null;
         int no=10;
         String name=null;
         String usn=null;
        try{
           
            String sql="SELECT Distinct(pid) FROM `projects` WHERE pname='"+a+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            rs.next();
            int val=rs.getInt("pid");
           String mainq="SELECT Name,USN FROM `member` m,`projects` p WHERE ProjectID=p.pid AND m.cid=10 AND ProjectID='"+val+"'";
              pst=conn.prepareStatement(mainq);
             ResultSet rq=pst.executeQuery(mainq);
              DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            while(rq.next()){
                 name=rq.getString("Name");
                 usn=rq.getString("USN");
                 model.addRow(new Object[]{name,usn});
          
            }
          
          
           //SELECT Name,USN FROM `member` m,`projects` p WHERE ProjectID=p.pid AND m.cid=10 AND ProjectID=4000 query-2
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setVisible(false);
    CLUBMANAGER ob=new CLUBMANAGER();
   
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medispro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
