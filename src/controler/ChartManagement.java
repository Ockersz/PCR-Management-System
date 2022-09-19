/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.DB;

/**
 *
 * @author lihin
 */
public class ChartManagement {

    public static double getAllTestCount() {

        ResultSet result = null;
        double i = 0;
        try {
            java.sql.Connection con = DB.createConnection();
            java.sql.Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo";
            result = stmt.executeQuery(sql);

            while (result.next()) {

                i += 1;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return i;
    }

    public static double getPossitiveTestCount() {
        ResultSet result = null;
        double i = 0.00;

        try {
            java.sql.Connection con = DB.createConnection();
            java.sql.Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo WHERE status ='Possitive'";
            result = stmt.executeQuery(sql);
            while (result.next()) {

                i += 1;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return i;
    }

    public static double getNegativeTestCount() {
        ResultSet result = null;
        double i = 0.00;

        try {
            java.sql.Connection con = DB.createConnection();
            java.sql.Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo WHERE status ='Negative'";
            result = stmt.executeQuery(sql);

            while (result.next()) {

                i += 1.00;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return i;
       
    }

    public static double getNotTestedTestCount() {
        ResultSet result = null;
        double i = 0.00;

        try {
            java.sql.Connection con = DB.createConnection();
            java.sql.Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo WHERE status ='Not Tested'";
            result = stmt.executeQuery(sql);

            while (result.next()) {

                i += 1;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return i;
        
    }
    
    
        public static double getProvincePossitiveTestCount(String province) {
        ResultSet result = null;
        double i = 0.00;

        try {
            java.sql.Connection con = DB.createConnection();
            java.sql.Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo WHERE status ='Possitive' AND Province='"+province+"'";
            result = stmt.executeQuery(sql);
            while (result.next()) {

                i += 1;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return i;
    }
        
        

}
