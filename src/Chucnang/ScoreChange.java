/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chucnang;
import ConectDatabase.Conect.conect.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import test52.Score;

/**
 *
 * @author ASUS
 */
public class ScoreChange {
    Connection conn=null;
    PreparedStatement sttm=null;

    public int Update(Score sc){
    try {
        String sSQL="UPDATE hi.score2 SET  nganh1 = ?, nganh2 = ?, nganh3 = ?  where ID=?" ;
        conn=DBconect.getDBcConnection();
        sttm=conn.prepareStatement(sSQL);
        
        sttm.setString(1, sc.getNganh1());
        sttm.setString(2, sc.getNganh2());
        sttm.setString(3, sc.getNganh3());
        sttm.setString(4, sc.getID());
       
       
        if(sttm.executeUpdate()>0)
            System.out.println("Insert thanh cong");
       return 1;
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    return -1;
}
}
