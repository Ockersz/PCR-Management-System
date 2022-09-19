/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Dimension;
import java.awt.Toolkit;
import view.LoginDialog;

/**
 *
 * @author lihin
 */
public class Main {
    
    public static void main(String[] args) {

        LoginDialog loginpage = new LoginDialog();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - loginpage.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - loginpage.getHeight()) / 2);
        loginpage.setLocation(x, y);

        loginpage.setVisible(true);

    }

}
