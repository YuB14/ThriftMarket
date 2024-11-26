package Apk;

import DataBase.database;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame_Gudang extends javax.swing.JFrame {
    
    private Connection con;

    public Frame_Gudang() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        con = database.getConnection();
        
        LabelMenu_Dashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Dashboard Dashboard = new Frame_Dashboard();
                Dashboard.setVisible(true);
                dispose();
            }
        });
        
        LabelMenu_Barang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Barang Barang = new Frame_Barang();
                Barang.setVisible(true);
                dispose();
            }
        });
        
        LabelMenu_Laporan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Laporan Laporan = new Frame_Laporan();
                Laporan.setVisible(true);
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMenu_Dashboard = new javax.swing.JLabel();
        LabelMenu_Barang = new javax.swing.JLabel();
        LabelMenu_Gudang = new javax.swing.JLabel();
        LabelMenu_Kasir = new javax.swing.JLabel();
        LabelMenu_Laporan = new javax.swing.JLabel();
        Text_Pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Data = new javax.swing.JTable();
        LabelText_MenuDashboard = new javax.swing.JLabel();
        LabelText_MenuBarang = new javax.swing.JLabel();
        LabelText_MenuGudang = new javax.swing.JLabel();
        LabelText_MenuKasir = new javax.swing.JLabel();
        LabelText_MenuLaporan = new javax.swing.JLabel();
        Label_Search = new javax.swing.JLabel();
        Tombol_LogOut = new javax.swing.JButton();
        Label_FrameGudang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelMenu_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Dashboard (1)_1.png"))); // NOI18N
        LabelMenu_Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 70));

        LabelMenu_Barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuBarang.png"))); // NOI18N
        LabelMenu_Barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 70));

        LabelMenu_Gudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Gudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Gudang (1)_1.png"))); // NOI18N
        LabelMenu_Gudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Gudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 70));

        LabelMenu_Kasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Kasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuKasir.png"))); // NOI18N
        LabelMenu_Kasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 70));

        LabelMenu_Laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuLaporan.png"))); // NOI18N
        LabelMenu_Laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 170, 70));

        Text_Pencarian.setText("Pencarian...");
        Text_Pencarian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Text_Pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Text_PencarianKeyTyped(evt);
            }
        });
        getContentPane().add(Text_Pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 1080, 42));

        Tabel_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Kategori", "Nama Kategori", "Nama Barang", "Jumlah Barang", "Harga Barang", "Deskripsi Barang"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 1120, 460));

        LabelText_MenuDashboard.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuDashboard.setText("DASHBOARD");
        getContentPane().add(LabelText_MenuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 190, 80, 20));

        LabelText_MenuBarang.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuBarang.setText("BARANG");
        getContentPane().add(LabelText_MenuBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 50, 20));

        LabelText_MenuGudang.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuGudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuGudang.setText("GUDANG");
        getContentPane().add(LabelText_MenuGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 60, 20));

        LabelText_MenuKasir.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuKasir.setText("KASIR");
        getContentPane().add(LabelText_MenuKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 50, 20));

        LabelText_MenuLaporan.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuLaporan.setText("LAPORAN");
        getContentPane().add(LabelText_MenuLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 60, 20));

        Label_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Search.png"))); // NOI18N
        getContentPane().add(Label_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 30, 40));

        Tombol_LogOut.setText("Log Out");
        Tombol_LogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_LogOut.setContentAreaFilled(false);
        Tombol_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tombol_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tombol_LogOutMouseClicked(evt);
            }
        });
        getContentPane().add(Tombol_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 620, 80, 30));

        Label_FrameGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Frame_Gudang.png"))); // NOI18N
        getContentPane().add(Label_FrameGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Text_PencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_PencarianKeyTyped
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tabel_Data.getModel();
        model.setRowCount(0);
        
        String cari = Text_Pencarian.getText();

        try {
            
            String sql = "SELECT * FROM tabel_barang WHERE Nama_Kategori LIKE ? OR Nama_Barang LIKE ? OR Jumlah_Barang LIKE ? OR Harga_Barang LIKE ? OR Deskripsi_Barang LIKE ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,"%" + cari + "%");
            st.setString(2,"%" + cari + "%");
            st.setString(3,"%" + cari + "%");
            st.setString(4,"%" + cari + "%");
            st.setString(5,"%" + cari + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int idkategori = rs.getInt("ID_Kategori");
                String namakategori = rs.getString("Nama_Kategori");
                String namabarang = rs.getString("Nama_Barang");
                int jumlahbarang = rs.getInt("Jumlah_Barang");
                int harga = rs.getInt("Harga_Barang");
                String deskripsi = rs.getString("Deskripsi_Barang");

                Object[] rowData = {idkategori, namakategori, namabarang, jumlahbarang, harga, deskripsi};
                model.addRow(rowData);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            Logger.getLogger(Frame_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, e);

        }
    }//GEN-LAST:event_Text_PencarianKeyTyped

    private void Tombol_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_LogOutMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION) {
            Frame_Login login = new Frame_Login();
            dispose();
            login.setVisible(true);
        }
    }//GEN-LAST:event_Tombol_LogOutMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Gudang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMenu_Barang;
    private javax.swing.JLabel LabelMenu_Dashboard;
    private javax.swing.JLabel LabelMenu_Gudang;
    private javax.swing.JLabel LabelMenu_Kasir;
    private javax.swing.JLabel LabelMenu_Laporan;
    private javax.swing.JLabel LabelText_MenuBarang;
    private javax.swing.JLabel LabelText_MenuDashboard;
    private javax.swing.JLabel LabelText_MenuGudang;
    private javax.swing.JLabel LabelText_MenuKasir;
    private javax.swing.JLabel LabelText_MenuLaporan;
    private javax.swing.JLabel Label_FrameGudang;
    private javax.swing.JLabel Label_Search;
    private javax.swing.JTable Tabel_Data;
    private javax.swing.JTextField Text_Pencarian;
    private javax.swing.JButton Tombol_LogOut;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
