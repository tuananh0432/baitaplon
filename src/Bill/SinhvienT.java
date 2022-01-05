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


/**
 *
 * @author ASUS
 */
public class SinhvienT  {
    Connection conn=null;
    PreparedStatement sttm=null;
public int add(Sinhvien sv){
    try {
        String sSQL="INSERT INTO hi.sinhvien2(ID, tênSV, malop, tuoi, gioitinh, diachi, sdt, Email) "+
                "values(?,?,?,?,?,?,?,?)";
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(1, sv.getID());
        sttm.setString(2, sv.getTenSV());
        sttm.setString(8, sv.getEmail());
        sttm.setString(7, sv.getSdt());
        sttm.setString(6, sv.getDiaChi());
        sttm.setString(5, sv.getGioiTinh());
        sttm.setString(3, sv.getMalop());
        sttm.setString(4, sv.getTuoi());
        if(sttm.executeUpdate()>0)
            System.out.println("Insert thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
public int Update(Sinhvien sv){
    try {
        String sSQL="UPDATE hi.sinhvien2 SET  tênSV = ?, malop = ?, tuoi = ?, gioitinh = ?, diachi = ?, sdt = ?, Email= ?  where ID=?" ;
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(8, sv.getID());
        sttm.setString(1, sv.getTenSV());
        sttm.setString(2, sv.getMalop());
        sttm.setString(3, sv.getTuoi());
        sttm.setString(4, sv.getGioiTinh());
        sttm.setString(5, sv.getDiaChi());
        sttm.setString(6, sv.getSdt());
        sttm.setString(7, sv.getEmail());
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
        
        String sSQL="delete from hi.sinhvien2 where ID =?";
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
 
public ArrayList<Sinhvien> getAll(){
    ArrayList <Sinhvien> ls =new ArrayList<>();
    PreparedStatement sttm=null;
    ResultSet rs=null;
    
    
    try{
        String sSQL="SELECT * FROM hi.sinhvien2";
        conn =DBconect.getDBcConnection();
        sttm = (PreparedStatement) conn.createStatement();
        rs=sttm.executeQuery(sSQL);
        while (rs.next())
        {
            Sinhvien sv=new Sinhvien();
            sv.setID(rs.getString(1));
            sv.setTenSV(rs.getString(2));
            sv.setMalop(rs.getString(3));
            sv.setTuoi(rs.getString(4));
            sv.setGioiTinh(rs.getString(5));
            sv.setDiaChi(rs.getString(6));
            sv.setSdt(rs.getString(7));
            sv.setEmail(rs.getString(8));
            ls.add(sv);
        }
    }catch(Exception e){
        System.out.println("Error"+e.toString());
}
    finally{
        try {
            rs.close();sttm.close();conn.close();
        }catch(Exception e){
    }
    }
    return  ls;
}
}


