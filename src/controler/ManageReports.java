/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import model.DB;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lihin
 */
public class ManageReports {
    
    
    public static void genarateReports(String sql,String design) throws Exception {
        try {
            Connection con = DB.createConnection();
            JasperDesign jdesign = JRXmlLoader.load(design);

            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(sql);

            jdesign.setQuery(updateQuery);

            JasperReport jreport = JasperCompileManager.compileReport(jdesign);

            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, con);

            JasperViewer.viewReport(jprint,false);
           

        } catch (Exception e) {
        }

    }
      

}
