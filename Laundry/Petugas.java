package Laundry;

import java.util.ArrayList;

public class Petugas extends Client{
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon  = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas(){
        this.nama.add("Pak Alka");
        this.alamat.add("Spanyol katae");
        this.telepon.add("08 berapa?");
        this.jabatan.add(0);
        
        this.nama.add("Pak Alip");
        this.alamat.add("Banyuwangi");
        this.telepon.add("08 berapa?");
        this.jabatan.add(0);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int idpetugas){
        return this.jabatan.get(idpetugas);
    }
    public int getJmlgPtgs(){
        return this.nama.size();
    }
    
    //Inheritance
   //Karna extends Client tidak perlu manggil setter lagi
    
    public String getNama(int id){
        return this.nama.get(id);
    }
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    public String getTelepon(int id){
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.nama.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama Petugas= "+getNama(i));
            System.out.println("Alamat Petugas= "+getAlamat(i));
            System.out.println("Nomor Telepon Petugas= "+getTelepon(i));
        }
    }
}
