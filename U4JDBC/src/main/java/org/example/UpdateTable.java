package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        {try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/ke001";
            String user="root";
            String pwd="";
            Connection con= DriverManager.getConnection(url, user, pwd);

            String q="update book set bookname='English'where bookid=101";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("data updated into table book..");
            con.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }
}
