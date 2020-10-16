package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Festus
 */
public class addAdmin extends javax.swing.JFrame {

    private Connection con;
    
    public addAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void db() {
        con = sqlite_connection.connection();
    }
    
    private void close() {
        System.exit(0);
    }
    
    private void minimize() {
        this.setState(JFrame.ICONIFIED);
    }
    
    private void register() {
        try{
            String sqlite="INSERT INTO `admin` (`Name`, `Username`, `Email`, `Password`)"
                    + "VALUES ('"+fullname.getText()+"', '"+username.getText()+"',"
                    + "'"+email.getText()+"', '"+password.getText()+"')";
            
            db();
            int check = con.createStatement().executeUpdate(sqlite);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Registered successfully!", "Success", 1);
                new login().show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Operation failed!", "Failed", 0);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(addAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logoTxt = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        adminLogin = new javax.swing.JLabel();
        bckBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        usernameIcon = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();
        regBtn = new javax.swing.JPanel();
        register = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        emailIcon = new javax.swing.JLabel();
        confrmPsdIcon = new javax.swing.JLabel();
        lblCnfrmPsd = new javax.swing.JLabel();
        lblUsr = new javax.swing.JLabel();
        lblPsd = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(74, 179, 175));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(240, 240, 240));
        logoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoTxt.setText("HarryLand Hospital");
        logoPanel.add(logoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Hospital 3_35px.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 50));

        mainLayout.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 50));

        loginPanel.setBackground(new java.awt.Color(74, 179, 175));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(240, 240, 240));
        adminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLogin.setText("ADMIN REGISTER PANEL");
        loginPanel.add(adminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 40));

        mainLayout.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        bckBtn.setBackground(new java.awt.Color(255, 255, 255));
        bckBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bckBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Back_25px_3.png"))); // NOI18N
        bckBtn.setOpaque(true);
        bckBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bckBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bckBtnMouseExited(evt);
            }
        });
        mainLayout.add(bckBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Multiply_30px.png"))); // NOI18N
        closeBtn.setOpaque(true);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
        });
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, -1));

        usernameIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Administrator Male_20px_3.png"))); // NOI18N
        mainLayout.add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 30, 30));

        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setToolTipText("Email");
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 30));

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setToolTipText("Confrim Password");
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 300, 30));

        passwordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Message_25px_1.png"))); // NOI18N
        mainLayout.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 30, 30));

        regBtn.setBackground(new java.awt.Color(74, 179, 175));
        regBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regBtnMouseClicked(evt);
            }
        });
        regBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        register.setForeground(new java.awt.Color(240, 240, 240));
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("Regtister");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regBtnMouseClicked(evt);
            }
        });
        regBtn.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        mainLayout.add(regBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 100, 30));

        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setToolTipText("Username");
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 300, 30));

        emailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Administrator Male_20px_3.png"))); // NOI18N
        mainLayout.add(emailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 30, 30));

        confrmPsdIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confrmPsdIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Key_20px_1.png"))); // NOI18N
        mainLayout.add(confrmPsdIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 30, 30));

        lblCnfrmPsd.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblCnfrmPsd.setForeground(new java.awt.Color(100, 100, 100));
        lblCnfrmPsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCnfrmPsd.setText("Password");
        mainLayout.add(lblCnfrmPsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, 30));

        lblUsr.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblUsr.setForeground(new java.awt.Color(100, 100, 100));
        lblUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsr.setText("Name");
        mainLayout.add(lblUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        lblPsd.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblPsd.setForeground(new java.awt.Color(100, 100, 100));
        lblPsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPsd.setText("Email");
        mainLayout.add(lblPsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        lblEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(100, 100, 100));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Username");
        mainLayout.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 30));

        fullname.setBackground(new java.awt.Color(240, 240, 240));
        fullname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(100, 100, 100));
        fullname.setToolTipText("Username");
        fullname.setBorder(null);
        fullname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 300, 30));

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/minimize.png"))); // NOI18N
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
        });
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bckBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckBtnMouseClicked
        new adminPortal().show();
        dispose();
    }//GEN-LAST:event_bckBtnMouseClicked

    private void bckBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckBtnMouseEntered
        bckBtn.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_bckBtnMouseEntered

    private void bckBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckBtnMouseExited
        bckBtn.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bckBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void regBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regBtnMouseClicked
        register();
    }//GEN-LAST:event_regBtnMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_minimizeMouseEntered

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
            java.util.logging.Logger.getLogger(addAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLogin;
    private javax.swing.JLabel bckBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel confrmPsdIcon;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel lblCnfrmPsd;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPsd;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPanel regBtn;
    private javax.swing.JLabel register;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameIcon;
    // End of variables declaration//GEN-END:variables
}
