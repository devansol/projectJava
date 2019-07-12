package service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daus
 */
public class KoneksiDb {
    public static Connection conn = null;
    public static Statement stm  = null;
    public static Connection getConnection() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/nilai_siswa";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stm = conn.createStatement();
        }catch(ClassNotFoundException | SQLException e){
            throw new SQLException(e.getMessage());
        }
        return conn;
    }
}
