/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.Users;

/**
 *
 * @author ADMIN
 */
public class Users {
    private int uID;
    private String user;
    private String password;

    public Users() {
    }

    public Users(int uID, String user, String password) {
        this.uID = uID;
        this.user = user;
        this.password = password;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" + "uID=" + uID + ", user=" + user + ", password=" + password + '}';
    }
    
}
