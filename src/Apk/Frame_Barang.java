package Apk;

import DataBase.database;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame_Barang extends javax.swing.JFrame {
    
    private Connection con;

    public Frame_Barang() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        con = database.getConnection();
        MengambilData();
        nonaktifButton();
        aktifButton();
        
        LabelMenu_FrameDashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Membuka JFrame Login
                Frame_Dashboard Frame_DashboardFrame = new Frame_Dashboard();
                Frame_DashboardFrame.setVisible(true);
                dispose();
            }
        });
        
        LabelMenu_Barang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Membuka JFrame Login
                Frame_Barang Frame_BarangFrame = new Frame_Barang();
                Frame_BarangFrame.setVisible(true);
                dispose();
            }
        });
        
        LabelMenu_Gudang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Membuka JFrame Login
                Frame_Gudang Frame_GudangFrame = new Frame_Gudang();
                Frame_GudangFrame.setVisible(true);
                dispose();
            }
        });
    }
    
        private void MengambilData() {
            DefaultTableModel model = (DefaultTableModel) Tabel_Data.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM tabel_barang";
            PreparedStatement st = con.prepareStatement(sql);
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMenu_FrameDashboard = new javax.swing.JLabel();
        LabelMenu_Gudang = new javax.swing.JLabel();
        LabelMenu_Barang = new javax.swing.JLabel();
        LabelMenu_Kasir = new javax.swing.JLabel();
        LabelMenu_Laporan = new javax.swing.JLabel();
        Tombol_LogOut = new javax.swing.JButton();
        Text_NamaKategori = new javax.swing.JTextField();
        Text_NamaBarang = new javax.swing.JTextField();
        Text_JumlahBarang = new javax.swing.JTextField();
        Text_Harga = new javax.swing.JTextField();
        Text_Deskripsi = new javax.swing.JTextField();
        Tombol_Tambah = new javax.swing.JButton();
        Tombol_Perbarui = new javax.swing.JButton();
        Tombol_Batal = new javax.swing.JButton();
        Tombol_Hapus = new javax.swing.JButton();
        Text_Pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Data = new javax.swing.JTable();
        LabelText_Dashboard = new javax.swing.JLabel();
        LabelText_Gudang = new javax.swing.JLabel();
        LabelText_Barang = new javax.swing.JLabel();
        LabelText_MenuKasir = new javax.swing.JLabel();
        LabelText_MenuLaporan = new javax.swing.JLabel();
        Label_FrameBarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelMenu_FrameDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_FrameDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Dashboard (1)_1.png"))); // NOI18N
        LabelMenu_FrameDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_FrameDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 70));

        LabelMenu_Gudang.setForeground(new java.awt.Color(255, 255, 255));
        LabelMenu_Gudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Gudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Gudang (1)_1.png"))); // NOI18N
        LabelMenu_Gudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Gudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 70));

        LabelMenu_Barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuBarang.png"))); // NOI18N
        LabelMenu_Barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 70));

        LabelMenu_Kasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Kasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuKasir.png"))); // NOI18N
        LabelMenu_Kasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 70));

        LabelMenu_Laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu_Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/MenuLaporan.png"))); // NOI18N
        LabelMenu_Laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LabelMenu_Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 170, 60));

        Tombol_LogOut.setText("Log Out");
        Tombol_LogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_LogOut.setContentAreaFilled(false);
        Tombol_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Tombol_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 620, 80, 30));

        Text_NamaKategori.setText("Nama Kategori");
        Text_NamaKategori.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_NamaKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 330, 30));

        Text_NamaBarang.setText("Nama Barang");
        Text_NamaBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_NamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 330, 30));

        Text_JumlahBarang.setText("Jumlah Barang");
        Text_JumlahBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_JumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 330, 30));

        Text_Harga.setText("Harga Barang");
        Text_Harga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Text_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_HargaActionPerformed(evt);
            }
        });
        getContentPane().add(Text_Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 330, 30));

        Text_Deskripsi.setText("Deskripsi Barang");
        Text_Deskripsi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_Deskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 330, 30));

        Tombol_Tambah.setText("Tambah");
        Tombol_Tambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Tambah.setContentAreaFilled(false);
        Tombol_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tombol_Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 580, 70, 30));

        Tombol_Perbarui.setText("Perbarui");
        Tombol_Perbarui.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Perbarui.setContentAreaFilled(false);
        Tombol_Perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_PerbaruiActionPerformed(evt);
            }
        });
        getContentPane().add(Tombol_Perbarui, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 580, 70, 30));

        Tombol_Batal.setText("Batal");
        Tombol_Batal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Batal.setContentAreaFilled(false);
        Tombol_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_BatalActionPerformed(evt);
            }
        });
        getContentPane().add(Tombol_Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 60, 30));

        Tombol_Hapus.setText("Hapus");
        Tombol_Hapus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Hapus.setContentAreaFilled(false);
        Tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Tombol_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 60, 30));

        Text_Pencarian.setText("Pencarian...");
        Text_Pencarian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Text_Pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Text_PencarianKeyTyped(evt);
            }
        });
        getContentPane().add(Text_Pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 730, 40));

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
        Tabel_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 206, 740, 480));

        LabelText_Dashboard.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_Dashboard.setText("DASHBOARD");
        getContentPane().add(LabelText_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 20));

        LabelText_Gudang.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_Gudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_Gudang.setText("GUDANG");
        getContentPane().add(LabelText_Gudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 60, 20));

        LabelText_Barang.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_Barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_Barang.setText("BARANG");
        getContentPane().add(LabelText_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 70, 20));

        LabelText_MenuKasir.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuKasir.setText("KASIR");
        getContentPane().add(LabelText_MenuKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 465, 60, -1));

        LabelText_MenuLaporan.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        LabelText_MenuLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelText_MenuLaporan.setText("LAPORAN");
        getContentPane().add(LabelText_MenuLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 60, -1));

        Label_FrameBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Frame_Barang.png"))); // NOI18N
        getContentPane().add(Label_FrameBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tombol_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_TambahActionPerformed
        // TODO add your handling code here:
        String namakategori = Text_NamaKategori.getText();
        String namabarang = Text_NamaBarang.getText();
        String jumlahbarang = Text_JumlahBarang.getText();
        String hargabarang = Text_Harga.getText();
        String deskripsibarang = Text_Deskripsi.getText();

        if (namakategori.isEmpty() || namabarang.isEmpty() || jumlahbarang.isEmpty() || hargabarang.isEmpty() || deskripsibarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int jumlah = Integer.parseInt(jumlahbarang);
            int harga = Integer.parseInt(hargabarang);

            String sql = "INSERT INTO tabel_barang (Nama_Kategori, Nama_Barang, Jumlah_Barang, Harga_Barang, Deskripsi_Barang) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namakategori);
            st.setString(2, namabarang);
            st.setInt(3, jumlah);
            st.setInt(4, harga);
            st.setString(5, deskripsibarang);

            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm(); // Pastikan method ini ada dan berfungsi.
                MengambilData(); // Pastikan method ini memuat ulang data.
            }
            st.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah dan Harga harus berupa angka!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Frame_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Tombol_TambahActionPerformed

    private void Tombol_PerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiActionPerformed
        // TODO add your handling code here:
        int selectedRow = Tabel_Data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Baris Yang Akan Di Perbarui");
            return;
        }

        // Ambil ID_Kategori dari kolom yang sesuai
        int indexKolomID = 0; // Pastikan kolom ke-0 adalah kolom ID_Kategori
        String idkategori = Tabel_Data.getValueAt(selectedRow, indexKolomID).toString();

        String namakategori = Text_NamaKategori.getText();
        String namabarang = Text_NamaBarang.getText();
        String jumlahbarang = Text_JumlahBarang.getText();
        String hargabarang = Text_Harga.getText();
        String deskripsibarang = Text_Deskripsi.getText();

        if (namakategori.isEmpty() || namabarang.isEmpty() || jumlahbarang.isEmpty() || hargabarang.isEmpty() || deskripsibarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int jumlah = Integer.parseInt(jumlahbarang);
            int harga = Integer.parseInt(hargabarang);

            // Query SQL untuk update
            String sql = "UPDATE tabel_barang SET Nama_Kategori =?, Nama_Barang=?, Jumlah_Barang=?, Harga_Barang=?, Deskripsi_Barang=? WHERE ID_Kategori=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, namakategori);
            st.setString(2, namabarang);
            st.setInt(3, jumlah);
            st.setInt(4, harga);
            st.setString(5, deskripsibarang);
            st.setString(6, idkategori); // Set parameter ID_Kategori

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                MengambilData(); // Refresh data tabel
                resetForm(); // Reset input form
            } else {
                JOptionPane.showMessageDialog(this, "Tidak ada data yang diperbarui. Periksa ID Kategori.");
            }

            st.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah dan Harga harus berupa angka.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            Logger.getLogger(Frame_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Tombol_PerbaruiActionPerformed

    private void Tombol_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_BatalActionPerformed
        // TODO add your handling code here:
        resetForm();
        aktifButton();
        nonaktifButton();
    }//GEN-LAST:event_Tombol_BatalActionPerformed

    private void Tombol_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_HapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = Tabel_Data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Baris Yang Akan Dihapus");
            return;
        }

        // Ambil ID_Kategori dari kolom yang sesuai
        int indexKolomID = 0; // Pastikan kolom ke-0 adalah kolom ID_Kategori
        String idkategori = Tabel_Data.getValueAt(selectedRow, indexKolomID).toString();
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data Ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION) {
            
        try {
            String sql = "DELETE FROM tabel_barang WHERE ID_Kategori=?";
            PreparedStatement st = con. prepareStatement(sql);
            st.setString(1, idkategori);
            
            int rowDelete = st.executeUpdate();
            if(rowDelete > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");   
            }
            
            st.close();
                
        } catch(Exception e) {
            Logger.getLogger(Frame_Dashboard.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        MengambilData();
        aktifButton();
        nonaktifButton();
    }//GEN-LAST:event_Tombol_HapusActionPerformed

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

    private void Tabel_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_DataMouseClicked
        // TODO add your handling code here:
        int selectedRow = Tabel_Data.getSelectedRow();
        if (selectedRow != -1) {
            String namakategori = Tabel_Data.getValueAt(selectedRow, 1).toString();
            String namabarang = Tabel_Data.getValueAt(selectedRow, 2).toString();
            String jumlahbarang = Tabel_Data.getValueAt(selectedRow, 3).toString();
            String hargabarang = Tabel_Data.getValueAt(selectedRow, 4).toString();
            String deskripsibarang = Tabel_Data.getValueAt(selectedRow, 5).toString();

            Text_NamaKategori.setText(namakategori);
            Text_NamaBarang.setText(namabarang);
            Text_JumlahBarang.setText(jumlahbarang);
            Text_Harga.setText(hargabarang);
            Text_Deskripsi.setText(deskripsibarang);

        }
        
        Tombol_Tambah.setEnabled(false);
        Tombol_Batal.setEnabled(true);
        Tombol_Perbarui.setEnabled(true);
        Tombol_Hapus.setEnabled(true);
        
    }//GEN-LAST:event_Tabel_DataMouseClicked

    private void Text_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_HargaActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMenu_Barang;
    private javax.swing.JLabel LabelMenu_FrameDashboard;
    private javax.swing.JLabel LabelMenu_Gudang;
    private javax.swing.JLabel LabelMenu_Kasir;
    private javax.swing.JLabel LabelMenu_Laporan;
    private javax.swing.JLabel LabelText_Barang;
    private javax.swing.JLabel LabelText_Dashboard;
    private javax.swing.JLabel LabelText_Gudang;
    private javax.swing.JLabel LabelText_MenuKasir;
    private javax.swing.JLabel LabelText_MenuLaporan;
    private javax.swing.JLabel Label_FrameBarang;
    private javax.swing.JTable Tabel_Data;
    private javax.swing.JTextField Text_Deskripsi;
    private javax.swing.JTextField Text_Harga;
    private javax.swing.JTextField Text_JumlahBarang;
    private javax.swing.JTextField Text_NamaBarang;
    private javax.swing.JTextField Text_NamaKategori;
    private javax.swing.JTextField Text_Pencarian;
    private javax.swing.JButton Tombol_Batal;
    private javax.swing.JButton Tombol_Hapus;
    private javax.swing.JButton Tombol_LogOut;
    private javax.swing.JButton Tombol_Perbarui;
    private javax.swing.JButton Tombol_Tambah;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables



    private void nonaktifButton() {
        Tombol_Perbarui.setEnabled(false);
        Tombol_Hapus.setEnabled(false);
    }

    private void aktifButton() {
        Tombol_Tambah.setEnabled(true);
        Tombol_Batal.setEnabled(true);
    }

    private void resetForm() {
        Text_NamaKategori.setText("");
        Text_NamaBarang.setText("");
        Text_JumlahBarang.setText("");
        Text_Harga.setText("");
        Text_Deskripsi.setText("");
    }
}
