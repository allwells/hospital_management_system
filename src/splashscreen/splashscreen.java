package splashscreen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allwell Festus
 */
public class splashscreen extends javax.swing.JFrame
{

    public splashscreen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void startsplashscreen() {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(200);
                progress_indicator.setText(Integer.toString(i) + "%");
                progress_bar.setValue(i);

                if (i == 1) {
                    progress_label.setText("Starting. . . ");
                }

                if (i == 52) {
                    progress_label.setText("Setting up environment. . . ");
                }

                if (i == 70) {
                    progress_label.setText("Loading database. . . ");
                }

                if (i == 100) {
                    dispose();
                    new index.login().show();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        progress_indicator = new javax.swing.JLabel();
        progress_bar = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        progress_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(74, 179, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HARRYLAND Copyright 2020");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 170, 30));

        mainLayout.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 500, 30));

        progress_indicator.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        progress_indicator.setForeground(new java.awt.Color(74, 179, 175));
        progress_indicator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progress_indicator.setToolTipText("");
        mainLayout.add(progress_indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, 20));

        progress_bar.setBackground(java.awt.Color.white);
        progress_bar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        progress_bar.setForeground(new java.awt.Color(74, 179, 175));
        progress_bar.setBorder(null);
        progress_bar.setBorderPainted(false);
        mainLayout.add(progress_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 460, 15));

        jSeparator1.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator1.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 62, 400, -1));

        jSeparator2.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator2.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 95, 200, -1));

        jSeparator3.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator3.setForeground(new java.awt.Color(74, 179, 175));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainLayout.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 64, 10, 40));

        jSeparator4.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator4.setForeground(new java.awt.Color(74, 179, 175));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainLayout.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 64, 10, 40));

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 179, 175));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Port Harcourt");
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 430, 60));

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 179, 175));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HARRYLAND HOSPITAL");
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 430, 60));

        progress_label.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        progress_label.setForeground(new java.awt.Color(74, 179, 175));
        progress_label.setToolTipText("");
        mainLayout.add(progress_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 200, 390, 20));

        getContentPane().add(mainLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        splashscreen start = new splashscreen();
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
            java.util.logging.Logger.getLogger(splashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new splashscreen().setVisible(true);
        });
        start.startsplashscreen();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel mainLayout;
    private static javax.swing.JProgressBar progress_bar;
    private static javax.swing.JLabel progress_indicator;
    private static javax.swing.JLabel progress_label;
    // End of variables declaration//GEN-END:variables
}
