/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class DBConnect {
    protected Connection conn;
    public DBConnect(){
        try {
            String user = "sa";
            String password ="kingqn132";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=WedProject";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Không kết nối được với sql server");
            e.printStackTrace();
        }
    }
}
