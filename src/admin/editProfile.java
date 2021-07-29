package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class editProfile extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;

    private final String login_username = login.username.getText();
    private final String login_password = login.password.getText();

    public editProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
        Search();
        password.setEnabled(false);
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

    private void Search() {
        try {
            String query = "SELECT * FROM `admin` WHERE `Username`='" + login_username + "' and `Password`='" + login_password + "'";

            db();
            rs = con.prepareStatement(query).executeQuery();
            if (rs.next()) {
                id.setText(rs.getString("ID"));
                name.setText(rs.getString("Name"));
                email.setText(rs.getString("Email"));
                username.setText(rs.getString("Username"));
                password.setText(rs.getString("Password"));
            } else {
                JOptionPane.showMessageDialog(null, "Not found!");
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void Save() {
        try {
            String sql = "UPDATE `admin` SET `ID`='" + id.getText() + "', `Name`='" + name.getText() + "',"
                    + "`Email`='" + email.getText() + "',`Username`='" + username.getText() + "', `Password`='" + password.getText() + "' "
                    + "WHERE `username`='" + login_username + "' and `password`='" + login_password + "'";

            db();
            int check = con.prepareStatement(sql).executeUpdate();
            if (check == 1) {
                JOptionPane.showMessageDialog(this, "Saved successfully!", "Success", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Operation failed!", "Failed", 0);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        back_btn = new javax.swing.JLabel();
        closeBtn1 = new javax.swing.JLabel();
        profile_picture = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        del_account = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        reset_password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1091, 670));
        setMinimumSize(new java.awt.Dimension(1091, 670));
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setMaximumSize(new java.awt.Dimension(1091, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1091, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1091, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/edit_user_ico_01.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 70));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Edit Profile");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 50));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/home_ico.png"))); // NOI18N
        homeBtn.setToolTipText("Home");
        homeBtn.setOpaque(true);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
        });
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 50, 50));

        logoutBtn.setBackground(new java.awt.Color(32, 178, 170));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setOpaque(true);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 50));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 1210, 50));

        closeBtn.setBackground(new java.awt.Color(250, 250, 250));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
        closeBtn.setOpaque(true);
        closeBtn.setPreferredSize(new java.awt.Dimension(1300, 700));
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 40, 40));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setText("Name");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 40, 30));

        name.setBackground(new java.awt.Color(250, 250, 250));
        name.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(100, 100, 100));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        name.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 620, 30));

        jLabel8.setBackground(new java.awt.Color(74, 179, 175));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("Email");
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 40, 30));

        email.setBackground(new java.awt.Color(250, 250, 250));
        email.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 620, 30));

        jLabel14.setBackground(new java.awt.Color(74, 179, 175));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 100, 100));
        jLabel14.setText("Password");
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 70, 30));

        username.setBackground(new java.awt.Color(250, 250, 250));
        username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 620, 30));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(250, 250, 250));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(100, 100, 100));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 40, 30));

        save.setBackground(new java.awt.Color(250, 250, 250));
        save.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(100, 100, 100));
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Save");
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setOpaque(true);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
        });
        mainLayout.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 120, 30));

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        jLabel17.setBackground(new java.awt.Color(74, 179, 175));
        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(100, 100, 100));
        jLabel17.setText("Username");
        mainLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 80, 30));

        jSeparator2.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator2.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1270, 10));

        back_btn.setBackground(new java.awt.Color(32, 178, 170));
        back_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(100, 100, 100));
        back_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_btn.setText("Back");
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_btnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_btnMouseEntered(evt);
            }
        });
        mainLayout.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 20));

        closeBtn1.setBackground(new java.awt.Color(250, 250, 250));
        closeBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
        closeBtn1.setOpaque(true);
        closeBtn1.setPreferredSize(new java.awt.Dimension(1300, 700));
        closeBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtn1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtn1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtn1MouseEntered(evt);
            }
        });
        mainLayout.add(closeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

        profile_picture.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        profile_picture.setForeground(new java.awt.Color(100, 100, 100));
        profile_picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/default_dp.png"))); // NOI18N
        profile_picture.setLabelFor(profile_picture);
        profile_picture.setText("Click here");
        profile_picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        profile_picture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainLayout.add(profile_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 210, 240));

        footer.setBackground(new java.awt.Color(240, 240, 240));
        footer.setPreferredSize(new java.awt.Dimension(1091, 40));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Copyright © 2021");
        footer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 12, 130, 20));

        del_account.setBackground(new java.awt.Color(32, 178, 170));
        del_account.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        del_account.setForeground(new java.awt.Color(100, 100, 100));
        del_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del_account.setText("Delete Account");
        del_account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        del_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                del_accountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                del_accountMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                del_accountMouseEntered(evt);
            }
        });
        footer.add(del_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 13, 110, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("|");
        footer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 10, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1091, 40));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(250, 250, 250));
        password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 480, 30));

        reset_password.setBackground(new java.awt.Color(250, 250, 250));
        reset_password.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        reset_password.setForeground(new java.awt.Color(0, 153, 153));
        reset_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset_password.setText("Change Password");
        reset_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_password.setOpaque(true);
        reset_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_passwordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset_passwordMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset_passwordMouseEntered(evt);
            }
        });
        mainLayout.add(reset_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 474, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtnMouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        Save();
    }//GEN-LAST:event_saveMouseClicked

    private void del_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_accountMouseClicked
        new pop_up().show();
        dispose();
    }//GEN-LAST:event_del_accountMouseClicked

    private void del_accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_accountMouseExited
        del_account.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_del_accountMouseExited

    private void del_accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_accountMouseEntered
        del_account.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_del_accountMouseEntered

    private void closeBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseClicked
        minimize();
    }//GEN-LAST:event_closeBtn1MouseClicked

    private void closeBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtn1MouseEntered

    private void closeBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtn1MouseExited

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_saveMouseExited

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        new profile().show();
        this.dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void back_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseExited
        back_btn.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_back_btnMouseExited

    private void back_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseEntered
        back_btn.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_back_btnMouseEntered

    private void reset_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_passwordMouseClicked
        new reset().show();
        dispose();
    }//GEN-LAST:event_reset_passwordMouseClicked

    private void reset_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_passwordMouseExited
        reset_password.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_reset_passwordMouseExited

    private void reset_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_passwordMouseEntered
        reset_password.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_reset_passwordMouseEntered

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
            java.util.logging.Logger.getLogger(editProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new editProfile().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_btn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel closeBtn1;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel del_account;
    private javax.swing.JTextField email;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JLabel profile_picture;
    private javax.swing.JLabel reset_password;
    private javax.swing.JLabel save;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
