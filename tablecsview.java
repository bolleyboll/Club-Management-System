
package clubmgmtstyst;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class tablecsview extends javax.swing.JFrame {
    public tablecsview() {
     initComponents();
     this.setSize(800,500);
     this.setVisible(true);
     showuser();
    }   

    public ArrayList<User> userlist(){
        ArrayList<User> userlist=new ArrayList<>();
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
         
           int no=10;
           Statement stmt=conn.createStatement();
           String sql= "SELECT DISTINCT USN,NAME FROM `member` WHERE CID= '"+no+"'";
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${background}"), this, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true)));
        jTable1.setForeground(java.awt.SystemColor.infoText);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "NAME"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 170, 453, 380);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jLabel2.setText("MEMBERS OF THE CLUB ARE:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 60, 740, 80);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 190, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\a_new_beginning_ver2_2k.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 570);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        CLUBMANAGER cb=new CLUBMANAGER();
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void setup(){

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablecsview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
