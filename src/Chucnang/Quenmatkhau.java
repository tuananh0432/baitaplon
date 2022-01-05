/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chucnang;
import ConectDatabase.Conect.conect.*;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Quenmatkhau {
    
   
        
        
        public static boolean isLogin(String Username , String Email,JFrame frame){
        try {
            Connection myCon = DBconect.getDBcConnection();
            String mySqlQuery = "Select Password From hi.dulieu Where Username = '" + 
                    Username +
                     
                    "' And Email = '" +
                     Email  + "'";
       
            PreparedStatement preparedStatement = myCon.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();  
        
            while (resultSet.next()){
                
                
                      Thongtintruyhoi.Password=resultSet.getString("Password");
                      
                 return true;
                   
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Database error: "+ ex.getMessage() );
        }
         return false;
    }
        
}


