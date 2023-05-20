/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop.Classes;



/**
 *
 * @author FatBoy
 */
public class OrderHistory {
    private String orderID;
    private String dateRecieved;
    private String location;
    private String status;

    public OrderHistory() {
    }

    public OrderHistory(String orderID, String dateRecieved, String location, String status) {
        this.orderID = orderID;
        this.dateRecieved = dateRecieved;
        this.location = location;
        this.status = status;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getDateRecieved() {
        return dateRecieved;
    }

    public String getLocation() {
        return location;
    }
    
    public String getStatus() {
        return status;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void getDateRecieved(String dateRecieved) {
        this.dateRecieved = dateRecieved;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
}