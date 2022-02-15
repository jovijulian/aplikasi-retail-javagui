/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jovi Julian
 */
package penjualan.entity;
public class pelanggan {
    private int idPelanggan;
    private String namaPelanggan;
    private String jk;
    private String alamat;
    private String nohp;
    
    String idpel = String.valueOf(idPelanggan);
    
    public String getIdPelanggan(){
        return idpel;
    }
    public void setIdPelanggan(String idpel){
        this.idpel = idpel;
    }
    public String getNama(){
        return namaPelanggan;
    }
    public void setNama(String namPelanggan){
        this.namaPelanggan = namPelanggan;
    }
    public String getJenisKel(){
        return jk;
    }
    public void setJenisKel(String jk){
        this.jk = jk;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNoTlp(){
        return nohp;
    }
    public void setNoTlp(String nohp){
        this.nohp = nohp;
    }
}
