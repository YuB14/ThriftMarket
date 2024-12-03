package Apk;

public class Panel_Laporan extends javax.swing.JPanel {

    public Panel_Laporan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text_PilihLaporan = new javax.swing.JLabel();
        panelCustom2 = new Cob.PanelCustom();
        jButton2 = new javax.swing.JButton();
        panelCustom1 = new Cob.PanelCustom();
        jButton1 = new javax.swing.JButton();
        DekstopPane = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text_PilihLaporan.setFont(new java.awt.Font("Bookman Old Style", 1, 35)); // NOI18N
        Text_PilihLaporan.setText("Pilih Laporan :");
        add(Text_PilihLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 19, 360, 100));

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(40);
        panelCustom2.setRoundBottomRight(40);
        panelCustom2.setRoundTopLeft(40);
        panelCustom2.setRoundTopRight(40);

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jButton2.setText("Laporan Keluar");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 112));

        panelCustom1.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom1.setRoundBottomLeft(40);
        panelCustom1.setRoundBottomRight(40);
        panelCustom1.setRoundTopLeft(40);
        panelCustom1.setRoundTopRight(40);

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jButton1.setText("Laporan Masuk");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        DekstopPane.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout DekstopPaneLayout = new javax.swing.GroupLayout(DekstopPane);
        DekstopPane.setLayout(DekstopPaneLayout);
        DekstopPaneLayout.setHorizontalGroup(
            DekstopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        DekstopPaneLayout.setVerticalGroup(
            DekstopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        add(DekstopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1200, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LaporanMasuk masuk = new LaporanMasuk();
        masuk.setVisible(true);
        DekstopPane.add(masuk);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LaporanKeluar keluar = new LaporanKeluar();
        keluar.setVisible(true);
        DekstopPane.add(keluar);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DekstopPane;
    private javax.swing.JLabel Text_PilihLaporan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private Cob.PanelCustom panelCustom1;
    private Cob.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
