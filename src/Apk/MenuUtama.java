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
        Menu_Dashboard = new Cob.PanelCustom();
        Ikon_Dashboard = new javax.swing.JLabel();
        Text_Dashboard = new javax.swing.JLabel();
        Menu_Barang = new Cob.PanelCustom();
        Ikon_Barang = new javax.swing.JLabel();
        Text_Barang = new javax.swing.JLabel();
        Menu_Kasir = new Cob.PanelCustom();
        Ikon_Kasir = new javax.swing.JLabel();
        Text_Kasir = new javax.swing.JLabel();
        Menu_Laporan = new Cob.PanelCustom();
        Ikon_Laporan = new javax.swing.JLabel();
        Text_LaporanKeluar = new javax.swing.JLabel();
        Panel_LogOut = new Cob.PanelCustom();
        Tombol_LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Panel_Frame = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel_Navigasi = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/UI/LogoMythrift.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Sidebar.setBackground(new java.awt.Color(25, 69, 105));
        Panel_Sidebar.setRoundBottomRight(75);
        Panel_Sidebar.setRoundTopRight(100);

        Menu_Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Dashboard.setRoundBottomLeft(40);
        Menu_Dashboard.setRoundBottomRight(40);
        Menu_Dashboard.setRoundTopLeft(40);
        Menu_Dashboard.setRoundTopRight(40);
        Menu_Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ikon_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Dashboard (1)_1.png"))); // NOI18N
        Ikon_Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ikon_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ikon_DashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ikon_DashboardMouseExited(evt);
            }
        });
        Menu_Dashboard.add(Ikon_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        Text_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_Dashboard.setText("DASHBOARD");
        Menu_Dashboard.add(Text_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, -1));

        Menu_Barang.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Barang.setRoundBottomLeft(40);
        Menu_Barang.setRoundBottomRight(40);
        Menu_Barang.setRoundTopLeft(40);
        Menu_Barang.setRoundTopRight(40);
        Menu_Barang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ikon_Barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuBarang.png"))); // NOI18N
        Ikon_Barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ikon_Barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ikon_BarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ikon_BarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ikon_BarangMouseExited(evt);
            }
        });
        Menu_Barang.add(Ikon_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        Text_Barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_Barang.setText("BARANG");
        Menu_Barang.add(Text_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 170, 20));

        Menu_Kasir.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Kasir.setRoundBottomLeft(40);
        Menu_Kasir.setRoundBottomRight(40);
        Menu_Kasir.setRoundTopLeft(40);
        Menu_Kasir.setRoundTopRight(40);
        Menu_Kasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ikon_Kasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Kasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuKasir.png"))); // NOI18N
        Ikon_Kasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ikon_Kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ikon_KasirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ikon_KasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ikon_KasirMouseExited(evt);
            }
        });
        Menu_Kasir.add(Ikon_Kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        Text_Kasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_Kasir.setText("KASIR");
        Menu_Kasir.add(Text_Kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 150, 10));

        Menu_Laporan.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Laporan.setRoundBottomLeft(40);
        Menu_Laporan.setRoundBottomRight(40);
        Menu_Laporan.setRoundTopLeft(40);
        Menu_Laporan.setRoundTopRight(40);
        Menu_Laporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ikon_Laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuLaporan.png"))); // NOI18N
        Ikon_Laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ikon_Laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ikon_LaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ikon_LaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ikon_LaporanMouseExited(evt);
            }
        });
        Menu_Laporan.add(Ikon_Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 70));

        Text_LaporanKeluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_LaporanKeluar.setText("LAPORAN");
        Menu_Laporan.add(Text_LaporanKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 66, 110, 20));

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Logo Mythrift.png"))); // NOI18N

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
                    .addComponent(Menu_Kasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        Panel_SidebarLayout.setVerticalGroup(
            Panel_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(Panel_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(Panel_Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, -1, 710));

        Panel_Frame.setBackground(new java.awt.Color(204, 204, 204));
        Panel_Frame.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Panel_Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 1210, 590));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 110));

        Panel_Navigasi.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Navigasi.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Panel_Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1210, 110));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 180, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ikon_DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_DashboardMouseEntered
        // TODO add your handling code here:
        Menu_Dashboard.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Ikon_DashboardMouseEntered

    private void Ikon_DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_DashboardMouseExited
        // TODO add your handling code here:
        Menu_Dashboard.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Ikon_DashboardMouseExited

    private void Ikon_BarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_BarangMouseEntered
        // TODO add your handling code here:
        Menu_Barang.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Ikon_BarangMouseEntered

    private void Ikon_BarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_BarangMouseExited
        // TODO add your handling code here:
        Menu_Barang.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Ikon_BarangMouseExited

    private void Ikon_KasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_KasirMouseEntered
        // TODO add your handling code here:
        Menu_Kasir.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Ikon_KasirMouseEntered

    private void Ikon_KasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_KasirMouseExited
        // TODO add your handling code here:
        Menu_Kasir.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Ikon_KasirMouseExited

    private void Ikon_LaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_LaporanMouseEntered
        // TODO add your handling code here:
        Menu_Laporan.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Ikon_LaporanMouseEntered

    private void Ikon_LaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_LaporanMouseExited
        // TODO add your handling code here:
        Menu_Laporan.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Ikon_LaporanMouseExited

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

    private void Ikon_BarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_BarangMouseClicked
        // TODO add your handling code here:
        Menu_Barang.setBackground(new Color (153, 153, 153));
        
        Panel_Frame.removeAll();
        Panel_Frame.add(new Panel_Barang());
        Panel_Frame.repaint();
        Panel_Frame.revalidate();
        
        Panel_Navigasi.removeAll();
        Panel_Navigasi.add(new NavigasiBarang());
        Panel_Navigasi.repaint();
        Panel_Navigasi.revalidate();
        
    }//GEN-LAST:event_Ikon_BarangMouseClicked

    private void Ikon_LaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_LaporanMouseClicked
        // TODO add your handling code here:
        Menu_Laporan.setBackground(new Color (153, 153, 153));
        
        Panel_Frame.removeAll();
        Panel_Frame.add(new Panel_Laporan());
        Panel_Frame.repaint();
        Panel_Frame.revalidate();
        

    }//GEN-LAST:event_Ikon_LaporanMouseClicked

    private void Ikon_KasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ikon_KasirMouseClicked
        // TODO add your handling code here:
        Menu_Kasir.setBackground(new Color (153, 153, 153));
        
        Panel_Frame.removeAll();
        Panel_Frame.add(new Panel_Kasir());
        Panel_Frame.repaint();
        Panel_Frame.revalidate();
        
        Panel_Navigasi.removeAll();
        Panel_Navigasi.add(new NavigasiKasir());
        Panel_Navigasi.repaint();
        Panel_Navigasi.revalidate();
    }//GEN-LAST:event_Ikon_KasirMouseClicked


    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ikon_Barang;
    private javax.swing.JLabel Ikon_Dashboard;
    private javax.swing.JLabel Ikon_Kasir;
    private javax.swing.JLabel Ikon_Laporan;
    private Cob.PanelCustom Menu_Barang;
    private Cob.PanelCustom Menu_Dashboard;
    private Cob.PanelCustom Menu_Kasir;
    private Cob.PanelCustom Menu_Laporan;
    private javax.swing.JPanel Panel_Frame;
    private Cob.PanelCustom Panel_LogOut;
    private javax.swing.JPanel Panel_Navigasi;
    private Cob.PanelCustom Panel_Sidebar;
    private javax.swing.JLabel Text_Barang;
    private javax.swing.JLabel Text_Dashboard;
    private javax.swing.JLabel Text_Kasir;
    private javax.swing.JLabel Text_LaporanKeluar;
    private javax.swing.JButton Tombol_LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
