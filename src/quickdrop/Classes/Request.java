/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop.Classes;

/**
 *
 * @author kylea
 */
public class Request {
    private int request_id;
    private int location_id;
    private int user_id;
    private String firstname;
    private String lastname;
    private String homephone;
    private String mobilephone;
    private double weight;
    private int status;
    private String date;

    public Request(String firstname, String lastname, String homephone, String mobilephone, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.weight = weight;
        status = 0;
    }

    public Request() {
    }

    public Request(int request_id, int location_id, int user_id, String firstname, String lastname, String homephone, String mobilephone, double weight, int status, String date) {
        this.request_id = request_id;
        this.location_id = location_id;
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.weight = weight;
        this.status = status;
        this.date = date;
    }
    
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    @Override
    public String toString() {
        return "Request{" + "request_id=" + request_id + ", location_id=" + location_id + ", user_id=" + user_id + ", firstname=" + firstname + ", lastname=" + lastname + ", homephone=" + homephone + ", mobilephone=" + mobilephone + ", weight=" + weight + '}';
    }
    
    
    
}