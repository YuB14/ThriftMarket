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

public class Panel_Kasir extends javax.swing.JPanel {

    DefaultTableModel model;
    private Connection conn;

    public Panel_Kasir() {
        initComponents();
        DataBarang();
        String[] judul = {"Id transaksi", "Nama pelanggan", "Barang", "Tanggal", "Jumlah", "Total"};
        model = new DefaultTableModel(judul, 0);
        Tabel_Transaksi.setModel(model);

        DataTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_ID_Kategori = new Cob.PanelCustom();
        Text_ID_Kategori = new javax.swing.JTextField();
        Panel_NamaPembeli = new Cob.PanelCustom();
        Text_NamaPembeli = new javax.swing.JTextField();
        Panel_NamaBarang = new Cob.PanelCustom();
        Text_NamaBarang = new javax.swing.JComboBox<>();
        Panel_TanggalTransaksi = new Cob.PanelCustom();
        J_TanggalTransaksi = new com.toedter.calendar.JDateChooser();
        Panel_JumlahHarga = new Cob.PanelCustom();
        Spinner_JumlahBarang = new javax.swing.JSpinner();
        Panel_TotalHarga = new Cob.PanelCustom();
        Text_TotalHarga = new javax.swing.JTextField();
        Panel_Tambah = new Cob.PanelCustom();
        Tombol_Tambah = new javax.swing.JButton();
        Panel_Perbarui = new Cob.PanelCustom();
        Tombol_Perbarui = new javax.swing.JButton();
        Panel_Batal = new Cob.PanelCustom();
        Tombol_Batal = new javax.swing.JButton();
        Panel_Hapus = new Cob.PanelCustom();
        Tombol_Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Transaksi = new javax.swing.JTable();
        Label_ID_Kategori = new javax.swing.JLabel();
        Label_NamaPembeli = new javax.swing.JLabel();
        Label_NamaBarang = new javax.swing.JLabel();
        Label_TanggalTransaksi = new javax.swing.JLabel();
        Label_JumlahBarang = new javax.swing.JLabel();
        Label_TotalHarga = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        Panel_ID_Kategori.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ID_Kategori.setRoundBottomLeft(40);
        Panel_ID_Kategori.setRoundBottomRight(40);
        Panel_ID_Kategori.setRoundTopLeft(40);
        Panel_ID_Kategori.setRoundTopRight(40);

        Text_ID_Kategori.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_ID_KategoriLayout = new javax.swing.GroupLayout(Panel_ID_Kategori);
        Panel_ID_Kategori.setLayout(Panel_ID_KategoriLayout);
        Panel_ID_KategoriLayout.setHorizontalGroup(
            Panel_ID_KategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ID_KategoriLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(Text_ID_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        Panel_ID_KategoriLayout.setVerticalGroup(
            Panel_ID_KategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ID_KategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_ID_Kategori, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_NamaPembeli.setBackground(new java.awt.Color(255, 255, 255));
        Panel_NamaPembeli.setRoundBottomLeft(40);
        Panel_NamaPembeli.setRoundBottomRight(40);
        Panel_NamaPembeli.setRoundTopLeft(40);
        Panel_NamaPembeli.setRoundTopRight(40);

        Text_NamaPembeli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_NamaPembeliLayout = new javax.swing.GroupLayout(Panel_NamaPembeli);
        Panel_NamaPembeli.setLayout(Panel_NamaPembeliLayout);
        Panel_NamaPembeliLayout.setHorizontalGroup(
            Panel_NamaPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaPembeliLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Text_NamaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_NamaPembeliLayout.setVerticalGroup(
            Panel_NamaPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaPembeliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_NamaPembeli, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_NamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        Panel_NamaBarang.setRoundBottomLeft(40);
        Panel_NamaBarang.setRoundBottomRight(40);
        Panel_NamaBarang.setRoundTopLeft(40);
        Panel_NamaBarang.setRoundTopRight(40);

        Text_NamaBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Text_NamaBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Text_NamaBarang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Text_NamaBarangItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Panel_NamaBarangLayout = new javax.swing.GroupLayout(Panel_NamaBarang);
        Panel_NamaBarang.setLayout(Panel_NamaBarangLayout);
        Panel_NamaBarangLayout.setHorizontalGroup(
            Panel_NamaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaBarangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Text_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_NamaBarangLayout.setVerticalGroup(
            Panel_NamaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_TanggalTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        Panel_TanggalTransaksi.setRoundBottomLeft(40);
        Panel_TanggalTransaksi.setRoundBottomRight(40);
        Panel_TanggalTransaksi.setRoundTopLeft(40);
        Panel_TanggalTransaksi.setRoundTopRight(40);

        J_TanggalTransaksi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_TanggalTransaksiLayout = new javax.swing.GroupLayout(Panel_TanggalTransaksi);
        Panel_TanggalTransaksi.setLayout(Panel_TanggalTransaksiLayout);
        Panel_TanggalTransaksiLayout.setHorizontalGroup(
            Panel_TanggalTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(Panel_TanggalTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_TanggalTransaksiLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(J_TanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        Panel_TanggalTransaksiLayout.setVerticalGroup(
            Panel_TanggalTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Panel_TanggalTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_TanggalTransaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(J_TanggalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        Panel_JumlahHarga.setBackground(new java.awt.Color(255, 255, 255));
        Panel_JumlahHarga.setRoundBottomLeft(40);
        Panel_JumlahHarga.setRoundBottomRight(40);
        Panel_JumlahHarga.setRoundTopLeft(40);
        Panel_JumlahHarga.setRoundTopRight(40);

        Spinner_JumlahBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Spinner_JumlahBarang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner_JumlahBarangStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Panel_JumlahHargaLayout = new javax.swing.GroupLayout(Panel_JumlahHarga);
        Panel_JumlahHarga.setLayout(Panel_JumlahHargaLayout);
        Panel_JumlahHargaLayout.setHorizontalGroup(
            Panel_JumlahHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_JumlahHargaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner_JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        Panel_JumlahHargaLayout.setVerticalGroup(
            Panel_JumlahHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_JumlahHargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Spinner_JumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_TotalHarga.setBackground(new java.awt.Color(255, 255, 255));
        Panel_TotalHarga.setRoundBottomLeft(40);
        Panel_TotalHarga.setRoundBottomRight(40);
        Panel_TotalHarga.setRoundTopLeft(40);
        Panel_TotalHarga.setRoundTopRight(40);

        Text_TotalHarga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_TotalHargaLayout = new javax.swing.GroupLayout(Panel_TotalHarga);
        Panel_TotalHarga.setLayout(Panel_TotalHargaLayout);
        Panel_TotalHargaLayout.setHorizontalGroup(
            Panel_TotalHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TotalHargaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Text_TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_TotalHargaLayout.setVerticalGroup(
            Panel_TotalHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TotalHargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Tambah.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Tambah.setRoundBottomLeft(40);
        Panel_Tambah.setRoundBottomRight(40);
        Panel_Tambah.setRoundTopLeft(40);
        Panel_Tambah.setRoundTopRight(40);

        Tombol_Tambah.setText("Tambah");
        Tombol_Tambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Tambah.setContentAreaFilled(false);
        Tombol_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_TambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_TambahLayout = new javax.swing.GroupLayout(Panel_Tambah);
        Panel_Tambah.setLayout(Panel_TambahLayout);
        Panel_TambahLayout.setHorizontalGroup(
            Panel_TambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TambahLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Tombol_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Panel_TambahLayout.setVerticalGroup(
            Panel_TambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Tambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Panel_Perbarui.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Perbarui.setRoundBottomLeft(40);
        Panel_Perbarui.setRoundBottomRight(40);
        Panel_Perbarui.setRoundTopLeft(40);
        Panel_Perbarui.setRoundTopRight(40);

        Tombol_Perbarui.setText("Perbarui");
        Tombol_Perbarui.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Perbarui.setContentAreaFilled(false);
        Tombol_Perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_PerbaruiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_PerbaruiLayout = new javax.swing.GroupLayout(Panel_Perbarui);
        Panel_Perbarui.setLayout(Panel_PerbaruiLayout);
        Panel_PerbaruiLayout.setHorizontalGroup(
            Panel_PerbaruiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PerbaruiLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        Panel_PerbaruiLayout.setVerticalGroup(
            Panel_PerbaruiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Panel_Batal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Batal.setRoundBottomLeft(40);
        Panel_Batal.setRoundBottomRight(40);
        Panel_Batal.setRoundTopLeft(40);
        Panel_Batal.setRoundTopRight(40);

        Tombol_Batal.setText("Batal");
        Tombol_Batal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Batal.setContentAreaFilled(false);

        javax.swing.GroupLayout Panel_BatalLayout = new javax.swing.GroupLayout(Panel_Batal);
        Panel_Batal.setLayout(Panel_BatalLayout);
        Panel_BatalLayout.setHorizontalGroup(
            Panel_BatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BatalLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Tombol_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        Panel_BatalLayout.setVerticalGroup(
            Panel_BatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Batal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Panel_Hapus.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Hapus.setRoundBottomLeft(40);
        Panel_Hapus.setRoundBottomRight(40);
        Panel_Hapus.setRoundTopLeft(40);
        Panel_Hapus.setRoundTopRight(40);

        Tombol_Hapus.setText("Hapus");
        Tombol_Hapus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Hapus.setContentAreaFilled(false);
        Tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_HapusLayout = new javax.swing.GroupLayout(Panel_Hapus);
        Panel_Hapus.setLayout(Panel_HapusLayout);
        Panel_HapusLayout.setHorizontalGroup(
            Panel_HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_HapusLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Tombol_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        Panel_HapusLayout.setVerticalGroup(
            Panel_HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Hapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Tabel_Transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Transaksi);

        Label_ID_Kategori.setText("ID_Kategori");

        Label_NamaPembeli.setText("Nama Pembeli");

        Label_NamaBarang.setText("Nama Barang");
        Label_NamaBarang.setToolTipText("");

        Label_TanggalTransaksi.setText("Tanggal Transaksi");

        Label_JumlahBarang.setText("Jumlah Barang");

        Label_TotalHarga.setText("Total Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Label_NamaPembeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_TanggalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(Label_ID_Kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Panel_NamaPembeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Panel_ID_Kategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Panel_TanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Panel_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Panel_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(Panel_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(Panel_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_JumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(Label_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Panel_JumlahHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(764, 764, 764))
                                    .addComponent(Panel_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_ID_Kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_ID_Kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_NamaPembeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_NamaPembeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_TanggalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(Panel_TanggalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_JumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_JumlahHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tombol_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_TambahActionPerformed
        // TODO add your handling code here:
        String namapembeli = Text_NamaPembeli.getText();
        String namabarang = (String) Text_NamaBarang.getSelectedItem();
        Date tanggal = J_TanggalTransaksi.getDate();
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String totalharga = Text_TotalHarga.getText();

//        validasi wajib di isi
        if (jumlahbarang == 0 || tanggal == null || namapembeli.isEmpty() || namabarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Terisi", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection conn = database.getConnection();
            java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());
            String[] splits = namabarang.split(" -- ");

            String sql = "INSERT INTO tabel_transaksi (ID_Barang, tanggal_transaksi, nama_pelanggan, jumlah_beli, total_bayar) VALUES (?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(splits[0]));
            st.setDate(2, sqlDate);
            st.setString(3, namapembeli);
            st.setInt(4, jumlahbarang);
            st.setInt(5, Integer.parseInt(totalharga));

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
            JOptionPane.showMessageDialog(this, "Gagal Menambahkan Data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Frame_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Tombol_TambahActionPerformed

    private void Tombol_PerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tombol_PerbaruiActionPerformed

    private void Tombol_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_HapusActionPerformed
        // TODO add your handling code here:
        // Ambil baris yang dipilih pada tabel
        int selectedRow = Tabel_Transaksi.getSelectedRow();

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
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus.");
                DataTransaksi(); // Memuat ulang data tabel
            } else {
                JOptionPane.showMessageDialog(this, "Gagal Menghapus Data.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_Tombol_HapusActionPerformed

    private void Spinner_JumlahBarangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner_JumlahBarangStateChanged
        // TODO add your handling code here:
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String namabarang = (String) Text_NamaBarang.getSelectedItem();
        
        String[] splits = namabarang.split(" -- ");
        Integer hasil = 0;
        
         if (namabarang != null && jumlahbarang != 0) {
            hasil = jumlahbarang * Integer.parseInt(splits[2]);
         }
        Text_TotalHarga.setText(hasil.toString());
    }//GEN-LAST:event_Spinner_JumlahBarangStateChanged

    private void Text_NamaBarangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Text_NamaBarangItemStateChanged
        // TODO add your handling code here:
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String namabarang = (String) Text_NamaBarang.getSelectedItem();
        
        String[] splits = namabarang.split(" -- ");
        Integer hasil = 0;
        
         if (namabarang != null && jumlahbarang != 0) {
            hasil = jumlahbarang * Integer.parseInt(splits[2]);
         }
        Text_TotalHarga.setText(hasil.toString());
    }//GEN-LAST:event_Text_NamaBarangItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser J_TanggalTransaksi;
    private javax.swing.JLabel Label_ID_Kategori;
    private javax.swing.JLabel Label_JumlahBarang;
    private javax.swing.JLabel Label_NamaBarang;
    private javax.swing.JLabel Label_NamaPembeli;
    private javax.swing.JLabel Label_TanggalTransaksi;
    private javax.swing.JLabel Label_TotalHarga;
    private Cob.PanelCustom Panel_Batal;
    private Cob.PanelCustom Panel_Hapus;
    private Cob.PanelCustom Panel_ID_Kategori;
    private Cob.PanelCustom Panel_JumlahHarga;
    private Cob.PanelCustom Panel_NamaBarang;
    private Cob.PanelCustom Panel_NamaPembeli;
    private Cob.PanelCustom Panel_Perbarui;
    private Cob.PanelCustom Panel_Tambah;
    private Cob.PanelCustom Panel_TanggalTransaksi;
    private Cob.PanelCustom Panel_TotalHarga;
    private javax.swing.JSpinner Spinner_JumlahBarang;
    private javax.swing.JTable Tabel_Transaksi;
    private javax.swing.JTextField Text_ID_Kategori;
    private javax.swing.JComboBox<String> Text_NamaBarang;
    private javax.swing.JTextField Text_NamaPembeli;
    private javax.swing.JTextField Text_TotalHarga;
    private javax.swing.JButton Tombol_Batal;
    private javax.swing.JButton Tombol_Hapus;
    private javax.swing.JButton Tombol_Perbarui;
    private javax.swing.JButton Tombol_Tambah;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void DataBarang() {
        try {
            Connection conn = database.getConnection();
            if (conn != null) {
                String sql = "SELECT Nama_Barang,Harga_Barang,id_barang FROM tabel_barang";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet rs = stat.executeQuery();

                Text_NamaBarang.removeAllItems();
                Text_NamaBarang.addItem("--- pilih barang ---");

                while (rs.next()) {
                    String item = rs.getInt("id_barang") + " -- " + rs.getString("Nama_Barang") + " -- " + rs.getString("Harga_Barang");
                    Text_NamaBarang.addItem(item);
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

    private void DataTransaksi() {
        DefaultTableModel model = (DefaultTableModel) Tabel_Transaksi.getModel();
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

    private void resetForm() {
        Text_ID_Kategori.setText("");
        Text_NamaPembeli.setText("");
        Text_NamaBarang.setSelectedItem(0);
        J_TanggalTransaksi.setDate(null);
        Spinner_JumlahBarang.setValue(0);
        Text_TotalHarga.setText("");
    }
}
