/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.Users;

import dao.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class UsersMethods extends DBConnect {

    public List<Users> getUserList() {
        List<Users> users = new ArrayList<>();
        try {
            String sqlQuery = "select * from users";
            PreparedStatement stm = conn.prepareStatement(sqlQuery);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                users.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public Users getUserById(int id) {
        List<Users> users = new ArrayList<>();
        Users result = null;
        users = getUserList();
        for (Users u : users) {
            if (u.getuID() == id) {
                result = u;
                return result;
            }
        }
        return result;
    }

//    public void addUser(String user, String pass) throws SQLException {
//        String addUserQuery = "Insert into users(username, password) values ('" + user +"', '" + pass + "');" ;
//        List<Users> users = new ArrayList<>();
//        users = getUserList();
//        boolean check = true;
//        for(Users u : users){
//            if(u.getUser().equals(user)){
//                check = false;
//                break;
//            }
//        }
//        if(check){
//            PreparedStatement stm = conn.prepareStatement(addUserQuery);
//            stm.executeQuery();
//            System.out.println("Đăng kí thành công");
//        }
//        else{
//            System.out.println("Tên tài khoản đã tồn tại, xin vui lòng nhập tên tài khoản khác");
//        }
//    }

    public boolean addUser(String user, String pass) throws SQLException {
    // Câu truy vấn kiểm tra user đã tồn tại chưa
    String checkUserQuery = "SELECT * FROM users WHERE username = ?";
    
    // Câu truy vấn thêm user mới
    String addUserQuery = "INSERT INTO users (username, password) VALUES (?, ?)";

    // Tạo PreparedStatement để kiểm tra user tồn tại
    try (PreparedStatement checkStmt = conn.prepareStatement(checkUserQuery)) {
        checkStmt.setString(1, user);
        ResultSet rs = checkStmt.executeQuery();
        String error = "";
        if (rs.next()) {
            // Nếu đã tồn tại user
            error = "Tên tài khoản đã tồn tại, xin vui lòng nhập tên tài khoản khác.";
            return false;
        } else {
            // Nếu chưa tồn tại, thêm mới
            try (PreparedStatement addStmt = conn.prepareStatement(addUserQuery)) {
                addStmt.setString(1, user);
                addStmt.setString(2, pass);
                int rowsInserted = addStmt.executeUpdate();

                if (rowsInserted > 0) {
                    error = "Đăng kí thành công.";
                    return true;
                }
            }
        }
    } catch (SQLException e) {
        System.err.println("Lỗi khi thêm user: " + e.getMessage());
        throw e; // Ném lại lỗi nếu cần xử lý phía trên
    }
    return false;
}

    
}
