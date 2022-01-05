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
public class MonHoc {
    
    private String maMH;
    private String tenMH;
    private String maChuyenNganh;
    private String hocKy;
    private String soTinChi;
    private String hinhThucThi;
   


    public MonHoc() {
    }

    public MonHoc(String maMH, String tenMH, String maChuyenNganh, String hocKy, String soTinChi, String hinhThucThi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.maChuyenNganh = maChuyenNganh;
        this.hocKy = hocKy;
        this.soTinChi = soTinChi;
        this.hinhThucThi = hinhThucThi;
       
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(String soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

    

}
