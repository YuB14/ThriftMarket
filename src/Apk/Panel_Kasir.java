package Apk;

import DataBase.database;
import java.awt.Color; 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.mysql.cj.xdevapi.Statement;
//import java.beans.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_Kasir extends javax.swing.JPanel {

    DefaultTableModel model;
    private Connection con;

    public Panel_Kasir() {
        initComponents();
        DataBarang();
        String[] judul = {"ID Transaksi", "Nama Pembeli", "Nama Barang", "Tanggal Transaksi", "Jumlah Barang", "Total Harga"};
        model = new DefaultTableModel(judul, 0);
        Tabel_Transaksi.setModel(model);

        DataTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_ID_Kategori = new Cob.PanelCustom();
        Text_ID_Transaksi = new javax.swing.JTextField();
        Panel_NamaPembeli = new Cob.PanelCustom();
        Text_NamaPembeli = new javax.swing.JTextField();
        Panel_NamaBarang = new Cob.PanelCustom();
        Combo_NamaBarang = new javax.swing.JComboBox<>();
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

        Text_ID_Transaksi.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        Text_ID_Transaksi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_ID_KategoriLayout = new javax.swing.GroupLayout(Panel_ID_Kategori);
        Panel_ID_Kategori.setLayout(Panel_ID_KategoriLayout);
        Panel_ID_KategoriLayout.setHorizontalGroup(
            Panel_ID_KategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ID_KategoriLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(Text_ID_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        Panel_ID_KategoriLayout.setVerticalGroup(
            Panel_ID_KategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ID_KategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_ID_Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_NamaPembeli.setBackground(new java.awt.Color(255, 255, 255));
        Panel_NamaPembeli.setRoundBottomLeft(40);
        Panel_NamaPembeli.setRoundBottomRight(40);
        Panel_NamaPembeli.setRoundTopLeft(40);
        Panel_NamaPembeli.setRoundTopRight(40);

        Text_NamaPembeli.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
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

        Combo_NamaBarang.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        Combo_NamaBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Combo_NamaBarang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Combo_NamaBarangItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Panel_NamaBarangLayout = new javax.swing.GroupLayout(Panel_NamaBarang);
        Panel_NamaBarang.setLayout(Panel_NamaBarangLayout);
        Panel_NamaBarangLayout.setHorizontalGroup(
            Panel_NamaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaBarangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Combo_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_NamaBarangLayout.setVerticalGroup(
            Panel_NamaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Combo_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
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

        Text_TotalHarga.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
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

        Tombol_Tambah.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        Tombol_Tambah.setText("Tambah");
        Tombol_Tambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Tambah.setContentAreaFilled(false);
        Tombol_Tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tombol_TambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tombol_TambahMouseExited(evt);
            }
        });
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
                .addGap(15, 15, 15)
                .addComponent(Tombol_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Panel_TambahLayout.setVerticalGroup(
            Panel_TambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_Perbarui.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Perbarui.setRoundBottomLeft(40);
        Panel_Perbarui.setRoundBottomRight(40);
        Panel_Perbarui.setRoundTopLeft(40);
        Panel_Perbarui.setRoundTopRight(40);

        Tombol_Perbarui.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        Tombol_Perbarui.setText("Perbarui");
        Tombol_Perbarui.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Perbarui.setContentAreaFilled(false);
        Tombol_Perbarui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tombol_PerbaruiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tombol_PerbaruiMouseExited(evt);
            }
        });
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
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        Panel_PerbaruiLayout.setVerticalGroup(
            Panel_PerbaruiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Panel_Batal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Batal.setRoundBottomLeft(40);
        Panel_Batal.setRoundBottomRight(40);
        Panel_Batal.setRoundTopLeft(40);
        Panel_Batal.setRoundTopRight(40);

        Tombol_Batal.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        Tombol_Batal.setText("Batal");
        Tombol_Batal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Batal.setContentAreaFilled(false);
        Tombol_Batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tombol_BatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tombol_BatalMouseExited(evt);
            }
        });
        Tombol_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_BatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BatalLayout = new javax.swing.GroupLayout(Panel_Batal);
        Panel_Batal.setLayout(Panel_BatalLayout);
        Panel_BatalLayout.setHorizontalGroup(
            Panel_BatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BatalLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Tombol_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        Panel_BatalLayout.setVerticalGroup(
            Panel_BatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Batal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_Hapus.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Hapus.setRoundBottomLeft(40);
        Panel_Hapus.setRoundBottomRight(40);
        Panel_Hapus.setRoundTopLeft(40);
        Panel_Hapus.setRoundTopRight(40);

        Tombol_Hapus.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        Tombol_Hapus.setText("Hapus");
        Tombol_Hapus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Hapus.setContentAreaFilled(false);
        Tombol_Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tombol_HapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tombol_HapusMouseExited(evt);
            }
        });
        Tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_HapusLayout = new javax.swing.GroupLayout(Panel_Hapus);
        Panel_Hapus.setLayout(Panel_HapusLayout);
        Panel_HapusLayout.setHorizontalGroup(
            Panel_HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HapusLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Tombol_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel_HapusLayout.setVerticalGroup(
            Panel_HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tombol_Hapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Tabel_Transaksi.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Tabel_Transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Transaksi", "Nama Pembeli", "Nama Barang", "Tanggal Transaksi", "Jumlah Barang", "Total Harga"
            }
        ));
        Tabel_Transaksi.setSelectionBackground(new java.awt.Color(25, 69, 105));
        Tabel_Transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_TransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Transaksi);

        Label_ID_Kategori.setText("ID_Transaksi");

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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_JumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(Label_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Panel_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139)
                                        .addComponent(Panel_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Panel_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(291, 291, 291))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Panel_JumlahHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(764, 764, 764))
                                    .addComponent(Panel_TotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Panel_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Panel_Perbarui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_Batal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Panel_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tombol_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_TambahActionPerformed
        // TODO add your handling code here:
        String namapembeli = Text_NamaPembeli.getText();
        String namabarang = (String) Combo_NamaBarang.getSelectedItem();
        Date tanggaltransaksi = J_TanggalTransaksi.getDate();
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String totalharga = Text_TotalHarga.getText();

//        validasi wajib di isi
        if (jumlahbarang == 0 || tanggaltransaksi == null || namapembeli.isEmpty() || namabarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Terisi", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = database.getConnection();
            java.sql.Date sqlDate = new java.sql.Date(tanggaltransaksi.getTime());
            String[] splits = namabarang.split(" -- "); // pastikan formatnya benar

            int idbarang = Integer.parseInt(splits[0]); // Ambil ID barang dari split
            int jumlahbarangdiambil = jumlahbarang;

            // Cek jumlah barang di tabel_barang
            String cekstokSql = "SELECT Jumlah_Barang FROM tabel_barang WHERE ID_Barang = ?";
            PreparedStatement cekstokSt = con.prepareStatement(cekstokSql);
            cekstokSt.setInt(1, idbarang);
            ResultSet rs = cekstokSt.executeQuery();

            if (rs.next()) {
                int stokTersedia = rs.getInt("Jumlah_Barang");
                if (stokTersedia < jumlahbarangdiambil) {
                    JOptionPane.showMessageDialog(this, "Jumlah Barang yang Diminta Melebihi Stok yang Tersedia!", "Peringatan", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Barang Tidak Ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            rs.close();
            cekstokSt.close();

            // Lanjutkan proses insert ke tabel_transaksi
            String sql = "INSERT INTO tabel_transaksi (ID_Barang, Tanggal_Transaksi, Nama_Pembeli, Jumlah_Barang, Total_Harga) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS); // Tambahkan RETURN_GENERATED_KEYS
            st.setInt(1, idbarang);
            st.setDate(2, sqlDate);
            st.setString(3, namapembeli);
            st.setInt(4, jumlahbarangdiambil);
            st.setInt(5, Integer.parseInt(totalharga));

            int rowInserted = st.executeUpdate();
            ResultSet generatedKeys = st.getGeneratedKeys();
            if (rowInserted > 0) {
                // Ambil ID Transaksi yang baru dibuat (opsional)
//                ResultSet generatedKeys = st.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idTransaksiBaru = generatedKeys.getInt(1); // Ambil ID Transaksi
                    System.out.println("ID Transaksi baru: " + idTransaksiBaru);
                }
                generatedKeys.close();

                // Kurangi jumlah stok di tabel_barang
                String updateStokSql = "UPDATE tabel_barang SET Jumlah_Barang = Jumlah_Barang - ? WHERE ID_Barang = ?";
                PreparedStatement updateStokSt = con.prepareStatement(updateStokSql,java.sql.Statement.RETURN_GENERATED_KEYS);
                updateStokSt.setInt(1, jumlahbarangdiambil);
                updateStokSt.setInt(2, idbarang);
                updateStokSt.executeUpdate();
                ResultSet generatedKey = updateStokSt.getGeneratedKeys();
                updateStokSt.close();

                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm(); // Pastikan method ini ada dan berfungsi.
                DataTransaksi(); // Pastikan method ini memuat ulang data.
            }
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Jumlah dan Harga Harus Berupa Angka!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Tombol_TambahActionPerformed

    private void Tombol_PerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiActionPerformed
        // TODO add your handling code here:
        String id_transaksi = Text_ID_Transaksi.getText();
        String namapembeli = Text_NamaPembeli.getText();
        String namabarang = (String) Combo_NamaBarang.getSelectedItem();
        Date tanggaltransaksi = J_TanggalTransaksi.getDate();
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String totalharga = Text_TotalHarga.getText();

//        validasi wajib di isi
        if (jumlahbarang == 0 || tanggaltransaksi == null || namapembeli.isEmpty() || namabarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Terisi", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = database.getConnection();
            java.sql.Date sqlDate = new java.sql.Date(tanggaltransaksi.getTime());
            String[] splits = namabarang.split(" -- ");

//            String sql = "INSERT INTO tabel_transaksi (ID_Barang, tanggal_transaksi, nama_pelanggan, jumlah_beli, total_bayar) VALUES (?,?,?,?,?)";
            String sql = "UPDATE tabel_transaksi SET ID_Barang=?, Tanggal_Transaksi=?, Nama_Pelanggan=?, Jumlah_Barang=?, Total_Harga=? WHERE ID_Transaksi=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(splits[0]));
            st.setDate(2, sqlDate);
            st.setString(3, namapembeli);
            st.setInt(4, jumlahbarang);
            st.setInt(5, Integer.parseInt(totalharga));
            st.setInt(6, Integer.parseInt(id_transaksi));

            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
                resetForm(); // Pastikan method ini ada dan berfungsi.
                DataTransaksi(); // Pastikan method ini memuat ulang data.
            }
            st.close();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah dan Harga Harus Berupa Angka!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal Memperbarui Data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Frame_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Tombol_PerbaruiActionPerformed

    private void Tombol_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_HapusActionPerformed
        // TODO add your handling code here:
        // Ambil baris yang dipilih pada tabel
        int selectedRow = Tabel_Transaksi.getSelectedRow();

        // Validasi jika tidak ada baris yang dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Data Yang Ingin Dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Konfirmasi sebelum penghapusan
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data Ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Ambil ID transaksi dari tabel
        int id_transaksi = (int) model.getValueAt(selectedRow, 0);

        try {
            // Koneksi ke database
            Connection con = database.getConnection();
            String sql = "DELETE FROM tabel_transaksi WHERE ID_Transaksi = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id_transaksi);

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
        resetForm();
        DataTransaksi();
        aktifButton();
        nonaktifButton();
    }//GEN-LAST:event_Tombol_HapusActionPerformed

    private void Spinner_JumlahBarangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner_JumlahBarangStateChanged
        // TODO add your handling code here:
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String namabarang = (String) Combo_NamaBarang.getSelectedItem();

        String[] splits = namabarang.split(" -- ");
        Integer hasil = 0;

        if (namabarang != null && jumlahbarang != 0) {
            hasil = jumlahbarang * Integer.parseInt(splits[2]);
        }
        Text_TotalHarga.setText(hasil.toString());
    }//GEN-LAST:event_Spinner_JumlahBarangStateChanged

    private void Combo_NamaBarangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Combo_NamaBarangItemStateChanged
        // TODO add your handling code here:
        Integer jumlahbarang = (Integer) Spinner_JumlahBarang.getValue();
        String namabarang = (String) Combo_NamaBarang.getSelectedItem();

        String[] splits = namabarang.split(" -- ");
        Integer hasil = 0;

        if (namabarang != null && jumlahbarang != 0) {
            hasil = jumlahbarang * Integer.parseInt(splits[2]);
        }
        Text_TotalHarga.setText(hasil.toString());
    }//GEN-LAST:event_Combo_NamaBarangItemStateChanged

    private void Tabel_TransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_TransaksiMouseClicked
        // TODO add your handling code here:
        int selectedRow = Tabel_Transaksi.getSelectedRow();

//        jJumlah_Beli.setValue(10);
//        "Id transaksi", "Nama pelanggan", "Barang", "Tanggal", "Jumlah", "Total"
        if (selectedRow != -1) {
            String idtransaksi = Tabel_Transaksi.getValueAt(selectedRow, 0).toString();
            String namapembeli = Tabel_Transaksi.getValueAt(selectedRow, 1).toString();
            String namabarang = Tabel_Transaksi.getValueAt(selectedRow, 2).toString();
            String jumlahbarang = Tabel_Transaksi.getValueAt(selectedRow, 4).toString();
            String totalharga = Tabel_Transaksi.getValueAt(selectedRow, 5).toString();

            Text_ID_Transaksi.setText(idtransaksi);
            Text_NamaPembeli.setText(namapembeli);
            Combo_NamaBarang.addItem(namabarang);
            Combo_NamaBarang.setSelectedItem(namabarang);

            try {
                String tanggal = Tabel_Transaksi.getValueAt(selectedRow, 3).toString();
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD"); // Format tanggal sesuai data
                Date date = sdf.parse(tanggal); // Konversi String ke Date
                J_TanggalTransaksi.setDate(date);         // Set nilai ke JDateChooser
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Format Tanggal Tidak Valid!");
            }
            Text_TotalHarga.setText(totalharga);

            Object jumlahbarangObj = Tabel_Transaksi.getValueAt(selectedRow, 4);
            if (jumlahbarangObj instanceof Integer) {
                Spinner_JumlahBarang.setValue((Integer) jumlahbarangObj);
            } else if (jumlahbarangObj instanceof Double) {
                Spinner_JumlahBarang.setValue((Double) jumlahbarangObj);
            } else {
                JOptionPane.showMessageDialog(null, "Jumlah Beli Tidak Valid.");
            }
        }

        Tombol_Tambah.setEnabled(false);
        Tombol_Perbarui.setEnabled(true);
        Tombol_Hapus.setEnabled(true);
    }//GEN-LAST:event_Tabel_TransaksiMouseClicked

    private void Tombol_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_BatalActionPerformed
        // TODO add your handling code here:
        resetForm();
        aktifButton();
        nonaktifButton();
    }//GEN-LAST:event_Tombol_BatalActionPerformed

    private void Tombol_TambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_TambahMouseEntered
        // TODO add your handling code here:
        Panel_Tambah.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Tombol_TambahMouseEntered

    private void Tombol_TambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_TambahMouseExited
        // TODO add your handling code here:
        Panel_Tambah.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_Tombol_TambahMouseExited

    private void Tombol_PerbaruiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiMouseEntered
        // TODO add your handling code here:
        Panel_Perbarui.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Tombol_PerbaruiMouseEntered

    private void Tombol_PerbaruiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiMouseExited
        // TODO add your handling code here:
        Panel_Perbarui.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_Tombol_PerbaruiMouseExited

    private void Tombol_BatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_BatalMouseEntered
        // TODO add your handling code here:
        Panel_Batal.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Tombol_BatalMouseEntered

    private void Tombol_BatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_BatalMouseExited
        // TODO add your handling code here:
        Panel_Batal.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_Tombol_BatalMouseExited

    private void Tombol_HapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_HapusMouseEntered
        // TODO add your handling code here:
        Panel_Hapus.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Tombol_HapusMouseEntered

    private void Tombol_HapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_HapusMouseExited
        // TODO add your handling code here:
        Panel_Hapus.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_Tombol_HapusMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_NamaBarang;
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
    private javax.swing.JTextField Text_ID_Transaksi;
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
            Connection con = database.getConnection();
            if (con != null) {
                String sql = "SELECT Nama_Barang,Harga_Barang,ID_Barang FROM tabel_barang";
                PreparedStatement stat = con.prepareStatement(sql);
                ResultSet rs = stat.executeQuery();

                Combo_NamaBarang.removeAllItems();
                Combo_NamaBarang.addItem("--- pilih barang ---");

                while (rs.next()) {
                    String item = rs.getInt("ID_Barang") + " -- " + rs.getString("Nama_Barang") + " -- " + rs.getString("Harga_Barang");
                    Combo_NamaBarang.addItem(item);
                }

                rs.close();
                stat.close();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Koneksi Ke Database");
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
            Connection con = database.getConnection();
            if (con != null) {
                String sql = "SELECT * FROM tabel_transaksi INNER JOIN tabel_barang ON tabel_transaksi.ID_Barang = tabel_barang.ID_Barang";
                PreparedStatement stat = con.prepareStatement(sql);
                ResultSet rs = stat.executeQuery();

                while (rs.next()) {
                    int idtransaksi = rs.getInt("ID_Transaksi");
                    String namabarang = rs.getString("ID_Barang") + " -- " + rs.getString("Nama_Barang") + " -- " + rs.getString("Harga_Barang");

                    String tanggaltransaksi = rs.getString("Tanggal_Transaksi");
                    String namapembeli = rs.getString("Nama_Pembeli");
                    int jumlahbarang = rs.getInt("Jumlah_Barang");
                    int totalharga = rs.getInt("Total_Harga");

                    Object[] rowData = {idtransaksi, namapembeli, namabarang, tanggaltransaksi, jumlahbarang, totalharga};
                    model.addRow(rowData);
                }

                rs.close();
                stat.close();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Koneksi Ke Database");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void resetForm() {
        Text_ID_Transaksi.setText("");
        Text_NamaPembeli.setText("");
        Combo_NamaBarang.setSelectedItem(0);
        J_TanggalTransaksi.setDate(null);
        Spinner_JumlahBarang.setValue(0);
        Text_TotalHarga.setText("");
    }

    private void aktifButton() {
        Tombol_Tambah.setEnabled(true);
        Tombol_Batal.setEnabled(true);
    }

    private void nonaktifButton() {
        Tombol_Perbarui.setEnabled(false);
        Tombol_Hapus.setEnabled(false);
    }
}
