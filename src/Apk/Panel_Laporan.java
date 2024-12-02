package Apk;

import com.formdev.flatlaf.FlatClientProperties;

public class Panel_Laporan extends javax.swing.JPanel {

    public Panel_Laporan() {
        initComponents();
        
        Text_Pencarian.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Pencarian = new Cob.PanelCustom();
        jLabel1 = new javax.swing.JLabel();
        Text_Pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Data = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        Panel_Pencarian.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Pencarian.setRoundBottomLeft(40);
        Panel_Pencarian.setRoundBottomRight(40);
        Panel_Pencarian.setRoundTopLeft(40);
        Panel_Pencarian.setRoundTopRight(40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Search.png"))); // NOI18N

        Text_Pencarian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout Panel_PencarianLayout = new javax.swing.GroupLayout(Panel_Pencarian);
        Panel_Pencarian.setLayout(Panel_PencarianLayout);
        Panel_PencarianLayout.setHorizontalGroup(
            Panel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Text_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        Panel_PencarianLayout.setVerticalGroup(
            Panel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_Pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tabel_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Kategori", "Nama Kategori", "Nama Barang", "Jumlah Barang", "Harga Barang", "Deskripsi Barang", "Tanggal Transaksi"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Data);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(Panel_Pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Panel_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Cob.PanelCustom Panel_Pencarian;
    private javax.swing.JTable Tabel_Data;
    private javax.swing.JTextField Text_Pencarian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
