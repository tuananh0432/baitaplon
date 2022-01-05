/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectDatabase.Conect.conect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import test52.Sinhvien;
import Bill.SinhvienT;
/**
 *
 * @author ASUS
 */
public class DBconect {
     public static Connection connection;
     
    public static Connection getDBcConnection() {
        SinhvienT sv=new SinhvienT();
        final String url = "jdbc:mysql://localhost:3306";
        final String user = "root";
        final String password = "123456abcd";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBconect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        SinhvienT sv=new SinhvienT();
        Connection connection = getDBcConnection();
        if (connection != null){
    System.out.println("Thanh cong");
            Sinhvien sv2=new Sinhvien("110", "tung2", "K65", "18","Nu", "Hanoi", "889", "nguyeanhtuan");
           //sv.add(sv2);
          // Sinhvien sv3=new Sinhvien("125");
  //         sv.delete(sv3);
 
       sv.Update(sv2);
       
        }else System.out.println("That bai");
    }
     
}

