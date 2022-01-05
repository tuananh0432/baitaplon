/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;
import test52.Sinhvien;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public interface isinhvient {
    public ArrayList<Sinhvien> getAll();
    public ArrayList<Sinhvien> findByMaLopHoc(String maLop);
    public ArrayList<Sinhvien> findByMaSV(String maSV);
    public Sinhvien addNew(Sinhvien sv);
    public Sinhvien updateByMaSV(Sinhvien sv);
     public ArrayList<Sinhvien> CheckMaSV(String maSV);
}
