/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao.Users;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TestUser {
    
    public static void main(String[] args) {
        UsersMethods userMethod = new UsersMethods();
        List<Users> users = new ArrayList<>();
        users = userMethod.getUserList();
        for(Users u : users){
            System.out.println(u);
        }
    }
    
}
