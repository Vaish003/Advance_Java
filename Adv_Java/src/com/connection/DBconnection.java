package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public static void main(String[] args)  {
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user="system";
        String pass="Vaishnavi";

        try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection(url,user,pass);
        if(con!=null){
            System.out.println("Connection Successful....");
        }
        else{
            System.out.println("Connection Failed.......");
        }
        con.close();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
