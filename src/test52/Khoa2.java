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
public class Khoa2 {
    
    private String makhoa;
    private String tenkhoa;
    private String sdt;

    public Khoa2() {
    }

    public Khoa2(String makhoa, String tenkhoa, String sdt) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
        this.sdt = sdt;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
