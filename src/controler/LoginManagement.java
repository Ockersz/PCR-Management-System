/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DB;
import model.Login;

/**
 *
 * @author lihin
 */
public class LoginManagement {

    private Login login;
    
    public LoginManagement(Login login) {
        this.login = login;
    }

    public static boolean checkLogin(String username, String password) {

        boolean i = false;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_registerdusernamepass WHERE username = '" + username + "' and password = '" + password + "'  ";
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                i = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return (i);
    }

    public static boolean checkUsername(String username) {

        boolean i = false;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_registerdusernamepass WHERE username = '" + username + "' ";
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                i = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return (i);
    }

    public static boolean updatePassword(String username, String newpass) {
        boolean i = false;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "Update tbl_registerdusernamepass  SET password = '" + newpass + "' WHERE username = '" + username + "'";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return i;
    }
    
    public void sendLoginHistory() {
        try {
            Connection con = DB.createConnection();
            
            String sql = "INSERT INTO tbl_loginhistory (username) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, getLogin().getUserName());
            stmt.executeUpdate();
            
            
        } catch (Exception ex) {
            Logger.getLogger(LoginManagement.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    
    }
    

    public void registerLogin() {
        try {
            Connection con = DB.createConnection();
            String sql = "INSERT INTO tbl_registerdusernamepass (username,password) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, getLogin().getUserName());
            stmt.setString(2, getLogin().getPassword());

            int result = stmt.executeUpdate();
            if (result > 0) {
                String sql1 = "INSERT INTO tbl_userinfo (name,nic,age,contact,address,work_role) VALUES (?,?,?,?,?,?)";
                PreparedStatement stmt1 = con.prepareStatement(sql1);
                stmt1.setString(1, getLogin().getName());
                stmt1.setString(2, getLogin().getNid());
                stmt1.setInt(3, getLogin().getAge());
                stmt1.setString(4, getLogin().getContact());
                stmt1.setString(5, getLogin().getAddress());
                stmt1.setString(6, getLogin().getWorkrole());
                int result1 = stmt1.executeUpdate();
                if (result1 > 0) {
                    JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Registration Successful", "Registration Management", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Registration Failed", "Registration Management", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "User name is already taken \n\r Try anotherone", "Login Details Management", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);

        }

    }

  
    public Login getLogin() {
        return login;
    }

   
    public void setLogin(Login login) {
        this.login = login;
    }

}
