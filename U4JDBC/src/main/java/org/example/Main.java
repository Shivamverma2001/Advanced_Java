package org.example;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            //step1. load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver()); give SQLException

            //step2. connection is established
            //DriverManager.getConnection("jdbc:mysql://localhost:3306/KE001","root","Shivam@786");
            String url="jdbc:mysql://localhost:3306/KE001";
            String username="root";
            String password="Shivam@786";
            Connection con=DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection is established");
            }

            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}