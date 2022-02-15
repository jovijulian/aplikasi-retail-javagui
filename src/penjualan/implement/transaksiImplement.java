/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jovi Julian
 */
package penjualan.implement;
import java.sql.*;
import penjualan.koneksi.koneksi;
import java.util.ArrayList;
public class transaksiImplement {
    public int urutanDb(){
        Connection con = (Connection) koneksi.koneksi();
        int jml = 0;
        try{
            String sql = "Select count(*) AS urutan from penjualan";
            Statement rs = (Statement) con.createStatement();
            ResultSet count = rs.executeQuery(sql);
            while (count.next()){
                jml = count.getInt("urutan");
            }
            rs.close();
            count.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ++jml;
    }
    
    public ArrayList<String> viewKdBrg() throws SQLException{
        ArrayList<String> viewNamaBrg = new ArrayList();
        try{
            Statement kt = koneksi.koneksi().createStatement();
            ResultSet rsKb = kt.executeQuery("Select id_barang,nama_barang from barang");
            while(rsKb.next()){
                viewNamaBrg.add(rsKb.getString("id_barang")+ "-" + (rsKb.getString("nama_barang")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return viewNamaBrg;
    }
    
    public ArrayList<String> viewIdPlg() throws SQLException{
        ArrayList<String> viewNamaPlg = new ArrayList();
        try{
            Statement kt = koneksi.koneksi().createStatement();
            ResultSet rsPlg = kt.executeQuery("Select idPelanggan,nama from pelanggan");
            while(rsPlg.next()){
                viewNamaPlg.add(rsPlg.getString("idPelanggan")+ "-" + (rsPlg.getString("nama")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return viewNamaPlg;
    }
}
