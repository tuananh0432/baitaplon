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
public class Xemthongtin3 {
    
   
        
        
        public static boolean isLogin(String IDsv , JFrame frame){
        try {
            Connection myCon = DBconect.getDBcConnection();
            String mySqlQuery = "Select tênGV, malop, tuoi,gioitinh,diachi,sdt,Email From hi.giangvien2 Where ID= '" + 
                    IDsv + "'" ;
       
            PreparedStatement preparedStatement = myCon.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();  
        
            while (resultSet.next()){
                
                 Sinhvien.tênSV=resultSet.getString("tênGV");
                  Sinhvien.Malop=resultSet.getString("malop");
                   Sinhvien.tuoi=resultSet.getString("tuoi");
                    Sinhvien.gioitinh=resultSet.getString("gioitinh");
                     Sinhvien.diachi=resultSet.getString("diachi");
                      
                      Sinhvien.sdt=resultSet.getString("sdt");
                      Sinhvien.Email=resultSet.getString("Email");
                 return true;
                   
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Database error: "+ ex.getMessage() );
        }
         return false;
    }
        
}


