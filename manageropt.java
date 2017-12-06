
package clubmgmtstyst;


public class manageropt extends javax.swing.JFrame {

  
    public manageropt() {
        initComponents();
        this.setVisible(true);
        this.setSize(740,490);
        this.setResizable(false);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.desktop);
        jLabel1.setText("WHICH CLUB DO YOU MANAGE?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 16, 510, 80);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton1.setForeground(java.awt.SystemColor.desktop);
        jButton1.setText("ARTIFICIAL INTELLIGENCE CLUB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 130, 250, 30);

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton2.setForeground(java.awt.SystemColor.desktop);
        jButton2.setText("AEROSPACE CLUB");
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 180, 250, 32);

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton3.setForeground(java.awt.SystemColor.desktop);
        jButton3.setText("ROBOTICS CLUB");
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 230, 250, 32);

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton4.setForeground(java.awt.SystemColor.desktop);
        jButton4.setText("ELECTRONICS CLUB");
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 280, 250, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quotesmgr.jepg.jpe")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 70, 440, 320);

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton5.setForeground(java.awt.SystemColor.desktop);
        jButton5.setText("BACK");
        getContentPane().add(jButton5);
        jButton5.setBounds(220, 360, 270, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\mini.jpe")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // CLUBMANAGER ob=new CLUBMANAGER();   
   log open=new log();
   this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageropt().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
