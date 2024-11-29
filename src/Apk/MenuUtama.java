package Apk;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Sidebar = new Cob.PanelCustom();
        jLabel1 = new javax.swing.JLabel();
        Menu_Dashboard = new Cob.PanelCustom();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Menu_Barang = new Cob.PanelCustom();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Menu_LaporanMasuk = new Cob.PanelCustom();
        label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Menu_Kasir = new Cob.PanelCustom();
        label2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Menu_LaporanKeluar = new Cob.PanelCustom();
        label_Laporankel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panel_LogOut = new Cob.PanelCustom();
        Tombol_LogOut = new javax.swing.JButton();
        Panel_Navigasi = new javax.swing.JPanel();
        Panel_Frame = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/UI/LogoMythrift.png")).getImage());

        Panel_Sidebar.setBackground(new java.awt.Color(25, 69, 105));
        Panel_Sidebar.setRoundBottomRight(75);
        Panel_Sidebar.setRoundTopRight(75);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LogoMythrift.png"))); // NOI18N

        Menu_Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Dashboard.setRoundBottomLeft(40);
        Menu_Dashboard.setRoundBottomRight(40);
        Menu_Dashboard.setRoundTopLeft(40);
        Menu_Dashboard.setRoundTopRight(40);
        Menu_Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Dashboard (1)_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        Menu_Dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DASHBOARD");
        Menu_Dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, -1));

        Menu_Barang.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Barang.setRoundBottomLeft(40);
        Menu_Barang.setRoundBottomRight(40);
        Menu_Barang.setRoundTopLeft(40);
        Menu_Barang.setRoundTopRight(40);
        Menu_Barang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuBarang.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        Menu_Barang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BARANG");
        Menu_Barang.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 170, 20));

        Menu_LaporanMasuk.setBackground(new java.awt.Color(255, 255, 255));
        Menu_LaporanMasuk.setRoundBottomLeft(40);
        Menu_LaporanMasuk.setRoundBottomRight(40);
        Menu_LaporanMasuk.setRoundTopLeft(40);
        Menu_LaporanMasuk.setRoundTopRight(40);
        Menu_LaporanMasuk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Gudang (1)_1.png"))); // NOI18N
        label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
        });
        Menu_LaporanMasuk.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LAPORAN MASUK");
        Menu_LaporanMasuk.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 70, 130, -1));

        Menu_Kasir.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Kasir.setRoundBottomLeft(40);
        Menu_Kasir.setRoundBottomRight(40);
        Menu_Kasir.setRoundTopLeft(40);
        Menu_Kasir.setRoundTopRight(40);
        Menu_Kasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuKasir.png"))); // NOI18N
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label2MouseExited(evt);
            }
        });
        Menu_Kasir.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("KASIR");
        Menu_Kasir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 150, 10));

        Menu_LaporanKeluar.setBackground(new java.awt.Color(255, 255, 255));
        Menu_LaporanKeluar.setRoundBottomLeft(40);
        Menu_LaporanKeluar.setRoundBottomRight(40);
        Menu_LaporanKeluar.setRoundTopLeft(40);
        Menu_LaporanKeluar.setRoundTopRight(40);
        Menu_LaporanKeluar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Laporankel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Laporankel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuLaporan.png"))); // NOI18N
        label_Laporankel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Laporankel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_LaporankelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_LaporankelMouseExited(evt);
            }
        });
        Menu_LaporanKeluar.add(label_Laporankel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 70));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LAPORAN KELUAR");
        Menu_LaporanKeluar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 66, 110, 20));

        Panel_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Panel_LogOut.setRoundBottomLeft(40);
        Panel_LogOut.setRoundBottomRight(40);
        Panel_LogOut.setRoundTopLeft(40);
        Panel_LogOut.setRoundTopRight(40);

        Tombol_LogOut.setText("Log Out");
        Tombol_LogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_LogOut.setContentAreaFilled(false);
        Tombol_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tombol_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tombol_LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tombol_LogOutMouseExited(evt);
            }
        });
        Tombol_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_LogOutLayout = new javax.swing.GroupLayout(Panel_LogOut);
        Panel_LogOut.setLayout(Panel_LogOutLayout);
        Panel_LogOutLayout.setHorizontalGroup(
            Panel_LogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LogOutLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Tombol_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel_LogOutLayout.setVerticalGroup(
            Panel_LogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_SidebarLayout = new javax.swing.GroupLayout(Panel_Sidebar);
        Panel_Sidebar.setLayout(Panel_SidebarLayout);
        Panel_SidebarLayout.setHorizontalGroup(
            Panel_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_LaporanMasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Kasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_LaporanKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        Panel_SidebarLayout.setVerticalGroup(
            Panel_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SidebarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Menu_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_LaporanMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_LaporanKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout Panel_NavigasiLayout = new javax.swing.GroupLayout(Panel_Navigasi);
        Panel_Navigasi.setLayout(Panel_NavigasiLayout);
        Panel_NavigasiLayout.setHorizontalGroup(
            Panel_NavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel_NavigasiLayout.setVerticalGroup(
            Panel_NavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Panel_Frame.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel_FrameLayout = new javax.swing.GroupLayout(Panel_Frame);
        Panel_Frame.setLayout(Panel_FrameLayout);
        Panel_FrameLayout.setHorizontalGroup(
            Panel_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1206, Short.MAX_VALUE)
        );
        Panel_FrameLayout.setVerticalGroup(
            Panel_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Navigasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(Panel_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Navigasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Panel_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Panel_Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        Menu_Dashboard.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        Menu_Dashboard.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        Menu_Barang.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        Menu_Barang.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseEntered
        // TODO add your handling code here:
        Menu_Kasir.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_label2MouseEntered

    private void label2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseExited
        // TODO add your handling code here:
        Menu_Kasir.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_label2MouseExited

    private void labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseEntered
        // TODO add your handling code here:
        Menu_LaporanMasuk.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_labelMouseEntered

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
        // TODO add your handling code here:
        Menu_LaporanMasuk.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_labelMouseExited

    private void label_LaporankelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_LaporankelMouseEntered
        // TODO add your handling code here:
        Menu_LaporanKeluar.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_label_LaporankelMouseEntered

    private void label_LaporankelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_LaporankelMouseExited
        // TODO add your handling code here:
        Menu_LaporanKeluar.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_label_LaporankelMouseExited

    private void Tombol_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_LogOutActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            Frame_Login login = new Frame_Login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Tombol_LogOutActionPerformed

    private void Tombol_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_LogOutMouseEntered
        // TODO add your handling code here:
        Panel_LogOut.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Tombol_LogOutMouseEntered

    private void Tombol_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_LogOutMouseExited
        // TODO add your handling code here:
        Panel_LogOut.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Tombol_LogOutMouseExited


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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Cob.PanelCustom Menu_Barang;
    private Cob.PanelCustom Menu_Dashboard;
    private Cob.PanelCustom Menu_Kasir;
    private Cob.PanelCustom Menu_LaporanKeluar;
    private Cob.PanelCustom Menu_LaporanMasuk;
    private javax.swing.JPanel Panel_Frame;
    private Cob.PanelCustom Panel_LogOut;
    private javax.swing.JPanel Panel_Navigasi;
    private Cob.PanelCustom Panel_Sidebar;
    private javax.swing.JButton Tombol_LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label_Laporankel;
    // End of variables declaration//GEN-END:variables
}
