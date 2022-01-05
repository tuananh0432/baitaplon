/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectDatabase.Conect.conect;

import Bill.SinhvienT;
import static ConectDatabase.Conect.conect.DBconect.getDBcConnection;
import java.sql.Connection;
import test52.Sinhvien;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
        SinhvienT sv = new SinhvienT();
        Connection connection = getDBcConnection();
        if (connection != null) {
            System.out.println("Thanh cong");
            Sinhvien sv2 = new Sinhvien("112", "tu", "K65", "18", "Nu", "Hanoi", "889", "nguyeanhtuan");
            sv.add(sv2);
            
          
           
        } else {
            System.out.println("That bai");
        }
    }
}
