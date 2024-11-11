package DataBase;


import java.sql.*;
//test pull ke master
public class database {
   public static Connection com;
    public static Statement stm; 

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/thrift_market";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            com =DriverManager.getConnection(url,user,pass);
            stm =com.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi gagal " +e.getMessage());
        }
    }
}    