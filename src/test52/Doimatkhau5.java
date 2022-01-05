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
public class Doimatkhau5 {
   private String Oldpassword;
   private String newpassword;
   private String Username;
    
public Doimatkhau5()
{

}
    public Doimatkhau5(String Oldpassword, String newpassword, String Username) {
        this.Oldpassword = Oldpassword;
        this.newpassword = newpassword;
        this.Username = Username;
    }

    public String getOldpassword() {
        return Oldpassword;
    }

    public void setOldpassword(String Oldpassword) {
        this.Oldpassword = Oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    @Override
    public String toString() {
        return "Doimatkhau5{" + "Oldpassword=" + Oldpassword + ", newpassword=" + newpassword + ", Username=" + Username + '}';
    }
}
