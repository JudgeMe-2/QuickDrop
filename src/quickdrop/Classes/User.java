/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop.Classes;

import java.net.IDN;

/**
 *
 * @author Jadge
 */
public class User {
    private int id;
    private String cntrycode;
    private String phone_number;
    private int user_type;

    public User(int id, String cntrycode, String phone_number, int user_type) {
        this.id = id;
        this.cntrycode = cntrycode;
        this.phone_number = phone_number;
        this.user_type = user_type;
    }

    public User(String phone_number) {
        this.phone_number = phone_number;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCntrycode() {
        return cntrycode;
    }

    public void setCntrycode(String cntrycode) {
        this.cntrycode = cntrycode;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }
    
    
}
