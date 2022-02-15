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
import penjualan.entity.barang;
import penjualan.koneksi.koneksi;
import java.util.List;
import java.util.ArrayList;
import penjualan.interfc.barangInterfc;
public class barangImplement implements barangInterfc{
    public barang insert(barang o) throws SQLException {
        PreparedStatement st = koneksi.koneksi().prepareStatement
                ("insert into barang values (?,?,?,?)");
        st.setString(1, o.getKodeBarang());
        st.setString(2, o.getNamaBarang());
        st.setString(3, o.getHarga());
        st.setString(4, o.getJumlah());
        st.executeUpdate();
        return o;
    }
    
    public void update(barang o) throws SQLException{
        PreparedStatement st=koneksi.koneksi().prepareStatement
                ("update barang set nama_barang=?,  jumlah_barang=?, harga_barang=? where id_barang=?");
        st.setString(4, o.getKodeBarang());
        st.setString(1, o.getNamaBarang());
        st.setString(2, o.getJumlah());
        st.setString(3, o.getHarga());
        st.executeUpdate();           
    }
    
    public void delete(String kodeBarang) throws SQLException{
        PreparedStatement st = koneksi.koneksi().prepareStatement
                ("delete from barang where id_barang=?");
        st.setString(1, kodeBarang);
        st.executeUpdate();
    }
    
    public List<barang> getAll() throws SQLException{
        Statement st = koneksi.koneksi().createStatement();
        ResultSet rs = st.executeQuery("select * from barang");
        List<barang>list = new ArrayList<barang>();
        while(rs.next()){
            barang brg = new barang();
            brg.setKodeBarang(rs.getString("id_barang"));
            brg.setNamaBarang(rs.getString("nama_barang"));
            brg.setJumlah(rs.getString("jumlah_barang"));
            brg.setHarga(rs.getString("harga_barang"));
            list.add(brg);
        }
        return list;
    }
}
