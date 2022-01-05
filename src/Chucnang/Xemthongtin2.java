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
public class Xemthongtin2 {
    
   
        
        
        public static boolean isLogin(String IDsv , JFrame frame){
        try {
            Connection myCon = DBconect.getDBcConnection();
            String mySqlQuery = "Select nganh1,nganh2,nganh3,tênSV,malop From hi.score2 Where ID= '" + 
                    IDsv + "'" ;
            
       
            PreparedStatement preparedStatement = myCon.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();  
        
            while (resultSet.next()){
                
                Sinhvien.diemnganh1=resultSet.getString("nganh1");
                  Sinhvien.diemnganh2=resultSet.getString("nganh2");
                  Sinhvien.diemnganh3=resultSet.getString("nganh3");
                  Sinhvien.tênSV=resultSet.getString("tênSV");
                  Sinhvien.Malop=resultSet.getString("malop");
                      
                      
                 return true;
                   
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Database error: "+ ex.getMessage() );
        }
         return false;
    }
        
}


