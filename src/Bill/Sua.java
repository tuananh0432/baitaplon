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
import test52.Score;


/**
 *
 * @author ASUS
 */
public class Sua  {
    Connection conn=null;
    PreparedStatement sttm=null;
public int add(Score sc){
    try {
        String sSQL="INSERT INTO hi.score(ID,nganh1, nganh2, nganh3) "+
                "values(?,?,?,?,?,?,?,?)";
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(1, sc.getID());
        sttm.setString(2, sc.getNganh1());
        sttm.setString(3, sc.getNganh2());
        sttm.setString(4, sc.getNganh3());
        if(sttm.executeUpdate()>0)
            System.out.println("Insert thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
public int Update(Score sc){
    try {
        String sSQL="UPDATE hi.score SET  nganh1 = ?, nganh2 = ?, nganh3 = ?,   where ID=?" ;
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(4,sc.getID());
        sttm.setString(1,sc.getNganh1());
        sttm.setString(2,sc.getNganh2());
        sttm.setString(3,sc.getNganh3());
        
        
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


