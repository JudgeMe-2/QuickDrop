/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop.Classes;

/**
 *
 * @author Jadge
 */
public class Payment {
    private int requestId;
    private int method;
    private int tip;
    private double cost;

    public Payment(int requestId, int method, int tip, double cost) {
        this.requestId = requestId;
        this.method = method;
        this.tip = tip;
        this.cost = cost;
    }
    
    

    public Payment() {
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Payment{" + "requestId=" + requestId + ", method=" + method + ", tip=" + tip + ", cost=" + cost + '}';
    }
    
    
}
