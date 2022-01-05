/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import ConectDatabase.Conect.conect.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Conect {
    public static boolean isLogin(String userName, String passWord, String userType, JFrame frame){
        try {
            Connection myCon = DBconect.getDBcConnection();
            String mySqlQuery = "Select Usertype, Nickname,Hoten From hi.dulieu Where Username = '" + 
                    userName +
                    "' And Password = '" +
                     passWord + 
                    "' And Usertype = '" +
                     userType  + "'";
            PreparedStatement preparedStatement = myCon.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
               
                Dangnhap.Usertype= resultSet.getString("Usertype");
                Dangnhap.NickName = resultSet.getString("Nickname");
                Dangnhap.Hoten=resultSet.getString("Hoten");
                
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: "+ e.getMessage() );
        }
        return false;
    }
    
}

