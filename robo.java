
package clubmgmtstyst;


public class robo extends javax.swing.JFrame {

    
    public robo() {
        initComponents();
        this.setSize(954, 565);
        this.setResizable(false);
        this.setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.desktop);
        jLabel1.setText("WELCOME,MANAGER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 520, 68);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 80, 0, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 80, 940, 20);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.desktop);
        jButton1.setText("MESSAGE BOX");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 10, 250, 70);

        jLabel2.setFont(new java.awt.Font("FangSong", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.desktop);
        jLabel2.setText("ROBOTICS CLUB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 90, 430, 60);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(java.awt.SystemColor.desktop);
        jButton2.setText("ADD MEMBER TO CLUB");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 220, 310, 50);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(java.awt.SystemColor.desktop);
        jButton3.setText("REMOVE MEMBER FROM CLUB");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(90, 290, 310, 50);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(java.awt.SystemColor.desktop);
        jButton4.setText("VIEW MEMBERS OF CLUB");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(90, 360, 310, 50);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(java.awt.SystemColor.desktop);
        jButton5.setText("ADD MEMBER TO THE PROJECT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(510, 220, 320, 50);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setForeground(java.awt.SystemColor.desktop);
        jButton6.setText("START NEW PROJECT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(510, 292, 320, 50);

        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setForeground(java.awt.SystemColor.desktop);
        jButton7.setText("MEMBERS WORKING FOR THE PROJECT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(510, 360, 320, 50);

        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setForeground(java.awt.SystemColor.desktop);
        jButton8.setText("EXIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(350, 470, 220, 50);

        jButton9.setForeground(java.awt.SystemColor.desktop);
        jButton9.setText("QUICK REPLACEMENT");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(270, 160, 420, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/beasts_2k.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 960, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        robomemdisppro dip=new robomemdisppro();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       this.setVisible(false);
       loginpgadmin ap=new loginpgadmin();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       robomemins ri=new robomemins();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   this.setVisible(false);
   robodelmem rd=new robodelmem();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setVisible(false);
      robomemsview r=new robomemsview();         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.setVisible(false);
      msgrobo mess=new msgrobo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false); 
        roboaddpro radd=new roboaddpro();       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        meminfobefdel m=new meminfobefdel();
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new robo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
