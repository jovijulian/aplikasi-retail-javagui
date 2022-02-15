/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.koneksi;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jovi Julian
 */
public class koneksi {
    
   private static Connection con;
   public static Connection koneksi() {
        if(con == null){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_jual", "root", "");
            System.out.println("Sukses Terhubung ke Database");
        } catch(Exception ex){
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error koneksi ke database\n" + ex);
        }
    }
        return con;
   }
}

