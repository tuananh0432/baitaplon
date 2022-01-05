/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectDatabase.Conect.conect;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ASUS
 */
public class Getall {
    
    public static void main(String[] args) {
        Connection con = DBconect.getDBcConnection();
        
        String sql = "select * from hi.sinhvien2  ";
        try {
            PreparedStatement pepareStatement = con.prepareStatement(sql);
            
            
            ResultSet rs = pepareStatement.executeQuery();
            while (rs.next()){
                
                System.out.println(rs.getString("ID") + rs.getString("tênSV")+ rs.getString("malop")+rs.getString("tuoi")+rs.getString("gioitinh")+rs.getString("diachi")+rs.getString("sdt")+rs.getString("Email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Getall.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
