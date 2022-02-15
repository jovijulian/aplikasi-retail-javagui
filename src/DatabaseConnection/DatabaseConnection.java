package DatabaseConnection;

import java.sql.*;


    public class DatabaseConnection {
    Connection conn=null;
    String url = "jdbc:mysql://localhost:3306/dbtugas?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String pass = "";
    public DatabaseConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection
            (url,user,pass);
            if(conn!=null){
                System.out.println("Connection database ("+conn+") OK");
            }
        }catch(SQLException ex){
         System.err.print(ex);
        }catch(ClassNotFoundException ex){
         System.err.print(ex);
        }
    }
    }