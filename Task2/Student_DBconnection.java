package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student_DBconnection {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "system";
        String pass = "Vaishnavi";
        boolean flag=false;

        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt=con.prepareStatement("select * from student");
         ResultSet rs =stmt.executeQuery();

            System.out.printf("%-5s %-15s %-30s %-5s%n",
                    "ID", "NAME", "DEPARTMENT", "YEAR");
            System.out.println("---------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-5d %-15s %-30s %-5d%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getInt("year"));
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch( Exception e) {
            e.printStackTrace();
        }

    }
}
