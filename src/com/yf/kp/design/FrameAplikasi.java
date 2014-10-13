package com.yf.kp.design;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author BlackCode
 */
public class FrameAplikasi extends javax.swing.JFrame {
    
    private Dimension dimension;
    private Image image;
    private Object desktopPaneCustom1;

    /** Creates new form FrameAplikasi */
    public FrameAplikasi() {
        initComponents();
        setLocationRelativeTo(null);
        fullScreen();
        setIcon();
    }
    
    private void fullScreen(){
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, dimension.width, dimension.height);
    }
    
    private void setIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/yf/kp/images/cash.png"));
        image = icon.getImage();
        setIconImage(image);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customDesktopPane1 = new com.yf.kp.template.CustomDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonMenuLogin = new javax.swing.JButton();
        jButtonMenuLogout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonMenuAbout1 = new javax.swing.JButton();
        jButtonMenuAbout2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemInputAgama = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonMenuLogin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuLogin.setText("DATA SISWA");
        jButtonMenuLogin.setToolTipText("Login");
        jButtonMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuLoginActionPerformed(evt);
            }
        });

        jButtonMenuLogout.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuLogout.setText("KELAS");
        jButtonMenuLogout.setToolTipText("Logout");
        jButtonMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonMenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(913, 913, 913))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButtonMenuLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("KESISWAAN", jPanel1);

        jButtonMenuAbout1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuAbout1.setText("JENIS PEMBAYARAN");
        jButtonMenuAbout1.setToolTipText("About");
        jButtonMenuAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuAbout1ActionPerformed(evt);
            }
        });

        jButtonMenuAbout2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuAbout2.setText("BILING PEMBAYARAN");
        jButtonMenuAbout2.setToolTipText("About");
        jButtonMenuAbout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuAbout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMenuAbout1)
                .addGap(32, 32, 32)
                .addComponent(jButtonMenuAbout2)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMenuAbout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMenuAbout2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("PEMBAYARAN", jPanel5);

        customDesktopPane1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 800, 110);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit'");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        jMenuItemInputAgama.setText("Pembayaran");
        jMenuItemInputAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInputAgamaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemInputAgama);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Laporan");

        jMenuItem2.setText("Data Siswa");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Pembayaran");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemInputAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInputAgamaActionPerformed
        // TODO add your handling code here:
        FormAgama agama = new FormAgama();
        agama.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(agama);
        agama.setVisible(true);
    }//GEN-LAST:event_jMenuItemInputAgamaActionPerformed

    private void jButtonMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuLoginActionPerformed
        // TODO add your handling code here:
        FrameSiswa fs = new FrameSiswa();
        fs.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(fs);
        fs.setVisible(true);
    }//GEN-LAST:event_jButtonMenuLoginActionPerformed

    private void jButtonMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuLogoutActionPerformed

    private void jButtonMenuAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuAbout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuAbout1ActionPerformed

    private void jButtonMenuAbout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuAbout2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuAbout2ActionPerformed

    /**
     * @param args the command line argument
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.yf.kp.template.CustomDesktopPane customDesktopPane1;
    private javax.swing.JButton jButtonMenuAbout1;
    private javax.swing.JButton jButtonMenuAbout2;
    private javax.swing.JButton jButtonMenuLogin;
    private javax.swing.JButton jButtonMenuLogout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemInputAgama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}