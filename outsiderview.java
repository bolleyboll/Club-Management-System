
package clubmgmtstyst;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class outsiderview extends javax.swing.JFrame {

    public outsiderview() {
        initComponents();
        this.setSize(1020,580);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ai = new javax.swing.JRadioButton();
        rc = new javax.swing.JRadioButton();
        ac = new javax.swing.JRadioButton();
        ec = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setForeground(new java.awt.Color(152, 18, 14));
        jPanel1.setLayout(null);

        ai.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        ai.setForeground(new java.awt.Color(112, 11, 28));
        ai.setText("ARTIFICIAL INTELLIGENCE CLUB");
        ai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiActionPerformed(evt);
            }
        });
        jPanel1.add(ai);
        ai.setBounds(26, 225, 260, 28);

        rc.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        rc.setForeground(new java.awt.Color(112, 11, 28));
        rc.setText("ROBOTICS CLUB");
        rc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcActionPerformed(evt);
            }
        });
        jPanel1.add(rc);
        rc.setBounds(26, 170, 260, 28);

        ac.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        ac.setForeground(new java.awt.Color(112, 11, 28));
        ac.setText("AEROSPACE CLUB ");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        jPanel1.add(ac);
        ac.setBounds(26, 112, 260, 28);

        ec.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        ec.setForeground(new java.awt.Color(112, 11, 28));
        ec.setText("ELECTRONICS CLUB");
        ec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecActionPerformed(evt);
            }
        });
        jPanel1.add(ec);
        ec.setBounds(26, 54, 260, 28);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jButton1.setForeground(new java.awt.Color(112, 11, 28));
        jButton1.setText("CHECK IT OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(6, 320, 140, 32);

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jButton3.setForeground(new java.awt.Color(112, 11, 28));
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(217, 320, 149, 32);

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.darcula.shadowColor"));
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(108, 399, 140, 32);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(372, 0, 50, 444);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 1010, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 370, 450);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 11, 28));
        jLabel2.setText("INTERESTED IN A CLUB? ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(74, 6, 276, 38);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(112, 11, 28));
        jLabel3.setText("FILL OUT THE DETAILS BELOW AND BE A PART OF A CLUB.");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(55, 50, 416, 19);

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setForeground(new java.awt.Color(112, 11, 28));
        jLabel4.setText("NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 80, 80, 30);

        jTextField1.setBackground(new java.awt.Color(27, 22, 23));
        jTextField1.setForeground(java.awt.SystemColor.text);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(140, 70, 190, 30);

        jLabel5.setForeground(new java.awt.Color(112, 11, 28));
        jLabel5.setText("USN");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 116, 50, 20);

        jTextField2.setBackground(new java.awt.Color(27, 22, 23));
        jTextField2.setForeground(java.awt.SystemColor.text);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(140, 110, 190, 30);

        jLabel6.setForeground(new java.awt.Color(112, 11, 28));
        jLabel6.setText("MANAGER ID:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 150, 110, 30);

        jLabel7.setForeground(new java.awt.Color(112, 11, 28));
        jLabel7.setText("AN APPROPRIATE REASON AS TO WHY YOU WISH TO JOIN THE CLUB");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(6, 249, 618, 16);

        jTextField3.setBackground(new java.awt.Color(27, 22, 23));
        jTextField3.setForeground(java.awt.SystemColor.text);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 150, 190, 30);

        jt1.setBackground(new java.awt.Color(27, 22, 23));
        jt1.setColumns(20);
        jt1.setForeground(java.awt.SystemColor.text);
        jt1.setRows(5);
        jScrollPane1.setViewportView(jt1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 270, 630, 140);

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton5.setForeground(java.awt.SystemColor.desktop);
        jButton5.setText("SUBMIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(180, 410, 190, 32);

        jPasswordField1.setBackground(new java.awt.Color(27, 22, 23));
        jPasswordField1.setForeground(java.awt.SystemColor.text);
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(140, 200, 190, 30);

        jLabel10.setForeground(new java.awt.Color(112, 11, 28));
        jLabel10.setText("PASSWORD");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 200, 100, 30);

        jLabel14.setForeground(new java.awt.Color(112, 11, 28));
        jLabel14.setText("MANAGER INFO:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(460, 60, 160, 40);

        jLabel15.setForeground(new java.awt.Color(112, 11, 28));
        jLabel15.setText("ARTIFICIAL INTELLIGENCE CLUB :");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(350, 110, 190, 30);

        jLabel16.setForeground(new java.awt.Color(112, 11, 28));
        jLabel16.setText("1000");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(550, 110, 60, 30);

        jLabel17.setForeground(new java.awt.Color(112, 11, 28));
        jLabel17.setText("AEROSPACE CLUB:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(430, 140, 110, 30);

        jLabel18.setForeground(new java.awt.Color(112, 11, 28));
        jLabel18.setText("1001");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(550, 146, 28, 20);

        jLabel19.setForeground(new java.awt.Color(112, 11, 28));
        jLabel19.setText("ROBOTICS CLUB:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(440, 170, 100, 30);

        jLabel20.setForeground(new java.awt.Color(112, 11, 28));
        jLabel20.setText("1002");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(550, 170, 28, 30);

        jLabel21.setForeground(new java.awt.Color(112, 11, 28));
        jLabel21.setText("ELECTRONICS CLUB:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(420, 200, 120, 30);

        jLabel22.setForeground(new java.awt.Color(112, 11, 28));
        jLabel22.setText("1003");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(550, 206, 28, 20);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        jPanel2.add(jLabel25);
        jLabel25.setBounds(-10, 0, 640, 450);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(380, 100, 630, 450);

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabel1.setText("ELCOME TO THE WORLD OF CLUBS");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(219, 24, 666, 58);

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("W");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(162, 20, 51, 62);

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(0, 0, 156, 32);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/ink-4001-group-alternative.jpg"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 0, 1010, 100);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1010, 0);

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(208, 30, 30));
        jLabel12.setText("W");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 10, 50, 80);

        jLabel23.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel23.setForeground(java.awt.Color.cyan);
        jLabel23.setText("ELCOME TO THE WORLD OF CLUBS");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(140, 30, 820, 40);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/aeros.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 0, 1010, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed





    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(ai.isSelected()){
         this.setVisible(false);
         clbgoingons cl=new clbgoingons();
         cl.jTextArea2.setText("ARTIFICIAL INTELLIGENCE CLUB");
         cl.jLabel8.setText("MANAGER: MARK");
         cl.jLabel9.setText("MANAGER ID:1000");
        cl.about.setText("Attend our weekly meetings to learn \nabout the incredible research and \nprojects taking place at this very club.We \nalso give introductory lectures on \nMachine Learning and Artificial Intell-n\nigence.");
         int count=0,cp=0;
          Connection conn = null;
        Statement pst=null;
         int no=10;
         String mname=null;
         String pn=null;
        try{
           
            String sql="SELECT Distinct(USN),Name FROM `member` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
           
          
           while(rs.next()){
             mname=rs.getString("name");
             cl.textArea1.append(mname+"\n");
             count++;
           }
            cl.val.setText("NO OF MEMBERS:"+count);
          
       String sl="SELECT pname FROM `projects` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sl);
            ResultSet r=pst.executeQuery(sl);
           while(r.next()){
             pn=r.getString("pname");
             cl.proen.append(pn+"\n");
             cp++;
           }
           cl.jLabel7.setText("PROJECT LIST-"+cp);
            
          
          
           //SELECT Name,USN FROM `member` m,`projects` p WHERE ProjectID=p.pid AND m.cid=10 AND ProjectID=4000 query-2
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
         
      }else if(rc.isSelected()){
           this.setVisible(false);
         clbgoingons cl=new clbgoingons();
         cl.jTextArea2.setText("ROBOTICS CLUB");
         cl.jLabel8.setText("MANAGER: STEVE");
         cl.jLabel9.setText("MANAGER ID:1002");
         cl.about.setText("If you have ever secretly aspired to\n build your own robot, then the\nRobotics Club is the place for you!\nWe are a diverse group of over-\nenthused robotics nerds.Come join\nour creed!.");
         int count=0,cp=0;
          Connection conn = null;
        Statement pst=null;
         int no=12;
         String mname=null;
         String pn=null;
        try{
           
            String sql="SELECT Distinct(USN),Name FROM `member` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
           
          
           while(rs.next()){
             mname=rs.getString("name");
             cl.textArea1.append(mname+"\n");
             count++;
           }
            cl.val.setText("NO OF MEMBERS:"+count);
          
       String sl="SELECT pname FROM `projects` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sl);
            ResultSet r=pst.executeQuery(sl);
           while(r.next()){
             pn=r.getString("pname");
             cl.proen.append(pn+"\n");
             cp++;
           }
           cl.jLabel7.setText("PROJECT LIST-"+cp);
            
          
          
           //SELECT Name,USN FROM `member` m,`projects` p WHERE ProjectID=p.pid AND m.cid=10 AND ProjectID=4000 query-2
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
      }else if(ac.isSelected()){
           this.setVisible(false);
         clbgoingons cl=new clbgoingons();
         cl.jTextArea2.setText("AEROSPACE CLUB");
         cl.jLabel8.setText("MANAGER: SHADY");
         cl.jLabel9.setText("MANAGER ID:1001");
         cl.about.setText("We are a group of people who are\npassionate about Aerospace Engine-\nering. By joining our club you will ha-\nve the opportunity to work hand in h-\nand with other engineers and apply\nmany engineering principles to real\nworld problems.");
         int count=0,cp=0;
          Connection conn = null;
        Statement pst=null;
         int no=11;
         String mname=null;
         String pn=null;
        try{
           
            String sql="SELECT Distinct(USN),Name FROM `member` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
           
          
           while(rs.next()){
             mname=rs.getString("name");
             cl.textArea1.append(mname+"\n");
             count++;
           }
            cl.val.setText("NO OF MEMBERS:"+count);
          
       String sl="SELECT pname FROM `projects` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sl);
            ResultSet r=pst.executeQuery(sl);
           while(r.next()){
             pn=r.getString("pname");
             cl.proen.append(pn+"\n");
             cp++;
           }
           cl.jLabel7.setText("PROJECT LIST-"+cp);
            
          
          
           //SELECT Name,USN FROM `member` m,`projects` p WHERE ProjectID=p.pid AND m.cid=10 AND ProjectID=4000 query-2
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
      }else{
           this.setVisible(false);
         clbgoingons cl=new clbgoingons();
         cl.jTextArea2.setText("ELECTRONICS CLUB");
         cl.jLabel8.setText("MANAGER: TESLA");
         cl.jLabel9.setText("MANAGER ID:1003");
         cl.about.setText("The Electronics Club is a hobby\ngroup that aims to teach and help\npeople understand the seemingly\nincomprehensible electronic gadgets\nin the world today, and also assists\npeople in developing their own devices.");
         int count=0,cp=0;
          Connection conn = null;
        Statement pst=null;
         int no=13;
         String mname=null;
         String pn=null;
        try{
           
            String sql="SELECT Distinct(USN),Name FROM `member` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
           
          
           while(rs.next()){
             mname=rs.getString("name");
             cl.textArea1.append(mname+"\n");
             count++;
           }
            cl.val.setText("NO OF MEMBERS:"+count);
          
       String sl="SELECT pname FROM `projects` WHERE CID='"+no+"'";
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
            pst=conn.prepareStatement(sl);
            ResultSet r=pst.executeQuery(sl);
           while(r.next()){
             pn=r.getString("pname");
             cl.proen.append(pn+"\n");
             cp++;
           }
           cl.jLabel7.setText("PROJECT LIST-"+cp);
            
          
          
           //SELECT Name,USN FROM `member` m,`projects` p WHERE ProjectID=p.pid AND m.cid=10 AND ProjectID=4000 query-2
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
      } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aiActionPerformed
        if(ai.isSelected()){
            ac.setSelected(false);
            rc.setSelected(false);
            ec.setSelected(false);
        }
    }//GEN-LAST:event_aiActionPerformed

    private void rcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcActionPerformed
        if(rc.isSelected()){
            ac.setSelected(false);
            ec.setSelected(false);
            ai.setSelected(false);
        }
    }//GEN-LAST:event_rcActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        if(ac.isSelected()){
            ec.setSelected(false);
            rc.setSelected(false);
            ai.setSelected(false);
        }
    }//GEN-LAST:event_acActionPerformed

    private void ecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecActionPerformed
        if(ec.isSelected()){
            ac.setSelected(false);
            rc.setSelected(false);
            ai.setSelected(false);
        }
    }//GEN-LAST:event_ecActionPerformed
  
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           ac.setSelected(false);
            rc.setSelected(false);
            ai.setSelected(false);   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   
       String n=jTextField1.getText();
       String u=jTextField2.getText();
      int m=Integer.parseInt(jTextField3.getText());
      String ms=jt1.getText();
      String pasw=jPasswordField1.getText();
 
            Connection conn = null;
         PreparedStatement pst=null;
      
   try{
   String sql="INSERT INTO `messages`(`USN`, `mid`, `mess`,`name`,`pass`) VALUES (?,?,?,?,?)";
   Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
   pst=conn.prepareStatement(sql);
   pst.setString(1,u);
   pst.setInt(2,m);
   pst.setString(3,ms);
   pst.setString(4,n);
   pst.setString(5,pasw);
   pst.execute();
   JOptionPane.showMessageDialog(null,"YOUR MESSAGE HAS BEEN SENT TO THE RESPECTIVE MANAGER");
}
   catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
   } 
              
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setVisible(false);
       start ob=new start();
    }//GEN-LAST:event_jButton4ActionPerformed


    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new outsiderview().setVisible(true);
            }
        });

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton ac;
    public javax.swing.JRadioButton ai;
    public javax.swing.JRadioButton ec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea jt1;
    public javax.swing.JRadioButton rc;
    // End of variables declaration//GEN-END:variables
}
