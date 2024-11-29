package Apk;

import DataBase.database;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame_Kasir extends javax.swing.JFrame {

    DefaultTableModel model;
    private Connection conn;

    public Frame_Kasir() {
        initComponents();
        dataBarang();
        String[] judul = {"Id transaksi", "Nama pelanggan", "Barang", "Tanggal", "Jumlah", "Total"};
        model = new DefaultTableModel(judul, 0);
        TabelTransaksi.setModel(model);

        DataTransaksi();
    }

    private void DataTransaksi() {
        DefaultTableModel model = (DefaultTableModel) TabelTransaksi.getModel();
        model.setRowCount(0);
        try {
            Connection conn = database.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM tabel_transaksi INNER JOIN tabel_barang ON tabel_transaksi.ID_Barang = tabel_barang.id_barang";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet rs = stat.executeQuery();

                while (rs.next()) {
                    int idtransaksi = rs.getInt("ID_Transaksi");
                    String namabarang = rs.getString("Nama_Barang") + " - " + rs.getString("Nama_kategori");
                    String tanggaltransaksi = rs.getString("tanggal_transaksi");
                    String namapelanggan = rs.getString("nama_pelanggan");
                    int jumlahbeli = rs.getInt("jumlah_beli");
                    int totalbayar = rs.getInt("total_bayar");

                    Object[] rowData = {idtransaksi, namapelanggan, namabarang, tanggaltransaksi, jumlahbeli, totalbayar};
                    model.addRow(rowData);
                }

                rs.close();
                stat.close();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal koneksi ke database");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void dataBarang() {
        try {
            Connection conn = database.getConnection();
            if (conn != null) {
                String sql = "SELECT Nama_Barang,Harga_Barang,id_barang FROM tabel_barang";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet rs = stat.executeQuery();

                comboBarang.removeAllItems();
                comboBarang.addItem("--- pilih barang ---");

                while (rs.next()) {
                    String item = rs.getInt("id_barang")+ " -- "+rs.getString("Nama_Barang") + " -- " + rs.getString("Harga_Barang");
                    comboBarang.addItem(item);
                }

                rs.close();
                stat.close();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal koneksi ke database");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_id_transaksi = new javax.swing.JTextField();
        text_nama_pelanggan = new javax.swing.JTextField();
        text_total_bayar = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_perbarui = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelTransaksi = new javax.swing.JTable();
        comboBarang = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jJumlah_Beli = new javax.swing.JSpinner();
        jTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Transaksi");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Barang");

        jLabel4.setText("Tanggal");

        jLabel5.setText("Jumlah Beli");

        jLabel6.setText("Total Bayar");

        text_id_transaksi.setEnabled(false);
        text_id_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_id_transaksiActionPerformed(evt);
            }
        });

        text_total_bayar.setEnabled(false);
        text_total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_total_bayarActionPerformed(evt);
            }
        });

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_perbarui.setText("PERBARUI");

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        TabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelTransaksi);

        comboBarang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBarangItemStateChanged(evt);
            }
        });
        comboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBarangActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("TRANSAKSI TEGUH");

        jJumlah_Beli.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jJumlah_BeliStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(21, 21, 21)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_id_transaksi)
                            .addComponent(text_nama_pelanggan)
                            .addComponent(text_total_bayar)
                            .addComponent(jJumlah_Beli, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jJumlah_Beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_perbarui))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_id_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_id_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_id_transaksiActionPerformed

    private void text_total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_total_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_total_bayarActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        // Ambil baris yang dipilih pada tabel
    int selectedRow = TabelTransaksi.getSelectedRow();

    // Validasi jika tidak ada baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    //if (selectedRow == -1) {
      //  JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
      //return;
    

    // Konfirmasi sebelum penghapusan
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    // Ambil ID transaksi dari tabel
    int idTransaksi = (int) model.getValueAt(selectedRow, 0);

    try {
        // Koneksi ke database
        Connection conn = database.getConnection();
        String sql = "DELETE FROM tabel_transaksi WHERE ID_Transaksi = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, idTransaksi);

        // Eksekusi query penghapusan
        int rowsDeleted = st.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            DataTransaksi(); // Memuat ulang data tabel
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        st.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        String namaPelanggan = text_nama_pelanggan.getText();
        String barang = (String) comboBarang.getSelectedItem();
        Date tanggal = jTanggal.getDate();
        Integer jumlahBeli = (Integer) jJumlah_Beli.getValue();
        String totalBayar = text_total_bayar.getText();
        
//        validasi wajib di isi
        if (jumlahBeli == 0 || tanggal == null || namaPelanggan.isEmpty()|| barang.isEmpty() ){
            JOptionPane.showMessageDialog(this, "semua kolom harus terisi", "peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Connection conn = database.getConnection();
            java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());
            String[] splits = barang.split(" -- ");
            
            String sql = "INSERT INTO tabel_transaksi (ID_Barang, tanggal_transaksi, nama_pelanggan, jumlah_beli, total_bayar) VALUES (?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(splits[0]));
            st.setDate(2, sqlDate);
            st.setString(3, namaPelanggan);
            st.setInt(4, jumlahBeli);
            st.setInt(5, Integer.parseInt(totalBayar));
            
            
            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm(); // Pastikan method ini ada dan berfungsi.
                DataTransaksi(); // Pastikan method ini memuat ulang data.
            }
            st.close();
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah dan Harga harus berupa angka!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Frame_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void resetForm() {
        text_id_transaksi.setText("");
        text_nama_pelanggan.setText("");
        comboBarang.setSelectedItem(0);
        jTanggal.setDate(null);
        jJumlah_Beli.setValue(0);
        text_total_bayar.setText("");
        
    }
    
    private void comboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBarangActionPerformed

    private void jJumlah_BeliStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jJumlah_BeliStateChanged
        // TODO add your handling code here:
        Integer jumlahBeli = (Integer) jJumlah_Beli.getValue();
        String barang = (String) comboBarang.getSelectedItem();
        
        String[] splits = barang.split(" -- ");
        Integer hasil = 0;
        
         if (barang != null && jumlahBeli != 0) {
            hasil = jumlahBeli * Integer.parseInt(splits[2]);
         }
        text_total_bayar.setText(hasil.toString());
    }//GEN-LAST:event_jJumlah_BeliStateChanged

    private void comboBarangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBarangItemStateChanged
        // TODO add your handling code here:
        Integer jumlahBeli = (Integer) jJumlah_Beli.getValue();
        String barang = (String) comboBarang.getSelectedItem();
        
        String[] splits = barang.split(" -- ");
        Integer hasil = 0;
        
         if (barang != null && jumlahBeli != 0) {
            hasil = jumlahBeli * Integer.parseInt(splits[2]);
         }
        text_total_bayar.setText(hasil.toString());
    }//GEN-LAST:event_comboBarangItemStateChanged

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelTransaksi;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> comboBarang;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JSpinner jJumlah_Beli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jTanggal;
    private javax.swing.JTextField text_id_transaksi;
    private javax.swing.JTextField text_nama_pelanggan;
    private javax.swing.JTextField text_total_bayar;
    // End of variables declaration//GEN-END:variables
}
