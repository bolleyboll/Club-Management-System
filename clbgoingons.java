
package clubmgmtstyst;


public class clbgoingons extends javax.swing.JFrame {

    
    public clbgoingons() {
        initComponents();
         this.setSize(1050,600);
        this.setVisible(true);
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        proen = new java.awt.TextArea();
        atlas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        labn = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        val = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        about = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PROJECT LIST:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 180, 170, 50);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 230, 60);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 80, 230, 50);

        proen.setBackground(new java.awt.Color(51, 51, 51));
        proen.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(proen);
        proen.setBounds(30, 270, 160, 280);

        atlas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        jPanel1.add(atlas);
        atlas.setBounds(0, 0, 230, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(830, 0, 230, 580);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jScrollPane1.setViewportView(jTextPane1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(230, 190, 140, 340);

        labn.setBackground(new java.awt.Color(0, 0, 0));
        labn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labn.setForeground(new java.awt.Color(255, 255, 255));
        labn.setText("MEMBERS IN THE CLUB:");
        jPanel2.add(labn);
        labn.setBounds(10, 109, 170, 50);

        textArea1.setBackground(new java.awt.Color(51, 51, 51));
        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textArea1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(textArea1);
        textArea1.setBounds(20, 170, 160, 310);

        val.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        val.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(val);
        val.setBounds(10, 60, 190, 40);

        jButton1.setText("GO BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(0, 0, 210, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 210, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 210, 500);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel2.setText("JOIN THE CLUB ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 490, 450, 80);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("BOUT  US ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 70, 190, 60);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel5.setText("A");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 80, 41, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel6.setText("KEEP CALM AND ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 430, 510, 60);

        about.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        about.setColumns(20);
        about.setFont(new java.awt.Font("Dotum", 0, 36)); // NOI18N
        about.setRows(5);
        jScrollPane4.setViewportView(about);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(210, 150, 620, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 80, 620, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(210, 430, 620, 150);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 830, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(20, 170, 453, 403);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        outsiderview os=new outsiderview();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clbgoingons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea about;
    private javax.swing.JLabel atlas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextArea jTextArea2;
    public javax.swing.JTextPane jTextPane1;
    public javax.swing.JLabel labn;
    public java.awt.TextArea proen;
    public java.awt.TextArea textArea1;
    public javax.swing.JLabel val;
    // End of variables declaration//GEN-END:variables
}
