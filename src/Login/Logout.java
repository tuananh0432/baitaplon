/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Chucnang.JScore;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Logout {
    public static void LogOut(JFrame context ,FLogin loginScreen) {
        Dangnhap.isLoggedIn=false;
        context.setVisible(false);
        loginScreen.setVisible(true);
        
    }

   
}
