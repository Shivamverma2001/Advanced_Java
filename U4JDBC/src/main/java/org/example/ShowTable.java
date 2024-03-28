package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowTable {
    public static void main(String[] args) {
        {try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/ke001";
            String user="root";
            String pwd="";
            Connection con= DriverManager.getConnection(url, user, pwd);

            String q="select * from book";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(q);
            System.out.println("Details of book..");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }
}
