package Apk;

import Apk.Frame_Dashboard;
import DataBase.database;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel_Barang extends javax.swing.JPanel {
    
    private Connection con;

    public Panel_Barang() {
        
        initComponents();
        con = database.getConnection();
        MengambilData();
        nonaktifButton();
        aktifButton();
        
        Text_Pencarian.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian...");
        Text_NamaKategori.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Kategori");
        Text_NamaBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Barang");
        Text_JumlahBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Jumlah Barang");
        Text_HargaBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga Barang");
        Text_DeskripsiBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Deskripsi Barang");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_NamaKategori = new Cob.PanelCustom();
        Text_NamaKategori = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Data = new javax.swing.JTable();
        Panel_Pencarian = new Cob.PanelCustom();
        Text_Pencarian = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Panel_NamaBarang = new Cob.PanelCustom();
        Text_NamaBarang = new javax.swing.JTextField();
        Panel_JumlahBarang = new Cob.PanelCustom();
        Text_JumlahBarang = new javax.swing.JTextField();
        panelCustom2 = new Cob.PanelCustom();
        Text_HargaBarang = new javax.swing.JTextField();
        panelCustom3 = new Cob.PanelCustom();
        Text_DeskripsiBarang = new javax.swing.JTextField();
        Panel_Tambah = new Cob.PanelCustom();
        Tombol_Tambah = new javax.swing.JButton();
        Panel_Perbarui = new Cob.PanelCustom();
        Tombol_Perbarui = new javax.swing.JButton();
        Panel_Batal = new Cob.PanelCustom();
        Tombol_Batal = new javax.swing.JButton();
        Panel_Hapus = new Cob.PanelCustom();
        Tombol_Hapus = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        Panel_NamaKategori.setBackground(new java.awt.Color(255, 255, 255));
        Panel_NamaKategori.setRoundBottomLeft(30);
        Panel_NamaKategori.setRoundBottomRight(30);
        Panel_NamaKategori.setRoundTopLeft(30);
        Panel_NamaKategori.setRoundTopRight(30);

        Text_NamaKategori.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_NamaKategori.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_NamaKategoriLayout = new javax.swing.GroupLayout(Panel_NamaKategori);
        Panel_NamaKategori.setLayout(Panel_NamaKategoriLayout);
        Panel_NamaKategoriLayout.setHorizontalGroup(
            Panel_NamaKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaKategoriLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Text_NamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Panel_NamaKategoriLayout.setVerticalGroup(
            Panel_NamaKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_NamaKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        Panel_Pencarian.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Pencarian.setRoundBottomLeft(30);
        Panel_Pencarian.setRoundBottomRight(30);
        Panel_Pencarian.setRoundTopLeft(30);
        Panel_Pencarian.setRoundTopRight(30);
        Panel_Pencarian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text_Pencarian.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_Pencarian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Text_Pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Text_PencarianKeyTyped(evt);
            }
        });
        Panel_Pencarian.add(Text_Pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 590, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Search.png"))); // NOI18N
        Panel_Pencarian.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 9, -1, 30));

        Panel_NamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        Panel_NamaBarang.setRoundBottomLeft(30);
        Panel_NamaBarang.setRoundBottomRight(30);
        Panel_NamaBarang.setRoundTopLeft(30);
        Panel_NamaBarang.setRoundTopRight(30);

        Text_NamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_NamaBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_NamaBarangLayout = new javax.swing.GroupLayout(Panel_NamaBarang);
        Panel_NamaBarang.setLayout(Panel_NamaBarangLayout);
        Panel_NamaBarangLayout.setHorizontalGroup(
            Panel_NamaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NamaBarangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Text_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Panel_NamaBarangLayout.setVerticalGroup(
            Panel_NamaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_NamaBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_NamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_JumlahBarang.setBackground(new java.awt.Color(255, 255, 255));
        Panel_JumlahBarang.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Panel_JumlahBarang.setRoundBottomLeft(30);
        Panel_JumlahBarang.setRoundBottomRight(30);
        Panel_JumlahBarang.setRoundTopLeft(30);
        Panel_JumlahBarang.setRoundTopRight(30);

        Text_JumlahBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_JumlahBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_JumlahBarangLayout = new javax.swing.GroupLayout(Panel_JumlahBarang);
        Panel_JumlahBarang.setLayout(Panel_JumlahBarangLayout);
        Panel_JumlahBarangLayout.setHorizontalGroup(
            Panel_JumlahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_JumlahBarangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Text_JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Panel_JumlahBarangLayout.setVerticalGroup(
            Panel_JumlahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_JumlahBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_JumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(30);
        panelCustom2.setRoundBottomRight(30);
        panelCustom2.setRoundTopLeft(30);
        panelCustom2.setRoundTopRight(30);

        Text_HargaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_HargaBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Text_HargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_HargaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCustom3.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom3.setRoundBottomLeft(30);
        panelCustom3.setRoundBottomRight(30);
        panelCustom3.setRoundTopLeft(30);
        panelCustom3.setRoundTopRight(30);

        Text_DeskripsiBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_DeskripsiBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Text_DeskripsiBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_DeskripsiBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Tambah.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Tambah.setRoundBottomLeft(30);
        Panel_Tambah.setRoundBottomRight(30);
        Panel_Tambah.setRoundTopLeft(30);
        Panel_Tambah.setRoundTopRight(30);

        Tombol_Tambah.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Tombol_Tambah.setText("Tambah");
        Tombol_Tambah.setBorder(null);
        Tombol_Tambah.setContentAreaFilled(false);
        Tombol_Tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_TambahLayout.setVerticalGroup(
            Panel_TambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Perbarui.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Perbarui.setRoundBottomLeft(30);
        Panel_Perbarui.setRoundBottomRight(30);
        Panel_Perbarui.setRoundTopLeft(30);
        Panel_Perbarui.setRoundTopRight(30);

        Tombol_Perbarui.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Tombol_Perbarui.setText("Perbarui");
        Tombol_Perbarui.setBorder(null);
        Tombol_Perbarui.setContentAreaFilled(false);
        Tombol_Perbarui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(Panel_PerbaruiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_PerbaruiLayout.setVerticalGroup(
            Panel_PerbaruiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PerbaruiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Perbarui, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Batal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Batal.setRoundBottomLeft(30);
        Panel_Batal.setRoundBottomRight(30);
        Panel_Batal.setRoundTopLeft(30);
        Panel_Batal.setRoundTopRight(30);

        Tombol_Batal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Tombol_Batal.setText("Batal");
        Tombol_Batal.setBorder(null);
        Tombol_Batal.setContentAreaFilled(false);
        Tombol_Batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(Panel_BatalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Batal, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_BatalLayout.setVerticalGroup(
            Panel_BatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BatalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Batal, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Hapus.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Hapus.setRoundBottomLeft(30);
        Panel_Hapus.setRoundBottomRight(30);
        Panel_Hapus.setRoundTopLeft(30);
        Panel_Hapus.setRoundTopRight(30);

        Tombol_Hapus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Tombol_Hapus.setText("Hapus");
        Tombol_Hapus.setBorder(null);
        Tombol_Hapus.setContentAreaFilled(false);
        Tombol_Hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap()
                .addComponent(Tombol_Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_HapusLayout.setVerticalGroup(
            Panel_HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HapusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tombol_Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Panel_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Panel_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Panel_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel_NamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel_JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_Pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Panel_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Panel_NamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Panel_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Panel_JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tombol_TambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_TambahMouseEntered
        // TODO add your handling code here:
        Panel_Tambah.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Tombol_TambahMouseEntered

    private void Tombol_TambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_TambahMouseExited
        // TODO add your handling code here:
        Panel_Tambah.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Tombol_TambahMouseExited

    private void Tombol_PerbaruiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiMouseEntered
        // TODO add your handling code here:
        Panel_Perbarui.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Tombol_PerbaruiMouseEntered

    private void Tombol_PerbaruiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_PerbaruiMouseExited
        // TODO add your handling code here:
        Panel_Perbarui.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Tombol_PerbaruiMouseExited

    private void Tombol_BatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_BatalMouseEntered
        // TODO add your handling code here:
        Panel_Batal.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Tombol_BatalMouseEntered

    private void Tombol_BatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_BatalMouseExited
        // TODO add your handling code here:
        Panel_Batal.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Tombol_BatalMouseExited

    private void Tombol_HapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_HapusMouseEntered
        // TODO add your handling code here:
        Panel_Hapus.setBackground(new Color (153, 153, 153));
    }//GEN-LAST:event_Tombol_HapusMouseEntered

    private void Tombol_HapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_HapusMouseExited
        // TODO add your handling code here:
        Panel_Hapus.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_Tombol_HapusMouseExited

    private void Tombol_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_TambahActionPerformed
        // TODO add your handling code here:
        String namakategori = Text_NamaKategori.getText();
        String namabarang = Text_NamaBarang.getText();
        String jumlahbarang = Text_JumlahBarang.getText();
        String hargabarang = Text_HargaBarang.getText();
        String deskripsibarang = Text_DeskripsiBarang.getText();

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
        String hargabarang = Text_HargaBarang.getText();
        String deskripsibarang = Text_DeskripsiBarang.getText();

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
            Text_HargaBarang.setText(hargabarang);
            Text_DeskripsiBarang.setText(deskripsibarang);

        }
        
        Tombol_Tambah.setEnabled(false);
        Tombol_Batal.setEnabled(true);
        Tombol_Perbarui.setEnabled(true);
        Tombol_Hapus.setEnabled(true);
    }//GEN-LAST:event_Tabel_DataMouseClicked

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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Cob.PanelCustom Panel_Batal;
    private Cob.PanelCustom Panel_Hapus;
    private Cob.PanelCustom Panel_JumlahBarang;
    private Cob.PanelCustom Panel_NamaBarang;
    private Cob.PanelCustom Panel_NamaKategori;
    private Cob.PanelCustom Panel_Pencarian;
    private Cob.PanelCustom Panel_Perbarui;
    private Cob.PanelCustom Panel_Tambah;
    private javax.swing.JTable Tabel_Data;
    private javax.swing.JTextField Text_DeskripsiBarang;
    private javax.swing.JTextField Text_HargaBarang;
    private javax.swing.JTextField Text_JumlahBarang;
    private javax.swing.JTextField Text_NamaBarang;
    private javax.swing.JTextField Text_NamaKategori;
    private javax.swing.JTextField Text_Pencarian;
    private javax.swing.JButton Tombol_Batal;
    private javax.swing.JButton Tombol_Hapus;
    private javax.swing.JButton Tombol_Perbarui;
    private javax.swing.JButton Tombol_Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Cob.PanelCustom panelCustom2;
    private Cob.PanelCustom panelCustom3;
    // End of variables declaration//GEN-END:variables

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
        Text_HargaBarang.setText("");
        Text_DeskripsiBarang.setText("");
    }
}
