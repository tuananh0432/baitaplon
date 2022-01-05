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
public class Giangvien {
   private String ID;
    private String tenGV;
     private String malop;
    private String tuoi;
    private String gioiTinh;
    private String email;
    private String diaChi;
    private String sdt;
    public Giangvien()
    {
    }
    

    public Giangvien(String ID, String tenGV, String malop, String tuoi, String gioiTinh, String email, String diaChi, String sdt) {
        this.ID = ID;
        this.tenGV = tenGV;
        this.malop = malop;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Giangvien{" + "ID=" + ID + ", tenGV=" + tenGV + ", malop=" + malop + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", email=" + email + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }

   
}

