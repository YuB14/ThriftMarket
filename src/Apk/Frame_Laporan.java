package Apk;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame_Laporan extends javax.swing.JFrame {

    public Frame_Laporan() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Label_MenuDashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Dashboard Dashboard = new Frame_Dashboard();
                Dashboard.setVisible(true);
                dispose();
            }
        });
        
         Label_MenuBarang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Barang Barang = new Frame_Barang();
                Barang.setVisible(true);
                dispose();
            }
        });
         
          Label_MenuGudang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Gudang Gudang = new Frame_Gudang();
                Gudang.setVisible(true);
                dispose();
            }
        });
          
          Text_Pencarian.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian...");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_IkonPencarian = new javax.swing.JLabel();
        Label_MenuDashboard = new javax.swing.JLabel();
        Label_MenuBarang = new javax.swing.JLabel();
        Label_MenuGudang = new javax.swing.JLabel();
        Label_MenuKasir = new javax.swing.JLabel();
        Label_MenuLaporan = new javax.swing.JLabel();
        Tombol_LogOut = new javax.swing.JButton();
        Text_Pencarian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Label_FrameLaporan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/UI/Logo Mythrift.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_IkonPencarian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_IkonPencarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Search.png"))); // NOI18N
        getContentPane().add(Label_IkonPencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 140, 30, 40));

        Label_MenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MenuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Dashboard (1)_1.png"))); // NOI18N
        Label_MenuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_MenuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 70));

        Label_MenuBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MenuBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuBarang.png"))); // NOI18N
        Label_MenuBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_MenuBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 70));

        Label_MenuGudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MenuGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Gudang (1)_1.png"))); // NOI18N
        Label_MenuGudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_MenuGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 70));

        Label_MenuKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MenuKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuKasir.png"))); // NOI18N
        Label_MenuKasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_MenuKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 70));

        Label_MenuLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MenuLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuLaporan.png"))); // NOI18N
        getContentPane().add(Label_MenuLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 170, 70));

        Tombol_LogOut.setText("Log Out");
        Tombol_LogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_LogOut.setContentAreaFilled(false);
        Tombol_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tombol_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tombol_LogOutMouseClicked(evt);
            }
        });
        getContentPane().add(Tombol_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 620, 80, 30));

        Text_Pencarian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_Pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 1080, 40));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DASHBOARD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 20));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BARANG");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 50, 20));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("GUDANG");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 370, 50, 20));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("KASIR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 50, 20));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LAPORAN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 550, 60, 20));

        Label_FrameLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Frame_Laporan.png"))); // NOI18N
        getContentPane().add(Label_FrameLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tombol_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_LogOutMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION) {
            Frame_Login login = new Frame_Login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Tombol_LogOutMouseClicked

    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_FrameLaporan;
    private javax.swing.JLabel Label_IkonPencarian;
    private javax.swing.JLabel Label_MenuBarang;
    private javax.swing.JLabel Label_MenuDashboard;
    private javax.swing.JLabel Label_MenuGudang;
    private javax.swing.JLabel Label_MenuKasir;
    private javax.swing.JLabel Label_MenuLaporan;
    private javax.swing.JTextField Text_Pencarian;
    private javax.swing.JButton Tombol_LogOut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
