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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.entity.pelanggan;
import penjualan.koneksi.koneksi;
import penjualan.interfc.pelangganInterfc;
public class pelangganImplement implements pelangganInterfc {
        public pelanggan insert(pelanggan o) throws SQLException {
        PreparedStatement st = koneksi.koneksi().prepareStatement
                ("insert into pelanggan values (?,?,?,?,?)");
        st.setString(1, o.getIdPelanggan());
        st.setString(2, o.getNama());
        st.setString(3, o.getJenisKel());
        st.setString(4, o.getAlamat());
        st.setString(5, o.getNoTlp());
        st.executeUpdate();
        return o;
    }
    
    public void update(pelanggan o) throws SQLException{
        PreparedStatement st=koneksi.koneksi().prepareStatement
                ("update pelanggan set nama=?,  jk=?, alamat=?, nohp=? where idPelanggan=?");
        st.setString(5, o.getIdPelanggan());
        st.setString(1, o.getNama());
        st.setString(2, o.getJenisKel());
        st.setString(3, o.getAlamat());
        st.setString(4, o.getNoTlp());
        st.executeUpdate();           
    }
    
    public void delete(String idPelanggan) throws SQLException{
        PreparedStatement st = koneksi.koneksi().prepareStatement
                ("delete from pelanggan where idPelanggan=?");
        st.setString(1, idPelanggan);
        st.executeUpdate();
    }
    
    public List<pelanggan> getAll() throws SQLException{
        Statement st = koneksi.koneksi().createStatement();
        ResultSet rs = st.executeQuery("select * from pelanggan");
        List<pelanggan>list = new ArrayList<pelanggan>();
        while(rs.next()){
            pelanggan p = new pelanggan();
            p.setIdPelanggan(rs.getString("idPelanggan"));
            p.setNama(rs.getString("nama"));
            p.setJenisKel(rs.getString("jk"));
            p.setAlamat(rs.getString("alamat"));
            p.setNoTlp(rs.getString("nohp"));
            list.add(p);
        }
        return list;
    }

  
    
}
