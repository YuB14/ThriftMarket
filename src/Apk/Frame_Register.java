package Apk;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class Frame_Register extends javax.swing.JFrame {

    public Frame_Register() {
        initComponents();

        Label_SignIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Frame_Login Login = new Frame_Login();
                Login.setVisible(true);
                dispose();
            }
        });
        
        Text_Role.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pengguna");
        Text_NoTelp.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "No Telp");
        Text_Username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        J_Password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ikon_NoTelp = new javax.swing.JLabel();
        Ikon_Username = new javax.swing.JLabel();
        Ikon_Password = new javax.swing.JLabel();
        Check_ShowPassword = new javax.swing.JCheckBox();
        Tombol_Register = new javax.swing.JButton();
        Ikon_Pengguna = new javax.swing.JLabel();
        Text_Role = new javax.swing.JTextField();
        Text_NoTelp = new javax.swing.JTextField();
        Text_Username = new javax.swing.JTextField();
        Label_SignIn = new javax.swing.JLabel();
        J_Password = new javax.swing.JPasswordField();
        Label_FrameRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/UI/Logo Mythrift.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ikon_NoTelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_NoTelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Phone.png"))); // NOI18N
        getContentPane().add(Ikon_NoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 40, 30));

        Ikon_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Male User.png"))); // NOI18N
        getContentPane().add(Ikon_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 40, 30));

        Ikon_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Password.png"))); // NOI18N
        getContentPane().add(Ikon_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 40, 30));

        Check_ShowPassword.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        Check_ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        Check_ShowPassword.setText("Show Password");
        Check_ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Check_ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, 30));

        Tombol_Register.setBackground(new java.awt.Color(25, 69, 105));
        Tombol_Register.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        Tombol_Register.setForeground(new java.awt.Color(255, 255, 255));
        Tombol_Register.setText("Register");
        Tombol_Register.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tombol_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Tombol_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 100, 30));

        Ikon_Pengguna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ikon_Pengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Name Tag_2.png"))); // NOI18N
        getContentPane().add(Ikon_Pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 40, 30));

        Text_Role.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Text_Role.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 200, 30));

        Text_NoTelp.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Text_NoTelp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_NoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 200, 30));

        Text_Username.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Text_Username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Text_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 200, 30));

        Label_SignIn.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        Label_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        Label_SignIn.setText("Sign In");
        getContentPane().add(Label_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 80, 30));

        J_Password.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        J_Password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(J_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 170, 30));

        Label_FrameRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Frame_Register.png"))); // NOI18N
        getContentPane().add(Label_FrameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Check_ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_ShowPasswordActionPerformed
        // TODO add your handling code here:
        if (Check_ShowPassword.isSelected()) {
            J_Password.setEchoChar((char) 0);
        } else {
            J_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_Check_ShowPasswordActionPerformed

    private void Tombol_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_RegisterActionPerformed
        // TODO add your handling code here:
        String role, notelp, uname, pass, query;
        String Surl, Suname, Spass;
        Surl = "jdbc:MySQL://localhost:3306/mythrift";
        Suname = "root";
        Spass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(Surl, Suname, Spass);
            Statement st = con.createStatement();
            if ("".equals(Text_Role.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Pengguna is require", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Text_NoTelp.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "No Telp is require", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Text_Username.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(J_Password.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
            role = Text_Role.getText();
            notelp = Text_NoTelp.getText();
            uname = Text_Username.getText();
            pass = J_Password.getText();
            
            query = "INSERT INTO tabel_pengguna (Role, No_Telp, Username, Password)"+
                    "VALUES('"+role+"', '"+notelp+"', '"+uname+"', '"+pass+"')";  
            
            st.execute(query);
            Text_Role.setText("");
            Text_NoTelp.setText("");
            Text_Username.setText("");
            J_Password.setText("");
            showMessageDialog(null, "Akun Berhasil Dibuat");  
            {

            }
        }
    }
    catch(Exception e

    
        ) {
            System.out.println("Error" + e.getMessage());
    }

    }//GEN-LAST:event_Tombol_RegisterActionPerformed


    public static void main(String args[]) {
        FlatLightLaf.setup();
        
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Frame_Register().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check_ShowPassword;
    private javax.swing.JLabel Ikon_NoTelp;
    private javax.swing.JLabel Ikon_Password;
    private javax.swing.JLabel Ikon_Pengguna;
    private javax.swing.JLabel Ikon_Username;
    private javax.swing.JPasswordField J_Password;
    private javax.swing.JLabel Label_FrameRegister;
    private javax.swing.JLabel Label_SignIn;
    private javax.swing.JTextField Text_NoTelp;
    private javax.swing.JTextField Text_Role;
    private javax.swing.JTextField Text_Username;
    private javax.swing.JButton Tombol_Register;
    // End of variables declaration//GEN-END:variables
}
