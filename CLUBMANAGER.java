
package clubmgmtstyst;
import java.sql.*;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;


public class CLUBMANAGER extends javax.swing.JFrame {

    public CLUBMANAGER() {
        initComponents();
        this.setSize(849,498);
        this.setVisible(true);
        
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\clubmgmtstyst\\src\\clubmgmtstyst\\Blue.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1360, 768));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(java.awt.SystemColor.desktop);
        jButton2.setText("REMOVE MEMBER FROM CLUB");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 280, 290, 44);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(java.awt.SystemColor.desktop);
        jButton3.setText("VIEW THE MEMBERS OF THE CLUB");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 340, 290, 44);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(java.awt.SystemColor.desktop);
        jButton4.setText("EXIT");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 450, 223, 44);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setForeground(java.awt.SystemColor.desktop);
        jButton5.setText("ADD MEMBER TO THE PROJECT");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(460, 220, 290, 50);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setForeground(java.awt.SystemColor.desktop);
        jButton7.setText("MEMBERS WORKING FOR PROJECT");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(460, 340, 290, 50);

        jLabel3.setBackground(java.awt.Color.darkGray);
        jLabel3.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.desktop);
        jLabel3.setText("ARTIFICIAL INTELLIGENCE CLUB");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 870, 110);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(java.awt.SystemColor.desktop);
        jButton1.setText("ADD MEMBER TO CLUB");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 220, 290, 50);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(182, 17, 39));
        jLabel5.setText("WELCOME,MANAGER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 10, 360, 80);

        jButton9.setBackground(new java.awt.Color(51, 51, 51));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton9.setForeground(java.awt.SystemColor.desktop);
        jButton9.setText("MESSAGE BOX");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(500, 20, 270, 50);

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setForeground(java.awt.SystemColor.desktop);
        jButton8.setText("START NEW PROJECT ");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(460, 280, 290, 50);

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setForeground(java.awt.SystemColor.desktop);
        jButton6.setText("QUICK REPLACEMENT");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(230, 160, 430, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clubmgmtstyst/Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 850, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    insmem o=new insmem();  
     o.open();
    this.setVisible(true);
     setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Connection conn = null;
       int count=0;
           try{
 
    tablecsview dio=new tablecsview();
  
    
   }catch (Exception ex) {
            System.out.println(ex);
   }     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     delai del=new delai();
     this.setVisible(false);
     del.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false); 
        aiaddmemp m=new aiaddmemp();       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        msgbai ms=new msgbai();
        this.setVisible(false);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
        addproj add=new addproj();        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       this.setVisible(false);
       medispro pro=new medispro();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     meminfobefdel m=new meminfobefdel();
     this.setVisible(false);     
        
    }//GEN-LAST:event_jButton6ActionPerformed
    
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
//jLabel5.setIcon(new ImageIcon(img));
}
