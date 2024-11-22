package Apk;

import static java.awt.GridBagConstraints.BOTH;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Frame_Dashboard extends javax.swing.JFrame {


    public Frame_Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Label_Barang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Membuka JFrame Login
                Frame_Barang Frame_BarangFrame = new Frame_Barang();
                Frame_BarangFrame.setVisible(true);
                dispose();
            }
        });
        
        Label_Gudang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Membuka JFrame Login
                Frame_Gudang Frame_GudangFrame = new Frame_Gudang();
                Frame_GudangFrame.setVisible(true);
                dispose();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Barang = new javax.swing.JLabel();
        Label_TextBarang = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Label_Gudang = new javax.swing.JLabel();
        Label_TextGudang = new javax.swing.JLabel();
        Label_Kasir = new javax.swing.JLabel();
        Label_TextKasir = new javax.swing.JLabel();
        Label_Laporan = new javax.swing.JLabel();
        Label_TextLaporan = new javax.swing.JLabel();
        Label_Dashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Barang.png"))); // NOI18N
        Label_Barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 350, 210));

        Label_TextBarang.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        Label_TextBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TextBarang.setText("BARANG");
        getContentPane().add(Label_TextBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 330, 30));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Log Out");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 80, 110, 30));

        Label_Gudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Gudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Gudang (1).png"))); // NOI18N
        Label_Gudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_Gudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 360, 180));

        Label_TextGudang.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        Label_TextGudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TextGudang.setText("GUDANG");
        getContentPane().add(Label_TextGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 360, 30));

        Label_Kasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Kasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Kasir.png"))); // NOI18N
        Label_Kasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_Kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 350, 180));

        Label_TextKasir.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        Label_TextKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TextKasir.setText("KASIR");
        getContentPane().add(Label_TextKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 330, 30));

        Label_Laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Laporan.png"))); // NOI18N
        Label_Laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Label_Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 350, 180));

        Label_TextLaporan.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        Label_TextLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TextLaporan.setText("LAPORAN");
        getContentPane().add(Label_TextLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 340, 30));

        Label_Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Label_Dashboard.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Label_Dashboard.setForeground(new java.awt.Color(0, 51, 102));
        Label_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Dashboard.png"))); // NOI18N
        Label_Dashboard.setToolTipText("");
        getContentPane().add(Label_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Barang;
    private javax.swing.JLabel Label_Dashboard;
    private javax.swing.JLabel Label_Gudang;
    private javax.swing.JLabel Label_Kasir;
    private javax.swing.JLabel Label_Laporan;
    private javax.swing.JLabel Label_TextBarang;
    private javax.swing.JLabel Label_TextGudang;
    private javax.swing.JLabel Label_TextKasir;
    private javax.swing.JLabel Label_TextLaporan;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
