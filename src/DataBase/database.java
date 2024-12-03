package DataBase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//test pull ke master
public class database {

    private static Connection con;

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/project";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }
}
