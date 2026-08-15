package com.HexWare.interviewprep;
import java.util.*;
import java.sql.*;
public class JDBCEmployee {
    public static void main(String[] args) {
        DataBaseProcess db = new DataBaseProcess();
        db.connectDB();
        db.fetch(101);
    }
}
class DataBaseProcess{
    public static Connection con;
    public void connectDB(){
        try{
            con = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/employee",
              "root",
              "Root@123"
            );
            System.out.println("Database Connected!!!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void fetch(int id){
        try{
            String query = "SELECT name, salary FROM employee WHERE id = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //System.out.println("Id: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(1));
                System.out.println("Salary: "+rs.getDouble(2));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
