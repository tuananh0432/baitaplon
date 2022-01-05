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
public class Taotaikhoan5 {
    private String ID;
    private String Username;
    private String Password;
    private String Usertype;
    private String Nickname;
    private String Email;
    private String Hoten;
    public Taotaikhoan5(){
    }
    

    public Taotaikhoan5(String ID, String Username, String Password, String Usertype, String Nickname, String Email, String Hoten) {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.Usertype = Usertype;
        this.Nickname = Nickname;
        this.Email = Email;
        this.Hoten = Hoten;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsertype() {
        return Usertype;
    }

    public void setUsertype(String Usertype) {
        this.Usertype = Usertype;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    @Override
    public String toString() {
        return "Taotaikhoan{" + "ID=" + ID + ", Username=" + Username + ", Password=" + Password + ", Usertype=" + Usertype + ", Nickname=" + Nickname + ", Email=" + Email + ", Hoten=" + Hoten + '}';
    }
    
    
}
