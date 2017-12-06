package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class msgbai extends javax.swing.JFrame {

    public msgbai() {
        initComponents();
         jTextArea1.setEditable(false);
         jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        this.setSize(1360,750);
        this.setTitle("Messages");
        this.setResizable(false);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clr1 = new javax.swing.JButton();
        ne1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1360, 768));
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 430, 490, 170);

        clr1.setBackground(new java.awt.Color(0, 0, 0));
        clr1.setForeground(new java.awt.Color(204, 0, 0));
        clr1.setText("CLEAR");
        clr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr1ActionPerformed(evt);
            }
        });
        getContentPane().add(clr1);
        clr1.setBounds(450, 650, 90, 32);

        ne1.setBackground(new java.awt.Color(0, 0, 0));
        ne1.setForeground(new java.awt.Color(204, 0, 0));
        ne1.setText("CHECK");
        ne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ne1ActionPerformed(evt);
            }
        });
        getContentPane().add(ne1);
        ne1.setBounds(830, 650, 90, 32);

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("FROM USN:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 390, 90, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(500, 390, 120, 24);

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(770, 390, 40, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(810, 390, 120, 24);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 650, 90, 32);

        jLabel1.setBackground(new java.awt.Color(12, 11, 10));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel1.setText("MESSAGE BOX:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 80, 830, 90);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(180, 170, 770, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\clubmgmtstyst\\src\\clubmgmtstyst\\messenger.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr1ActionPerformed
      Connection conn = null;
        Statement st=null;
        
        try{ 
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            st=conn.createStatement();
            String nam=null;
            String us=null;
            String in=null;
            ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1000");
            rs.next();
            if(rs.next()){
              decis d=new decis();    
              jTextField3.setText(null);
              jTextField4.setText(null);
              jTextArea1.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null,"WE AGREE THAT THE JBUTTONS ARE PRETTY ATTRACTIVE BUT PLEASE GET A HOLD OF YOURSELF!");
            }
         }catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
         }      
    }//GEN-LAST:event_clr1ActionPerformed

    private void ne1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       {//GEN-FIRST:event_ne1ActionPerformed
       
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
    ResultSet rs=st.executeQuery("SELECT * FROM `messages` WHERE mid=1000");         
         if(rs.next()){
         nam=rs.getString("name");
         us=rs.getString("USN");
         in=rs.getString("mess");
         jTextField3.setText(us);
         jTextField4.setText(nam);
         jTextArea1.setText(in);
    }
         else{
               JOptionPane.showMessageDialog(null,"NO MESSAGES LEFT TO READ");
         }
   }
   
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);
   }
    

    }//GEN-LAST:event_ne1ActionPerformed

    }  
   
   
   
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       {
    this.setVisible(false);
    CLUBMANAGER n=new CLUBMANAGER();
    }

    }//GEN-LAST:event_jButton1ActionPerformed

 
   
   
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new msgbai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JButton ne1;
    // End of variables declaration//GEN-END:variables
}
