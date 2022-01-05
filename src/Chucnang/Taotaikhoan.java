/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chucnang;

import ConectDatabase.Conect.conect.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import test52.Taotaikhoan5;

/**
 *
 * @author ASUS
 */
public class Taotaikhoan {
    Connection conn=null;
    PreparedStatement sttm=null;
public int add(Taotaikhoan5 tk){
    try {
        String sSQL="INSERT INTO hi.dulieu(malop, Username, Password,Usertype, Nickname, Email, Hoten) "+
                "values(?,?,?,?,?,?,?)";
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        sttm.setString(1,tk.getID());
        sttm.setString(2, tk.getUsername());
        sttm.setString(7, tk.getHoten());
        sttm.setString(6, tk.getEmail());
        sttm.setString(5, tk.getNickname());
        sttm.setString(3, tk.getPassword());
        sttm.setString(4, tk.getUsertype());
        if(sttm.executeUpdate()>0)
            System.out.println("Insert thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
}
