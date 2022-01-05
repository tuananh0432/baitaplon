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
public class Logout2 {
    public static void LogOut(JFrame context ,Type2 loginScreen) {
        Dangnhap.isLoggedIn=false;
        context.setVisible(false);
        loginScreen.setVisible(true);
        
    }
    public static void LogOut2(JFrame context ,Borad2 loginScreen) {
        Dangnhap.isLoggedIn=false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
    public static void LogOut3(JFrame context,Borad3 loginScreen) {
        Dangnhap.isLoggedIn=false;
        context.setVisible(false);
        loginScreen.setVisible(true);
        
    }
    
   
}
