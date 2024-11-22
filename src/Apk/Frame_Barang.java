package Apk;

import DataBase.database;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BARANG");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GUDANG");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KASIR");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LAPORAN");

        jButton1.setText("Log Out");

        Text_NamaKategori.setText("Nama Kategori");

        Text_NamaBarang.setText("Nama Barang");

        Text_JumlahBarang.setText("Jumlah Barang");

        Text_Harga.setText("Harga Barang");

        Text_Deskripsi.setText("Deskripsi Barang");

        Tombol_Tambah.setText("Tambah");
        Tombol_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_TambahActionPerformed(evt);
            }
        });

        Tombol_Perbarui.setText("Perbarui");
        Tombol_Perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_PerbaruiActionPerformed(evt);
            }
        });

        Tombol_Batal.setText("Batal");
        Tombol_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_BatalActionPerformed(evt);
            }
        });

        Tombol_Hapus.setText("Hapus");
        Tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_HapusActionPerformed(evt);
            }
        });

        Text_Pencarian.setText("Pencarian...");
        Text_Pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Text_PencarianKeyTyped(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tombol_Tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tombol_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tombol_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Text_Harga, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_JumlahBarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_NamaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_NamaKategori, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Deskripsi, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Pencarian)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Text_NamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Text_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Text_JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Text_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Text_Deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tombol_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tombol_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tombol_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Text_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

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
    private javax.swing.JTable Tabel_Data;
    private javax.swing.JTextField Text_Deskripsi;
    private javax.swing.JTextField Text_Harga;
    private javax.swing.JTextField Text_JumlahBarang;
    private javax.swing.JTextField Text_NamaBarang;
    private javax.swing.JTextField Text_NamaKategori;
    private javax.swing.JTextField Text_Pencarian;
    private javax.swing.JButton Tombol_Batal;
    private javax.swing.JButton Tombol_Hapus;
    private javax.swing.JButton Tombol_Perbarui;
    private javax.swing.JButton Tombol_Tambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
