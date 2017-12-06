
package clubmgmtstyst;


public class Aero extends javax.swing.JFrame {

   
    public Aero() {
        initComponents();
        this.setSize(825, 511);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("WELCOME,MANAGER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 400, 50);

        jLabel2.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel2.setText("AEROSPACE CLUB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 700, 60);

        jButton1.setBackground(new java.awt.Color(132, 132, 153));
        jButton1.setForeground(new java.awt.Color(42, 192, 49));
        jButton1.setText("ADD MEMBER TO CLUB");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 190, 260, 50);

        jButton2.setBackground(new java.awt.Color(132, 132, 153));
        jButton2.setForeground(new java.awt.Color(42, 192, 49));
        jButton2.setText("REMOVE MEMBER FROM CLUB");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 260, 260, 50);

        jButton3.setBackground(new java.awt.Color(132, 132, 153));
        jButton3.setForeground(new java.awt.Color(42, 192, 49));
        jButton3.setText("VIEW MEMBERS OF CLUB");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 330, 260, 50);

        jButton4.setBackground(new java.awt.Color(132, 132, 153));
        jButton4.setForeground(new java.awt.Color(42, 192, 49));
        jButton4.setText("ADD MEMBER TO THE PROJECT");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 190, 270, 50);

        jButton5.setBackground(new java.awt.Color(132, 132, 153));
        jButton5.setForeground(new java.awt.Color(42, 192, 49));
        jButton5.setText("START NEW PROJECT");
        jButton5.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(410, 260, 270, 50);

        jButton6.setBackground(new java.awt.Color(132, 132, 153));
        jButton6.setForeground(new java.awt.Color(42, 192, 49));
        jButton6.setText("MEMBERS WORKING FOR THE PROJECT");
        jButton6.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(410, 330, 270, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 60, 810, 20);

        jButton7.setBackground(new java.awt.Color(132, 132, 153));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(42, 192, 49));
        jButton7.setText("MESSAGE BOX");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(570, 10, 230, 50);

        jButton8.setBackground(new java.awt.Color(132, 132, 153));
        jButton8.setForeground(new java.awt.Color(42, 192, 49));
        jButton8.setText("EXIT");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(240, 430, 240, 50);

        jButton9.setBackground(new java.awt.Color(132, 132, 153));
        jButton9.setForeground(new java.awt.Color(42, 192, 49));
        jButton9.setText("QUICK REPLACEMENT");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(190, 130, 420, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/another_galaxy_2k.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 830, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       aeroclubmemins ob=new aeroclubmemins();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       aerrem ar=new aerrem();      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       this.setVisible(false);
       loginpgadmin la=new loginpgadmin();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        viewmemaro v=new viewmemaro();     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    this.setVisible(false);
    aeroaddpro ap=new aeroaddpro();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        aermemdispro ap=new aermemdispro();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     this.setVisible(false);
     msgaero j=new msgaero();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        aeroaddmemp ap=new aeroaddmemp();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        meminfobefdel m=new meminfobefdel();
        this.setVisible(false);

    }//GEN-LAST:event_jButton9ActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aero().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
