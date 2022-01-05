/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test52;

/**
 *
 * @author ASUS
 */
public class Sinhvien {

    private String ID;
    private String tenSV;
    private String malop;
    private String tuoi;
    private String gioiTinh;
    private String diaChi;
    private String sdt;
    private String Email;
public Sinhvien()
{
}

    public Sinhvien(String ID, String tenSV, String malop, String tuoi, String gioiTinh, String diaChi, String sdt,String Email) {
        this.ID = ID;
      
        this.tenSV = tenSV;
        this.malop = malop;

        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.Email=Email;
    }

    public Sinhvien(String ID) {
        this.ID = ID;
    }

    
   
    

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
    

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "ID=" + ID + ", tenSV=" + tenSV + ", malop=" + malop + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", Email=" + Email + '}';
    }

}
