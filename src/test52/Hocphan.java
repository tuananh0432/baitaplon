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
public class Hocphan {
      private String maHP;
    private String tenHP;
    private String maMH;
     private String tenKhoa;
    private String hocPhanYeuCau;

   

    public Hocphan() {
        
    }

    public Hocphan(String maHP, String tenHP, String maMH, String tenKhoa, String hocPhanYeuCau) {
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.maMH = maMH;
        this.tenKhoa = tenKhoa;
        this.hocPhanYeuCau = hocPhanYeuCau;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getHocPhanYeuCau() {
        return hocPhanYeuCau;
    }

    public void setHocPhanYeuCau(String hocPhanYeuCau) {
        this.hocPhanYeuCau = hocPhanYeuCau;
    }
    
}
