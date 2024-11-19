package Apk;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame_Login extends javax.swing.JFrame {

    public Frame_Login() {
        initComponents();

        SignUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Membuka JFrame Login
                Frame_Register Frame_RegisterFrame = new Frame_Register();
                Frame_RegisterFrame.setVisible(true);
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ikon_Username = new javax.swing.JLabel();
        Ikon_Password = new javax.swing.JLabel();
        Tombol_SignIn = new javax.swing.JButton();
        Text_Username = new javax.swing.JTextField();
        SignUp = new javax.swing.JLabel();
        Check_ShowPassword = new javax.swing.JCheckBox();
        J_Password = new javax.swing.JPasswordField();
        Frame_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ikon_Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Male User.png"))); // NOI18N
        getContentPane().add(Ikon_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 30, 50));

        Ikon_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Password.png"))); // NOI18N
        getContentPane().add(Ikon_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, 30));

        Tombol_SignIn.setBackground(new java.awt.Color(0, 102, 153));
        Tombol_SignIn.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        Tombol_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        Tombol_SignIn.setText("Sign In");
        Tombol_SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tombol_SignInMouseClicked(evt);
            }
        });
        Tombol_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tombol_SignInActionPerformed(evt);
            }
        });
        getContentPane().add(Tombol_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 90, 30));

        Text_Username.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Text_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Text_Username.setText("Username");
        Text_Username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Text_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Text_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Text_UsernameFocusLost(evt);
            }
        });
        getContentPane().add(Text_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 200, 30));

        SignUp.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Sign Up");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, 30));

        Check_ShowPassword.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Check_ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        Check_ShowPassword.setText("Show Password");
        Check_ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Check_ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        J_Password.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        J_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J_Password.setText("Password");
        J_Password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        J_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                J_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                J_PasswordFocusLost(evt);
            }
        });
        getContentPane().add(J_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 210, 30));

        Frame_Login.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        Frame_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Frame_Login.png"))); // NOI18N
        Frame_Login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Frame_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tombol_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tombol_SignInActionPerformed

        String Surl, Suname, Spass;
        Surl = "jdbc:MySQL://localhost:3306/mythrift";
        Suname = "root";
        Spass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(Surl, Suname, Spass);
            Statement st = con.createStatement();
            
            String uname = Text_Username.getText();
            String pass = J_Password.getText();

            Statement stm = con.createStatement();

            String sql = "SELECT * FROM tabel_pengguna WHERE Username='" + uname + "' AND Password='" + pass + "'";
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()) {
                dispose();
                Frame_Dashboard dashboard = new Frame_Dashboard();
                dashboard.show();
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password is wrong");
                Text_Username.setText("");
                J_Password.setText("");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Tombol_SignInActionPerformed

    private void Text_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Text_UsernameFocusGained
        // TODO add your handling code here:
        String name = Text_Username.getText();
        if (name.equals("Username")) {
            Text_Username.setText("");
        }
    }//GEN-LAST:event_Text_UsernameFocusGained

    private void Text_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Text_UsernameFocusLost
        // TODO add your handling code here:
        String name = Text_Username.getText();
        if (name.equals("") || name.equals("Username")) {
            Text_Username.setText("Username");
        }
    }//GEN-LAST:event_Text_UsernameFocusLost

    private void Check_ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_ShowPasswordActionPerformed
        // TODO add your handling code here:
        if (Check_ShowPassword.isSelected()) {
            J_Password.setEchoChar((char) 0);
        } else {
            J_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_Check_ShowPasswordActionPerformed

    private void J_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_PasswordFocusGained
        // TODO add your handling code here:
        String pass = J_Password.getText();
        if (pass.equals("Password")) {
            J_Password.setText("");
        }
    }//GEN-LAST:event_J_PasswordFocusGained

    private void J_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_PasswordFocusLost
        // TODO add your handling code here:
        String pass = J_Password.getText();
        if (pass.equals("") || pass.equals("Password")) {
            J_Password.setText("Password");
        }
    }//GEN-LAST:event_J_PasswordFocusLost

    private void Tombol_SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tombol_SignInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tombol_SignInMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check_ShowPassword;
    private javax.swing.JLabel Frame_Login;
    private javax.swing.JLabel Ikon_Password;
    private javax.swing.JLabel Ikon_Username;
    private javax.swing.JPasswordField J_Password;
    private javax.swing.JLabel SignUp;
    private javax.swing.JTextField Text_Username;
    private javax.swing.JButton Tombol_SignIn;
    // End of variables declaration//GEN-END:variables

}
