/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import ConectDatabase.Conect.conect.DBconect;

import java.awt.List;
import java.sql.PreparedStatement;

import test52.Sinhvien;
import test52.Lophoc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import test52.Giangvien;
import test52.Score;


/**
 *
 * @author ASUS
 */
public class SinhvienT3  {
    Connection conn=null;
    PreparedStatement sttm=null;
public int add(Score sv){
    try {
        String sSQL="INSERT INTO hi.score2(ID, tênSV, malop, nganh1, nganh2, nganh3) "+
                "values(?,?,?,?,?,?)";
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(1, sv.getID());
        sttm.setString(2, sv.getTenSV());
        sttm.setString(3, sv.getMalop());
        sttm.setString(4, sv.getNganh1());
        sttm.setString(5, sv.getNganh2());
        sttm.setString(6, sv.getNganh3());
      
        if(sttm.executeUpdate()>0)
            System.out.println("Insert thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
public int delete(String ID){
    try {
        
        String sSQL="delete from hi.score2 where ID =?";
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(1, ID);
        
        if(sttm.executeUpdate()>0)
            System.out.println("Delete thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
}


