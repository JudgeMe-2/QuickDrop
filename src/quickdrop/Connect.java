/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quickdrop.Classes.Location;
import quickdrop.Classes.Payment;
import quickdrop.Classes.Request;
import quickdrop.Classes.RiderRequest;
import quickdrop.Classes.User;


/**
 *
 * @author tulin
 */
public class Connect {
    Connection conn;
    
    private String date;
    public Connect(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickdrop","root","");
            //JOptionPane.showMessageDialog(null, "Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        date = LocalDate.now().toString();
    }
    
    public boolean registerUser(User user){
        Statement stmt;
        String sql=null;
        ResultSet rs=null;
        try {
            stmt = conn.createStatement();
            if(validateNewUser(user.getPhone_number())){
                sql="insert into user(name, phone_number, user_type) values('"+user.getName() + "', '" + user.getPhone_number() + "', "+ user.getUser_type() +")";
                stmt.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean validateNewUser(String number){
        
            Statement stmt;
            String sql=null;
            ResultSet rs=null;
        try { 
            stmt = conn.createStatement();
            sql="select * from user where phone_number='" + number +"'";
            rs =stmt.executeQuery(sql);
            if(!rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public User loginUser(String number) {
        Statement stmt;
        String sql;
        ResultSet rs;
        try {
            stmt=conn.createStatement();
            sql ="select * from user where phone_number='" + number + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                //int n = rs.getInt("user_type");
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void createRequest(Request request) {
        Statement stmt;
        String sql=null;
        
        try {
            stmt = conn.createStatement();
            sql="insert into request values('"+request.getFirstname()+"','"+request.getLastname()+"','"+request.getHomephone()+"','"+request.getMobilephone()+"','"+request.getWeight()+"')";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Request> displayRequest(int id){
        
            ArrayList<Request> req = new ArrayList<>();
            Statement stmt;
            ResultSet rs;
            
            try {
            stmt = conn.createStatement();
            String sql = "select * from request where user_id = "+id+"";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                //OrderHistory o = new OrderHistory(rs.getString("orderID"),rs.getString("dateRecieved"),rs.getString("dropOffLocation"), rs.getString("status")) ;
                req.add(new Request(rs.getInt(1), rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7),rs.getDouble(8),rs.getInt(9), rs.getString(10)));
            }
            
            
            return req;
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }
    public void connClose() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User getUser(int user_id) {
        Statement stmt;
        String sql;
        ResultSet rs;
        User user = new User();
        try {
            stmt=conn.createStatement();
            sql ="select * from user where user_id=" + user_id + "";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                //JOptionPane.showMessageDialog(null, "Login Successful");
                user.setId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setPhone_number(rs.getString("phone_number"));
                user.setUser_type(rs.getInt("user_type"));
                return user;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void addLocation(Location location) {
        Statement stmt = null;
        String sql = "INSERT INTO setuplocation(pickUp_location, dropOff_location) VALUES ('"+location.getPickUp_loc()+"', '"+location.getDropOff_loc()+"')";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            /*try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(2, location.getPickUp_loc());
            stmt.setString(3, location.getDropOff_loc());
            stmt.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getLocations() {
        String sql = "SELECT * FROM setuplocation";
        
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public boolean proceed(Request req) {
        String sql = "insert into request(location_ID,user_id,firstname,lastname,homephone,mobilephone,weight) values("
                        + req.getLocation_id()+","+req.getUser_id()+",'"+req.getFirstname()+"','"+req.getLastname()
                        +"','"+req.getHomephone()+"','"+req.getMobilephone()+"',"+req.getWeight()+")";
        
        String sql2 = "select * from setuplocation where location_ID=" + req.getLocation_id();
        Statement stmt, stmt2;
        ResultSet rs, rs2;
        try {
            stmt = conn.createStatement();
            //insert to request
            stmt.executeUpdate(sql);
            
            stmt2 = conn.createStatement();
            
            rs2 = stmt2.executeQuery(sql2);
            rs2.next();
            
            sql = "SELECT * FROM request ORDER BY request_id DESC LIMIT 1";
            rs = stmt.executeQuery(sql);
            if(rs.next()) {
                sql = "insert into verification(request_id,pickup_loc,dropoff_loc,weight,user_id) values(" +
                        rs.getInt("request_id")+",'"+rs2.getString("pickUp_location")+"','"+rs2.getString("dropOff_location")+"',"+req.getWeight()+","+req.getUser_id()+")";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "To be Process");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<VerifyRequest> displayDeliveryRequests(){
        ArrayList<VerifyRequest> request = new ArrayList<VerifyRequest>();
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = conn.createStatement();
            //read table for delivery request
            String sql = "select * from verification where delivery_status = 0";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                VerifyRequest o = new VerifyRequest(rs.getInt("request_id"),rs.getString("pickup_loc"),rs.getString("dropoff_loc"), rs.getDouble("weight")) ;
                request.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return request;
    }
    
    public void acceptDeliveryRequest(int requestID, String deliveryFee){
        String sql = "select * from verification where request_id = '"+requestID+"'";
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){    
                sql = "update verification set delivery_fee = "+deliveryFee+", delivery_status = 1 where request_id = '"+requestID+"' ";
                stmt.executeUpdate(sql);
                sql = "update request set status=1 where request_id=" + requestID;
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Delivery Request Accepted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void denyDeliveryRequest(int requestID){
        String sql = "select * from verification where request_id = '"+requestID+"'";
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){    
                sql = "update verification set delivery_status = -1 where request_id = '"+requestID+"' ";
                stmt.executeUpdate(sql);
                sql = "update request set status= -1 where request_id=" + requestID;
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Delivery Request Denied");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Location getLocationById(int id) {
        String sql = "SELECT * FROM setuplocation where location_ID=" + id;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            return new Location(rs.getString(2), rs.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Request getRequestById(int req_id) {
        String sql = "SELECT * FROM request where request_id=" + req_id;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            return new Request(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getInt(9), rs.getString(10));
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    public Request getRequestByUserId(int userId) {
        String sql = "SELECT * FROM request where user_id=" + userId;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            return new Request(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getInt(9), rs.getString(10));
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public VerifyRequest getVerificationById(Request r) {
        
        String sql = "SELECT * FROM verification where delivery_status=1 and request_id=" + r.getRequest_id() + " ORDER BY request_id DESC LIMIT 1" ;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            //return new VerifyRequest(rs.getInt(1), rs.getString(2), rs.getString(3), Double.parseDouble(rs.getString(4)), rs.getInt(5), rs.getDouble(6));
            //                                   int-------------------------string----------------------string--------------------double---------------int------------double
            return new VerifyRequest(rs.getInt(1), rs.getString(2), rs.getString(3), Double.parseDouble(rs.getString(4).toString()), rs.getInt(5), rs.getDouble(6), rs.getInt(7));
        
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean addPayment(Payment p) {
        Statement stmt;
        String sql=null;
        
        try {
            stmt = conn.createStatement();
            sql = "insert into payment(request_id, pay_method, tip, cost) values("+p.getRequestId()+", "+p.getMethod()+", "+p.getTip()+", "+p.getCost()+")";
            stmt.executeUpdate(sql);
            sql = "update verification set delivery_status = 2 where request_id = '"+p.getRequestId()+"' ";
            stmt.executeUpdate(sql);
            sql = "update request set status=2 where request_id=" + p.getRequestId();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //For Rider Table
    
    public ArrayList<RiderRequest> displayRiderDeliveries(){
        ArrayList<RiderRequest> rider = new ArrayList<RiderRequest>();
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = conn.createStatement();
            String sql = "select * from verification where delivery_status = 2";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                RiderRequest o = new RiderRequest(rs.getInt("user_id"),rs.getInt("request_id"),rs.getString("pickup_loc"),rs.getString("dropoff_loc"), rs.getDouble("weight"), rs.getDouble("delivery_fee")) ;
                rider.add(o);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return rider;
    }
    
    public void deliveredDone(int reqId){
        
        String sql = "select * from request where status = 2 and request_id=" + reqId;
        Statement stmt;
        ResultSet rs;
        try {   
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                int userID = rs.getInt("user_id");
                int requestID = rs.getInt("request_id");
                sql = "update request set status = 3, date_delivered='"+date+"' where request_id = "+requestID+" and status=2";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "The Item with request ID no."+requestID+ " and user no." + userID + " is delivered successfully.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
