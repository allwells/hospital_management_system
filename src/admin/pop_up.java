package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allwell Festus
 */
public class pop_up extends javax.swing.JFrame {
    
    Connection con;
    
    private final String login_username = login.username.getText();
    private final String login_password = login.password.getText();

    public pop_up() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void db() {
        con = sqlite_connection.connection();
    }
    private void Yes() {
        try{
            String sql="DELETE FROM `admin` WHERE `Username` ='"+login_username+"' and `Password` ='"+login_password+"'";
            
            db();
            int check = con.prepareStatement(sql).executeUpdate();
            if (check == 1) { new login().show();}
            else { JOptionPane.showMessageDialog(null, "Account deletion failed!", "Message", 0); }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(pop_up.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void No() {
        dispose();
        new editProfile().show();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        noBtn = new javax.swing.JLabel();
        yesBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 178, 170));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are you sure you want to delete this account?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 20));

        jPanel2.setBackground(new java.awt.Color(32, 178, 170));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setBackground(new java.awt.Color(32, 178, 170));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Delete_30px.png"))); // NOI18N
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.setOpaque(true);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });
        jPanel2.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 0, 32, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        noBtn.setBackground(new java.awt.Color(32, 178, 170));
        noBtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        noBtn.setForeground(new java.awt.Color(255, 255, 255));
        noBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noBtn.setText("No");
        noBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noBtn.setOpaque(true);
        noBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noBtnMousePressed(evt);
            }
        });
        jPanel1.add(noBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 60, 30));

        yesBtn.setBackground(new java.awt.Color(32, 178, 170));
        yesBtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        yesBtn.setForeground(new java.awt.Color(255, 255, 255));
        yesBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yesBtn.setText("Yes");
        yesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yesBtn.setOpaque(true);
        yesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yesBtnMousePressed(evt);
            }
        });
        jPanel1.add(yesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        No();
    }//GEN-LAST:event_closeBtnMousePressed

    private void yesBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesBtnMousePressed
        Yes();
    }//GEN-LAST:event_yesBtnMousePressed

    private void noBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noBtnMousePressed
        No();
    }//GEN-LAST:event_noBtnMousePressed

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(150,150,150));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(32,178,170));
    }//GEN-LAST:event_closeBtnMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pop_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pop_up().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel noBtn;
    private javax.swing.JLabel yesBtn;
    // End of variables declaration//GEN-END:variables
}
