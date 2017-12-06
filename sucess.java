
package clubmgmtstyst;

public class sucess extends javax.swing.JDialog {

   public sucess(){
        initComponents();
        this.setSize(500,300);
        this.setResizable(false);
        this.setVisible(true);
   }
    public sucess(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEMBER SUCESSFULLY ADDED");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 420, 42);

        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton1.setText("OK");
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 70, 160, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\miniog.jpe")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sucess dialog = new sucess(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
