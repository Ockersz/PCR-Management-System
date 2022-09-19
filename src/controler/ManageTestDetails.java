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
import javax.swing.JOptionPane;
import model.DB;
import model.Test;

/**
 *
 * @author lihin
 */
public class ManageTestDetails {

    private Test test;

    public ManageTestDetails() {

    }

    public ManageTestDetails(Test test) {
        this.test = test;
    }

    public void saveTest() {
        try {
            Connection con = DB.createConnection();

            String sql = "INSERT INTO tbl_testinfo (sampleid,vname,vid,vgender,vage,vtel,vaddres,status,Province,District) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, getTest().getSampleId());
            stmt.setString(2, getTest().getName());
            stmt.setString(3, getTest().getId());
            stmt.setString(4, getTest().getGender());
            stmt.setInt(5, getTest().getAge());
            stmt.setString(6, getTest().getTelephone());
            stmt.setString(7, getTest().getAddress());
            stmt.setString(8, getTest().getStatus());
            stmt.setString(9, getTest().getProvince());
            stmt.setString(10, getTest().getDistrict());

            int result = stmt.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Inserted Successfully", "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed", "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Sample is already taken \n\r Make sure you are entering the right Sampleid", "Login Details Management", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static ResultSet loadTest() {

        ResultSet result = null;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo";
            result = stmt.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return result;
    }

    public static ResultSet loadTestbyID(String firstname) {

        ResultSet result = null;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tbl_testinfo WHERE sampleid LIKE '" + firstname + "%'";
            result = stmt.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Test Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return result;
    }

    public static boolean checkSampleId(String sampleid) {

        boolean i = false;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM tbl_testinfo WHERE sampleid = '" + sampleid + "' ";
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                i = true;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);

        }
        return i;

    }

    public boolean updateResults(String id, String status) {

        boolean i = false;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();

            String sql = "Update tbl_testinfo  SET status = '" + status + "' WHERE sampleid = '" + id + "'";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);

        }
        return i;
    }
        public boolean deletRecord(String id) {

        boolean i = false;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();

            String sql = "DELETE FROM tbl_testinfo  WHERE sampleid = "+ id +"";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);

        }
        return i;
    }

    /**
     * @return the test
     */
    public Test getTest() {
        return test;
    }

    /**
     * @param test the test to set
     */
    public void setTest(Test test) {
        this.test = test;
    }

}
