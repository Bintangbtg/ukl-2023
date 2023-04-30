package Perpus;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon  = new ArrayList<String>();
    
    public Petugas(){
        this.namaKaryawan.add("Bayu");
        this.alamat.add("Bunder");
        this.telepon.add("123");
    }
    
    @Override
    public void setNama(String nama){
        this.namaKaryawan.add(nama);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    public String getNama(int id){
        return this.namaKaryawan.get(id);
    }
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    public String getTelepon(int id){
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaKaryawan.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama Petugas= "+getNama(i));
            System.out.println("Alamat Petugas= "+getAlamat(i));
            System.out.println("Nomor Telepon Petugas= "+getTelepon(i));
        }
    }
}
