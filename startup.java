
package clubmgmtstyst;

import java.util.logging.Level;
import java.util.logging.Logger;
public class startup extends javax.swing.JFrame {

   
    public startup() {
        initComponents();
        this.setSize(1118,537);
        this.setVisible(true);
        progress();
    }

    public void progress() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(100 / 2);
                        progBar.setStringPainted(true);
                        progBar.setValue(i);
                        //progBar.setTitle(i);
                       startup.cl.setText("CLUB");
                        startup.mgmt.setText("MANAGEMENT");
                         startup.sys.setText("SYSTEM");

                    } catch (InterruptedException ex) {
                        Logger.getLogger(startup.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            //    progBar.setString("Welcome!!");
                startup.cl.setText(null);
                startup.sys.setText(null);
                startup.mgmt.setText("WELCOME");
                start s=new start();
                s.setVisible(true);
           f();
                
            }
        }
        ).start();this.setVisible(false);
    }
    void f()
    {
        this.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progBar = new javax.swing.JProgressBar();
        cl = new javax.swing.JLabel();
        mgmt = new javax.swing.JLabel();
        sys = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        progBar.setBackground(java.awt.SystemColor.info);
        getContentPane().add(progBar);
        progBar.setBounds(64, 398, 976, 82);

        cl.setFont(new java.awt.Font("Microsoft JhengHei", 3, 48)); // NOI18N
        cl.setForeground(java.awt.SystemColor.window);
        getContentPane().add(cl);
        cl.setBounds(160, 30, 430, 80);

        mgmt.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 48)); // NOI18N
        mgmt.setForeground(java.awt.SystemColor.window);
        getContentPane().add(mgmt);
        mgmt.setBounds(250, 140, 410, 70);

        sys.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 48)); // NOI18N
        sys.setForeground(java.awt.SystemColor.window);
        getContentPane().add(sys);
        sys.setBounds(520, 250, 250, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/windows_7_black_glass_reflection_26309_1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cl;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel mgmt;
    private static javax.swing.JProgressBar progBar;
    public static javax.swing.JLabel sys;
    // End of variables declaration//GEN-END:variables
}
