package org.example;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/KE001";
            String username="root";
            String password="Shivam@786";
            Connection con= DriverManager.getConnection(url,username,password);

            //Create table

            //String q="Create table book(b_id int(5) primary key, book_name varchar(30))";
            //Statement st=con.createStatement();
            //st.executeUpdate(q);
            //System.out.println("Book table created");

            //insert into table

            //String q="insert into book values(101,'Java'),(102,'C++')";
            String q="insert into book values(?,?)";
            PreparedStatement st=con.prepareStatement(q);
            st.setInt(1,103);
            st.setString(2,"Python");
            st.execute();
            System.out.println("Insert values successfully");

            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
