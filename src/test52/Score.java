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
public class Score {
    private String nganh1;
    private String nganh2;
    private String nganh3;
    private String ID;
    private String tenSV;
    private String malop;

    public Score(String nganh1, String nganh2, String nganh3, String ID, String tenSV, String malop) {
        this.nganh1 = nganh1;
        this.nganh2 = nganh2;
        this.nganh3 = nganh3;
        this.ID = ID;
        this.tenSV = tenSV;
        this.malop = malop;
    }

    public Score() {
       
    }

    public String getNganh1() {
        return nganh1;
    }

    public void setNganh1(String nganh1) {
        this.nganh1 = nganh1;
    }

    public String getNganh2() {
        return nganh2;
    }

    public void setNganh2(String nganh2) {
        this.nganh2 = nganh2;
    }

    public String getNganh3() {
        return nganh3;
    }

    public void setNganh3(String nganh3) {
        this.nganh3 = nganh3;
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

    @Override
    public String toString() {
        return "Score{" + "nganh1=" + nganh1 + ", nganh2=" + nganh2 + ", nganh3=" + nganh3 + ", ID=" + ID + ", tenSV=" + tenSV + ", malop=" + malop + '}';
    }
    
    
}