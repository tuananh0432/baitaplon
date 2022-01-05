/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chucnang;
import ConectDatabase.Conect.conect.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import test52.Doimatkhau5;
/**
 *
 * @author ASUS
 */
public class doimatkhau {
    Connection conn=null;
    PreparedStatement sttm=null;
    public int Update(Doimatkhau5 mk){
    try {
        String sSQL="UPDATE hi.dulieu SET  Password =  ?  where Username=?" ;
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
       
        sttm.setString(1,mk.getNewpassword());
        sttm.setString(2,mk.getUsername());
        if(sttm.executeUpdate()>0)
            System.out.println("doi mat khau thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
}
