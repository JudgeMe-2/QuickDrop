/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author tulin
 */
public class Connect {
    Connection conn=null;
    public Connect(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickdrop","root","");
            JOptionPane.showMessageDialog(null, "Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean registerUser(String number, int type){
        Statement stmt;
        String sql=null;
        ResultSet rs=null;
        try {
            stmt = conn.createStatement();
            if(validateNewUser(number)){
                sql="insert into user(phone_number, user_type) values(" + number + ","+ type +")";
                stmt.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
    public int loginUser(String number) {
        Statement stmt;
        String sql;
        ResultSet rs;
        try {
            stmt=conn.createStatement();
            sql ="select * from user where phone_number=" + number;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                int n = rs.getInt("user_type");
                if(n == 1) {
                    return 1;
                } else if(n == 0) {
                    return 0;
                } else {
                   return 2; 
                }
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
