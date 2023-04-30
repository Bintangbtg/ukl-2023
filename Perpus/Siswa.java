package Perpus;

import java.util.ArrayList;

public class Siswa implements User {
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList <Boolean> status = new ArrayList<Boolean>();

    public Siswa(){
    this.namaSiswa.add("Btg");
    this.alamat.add("Kos Bunda 2");
    this.telepon.add("911");
    this.status.add(true);
    
    this.namaSiswa.add("Alipp");
    this.alamat.add("Kos Bunda 2");
    this.telepon.add("911");
    this.status.add(true);
    
    this.namaSiswa.add("Alkaa");
    this.alamat.add("Kos Bunda 2");
    this.telepon.add("911");
    this.status.add(true);
    }
   
     @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaSiswa.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void setStatus(int id, boolean status){
        this.status.set(id, status);
    }
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    public void editStatus(int id, boolean status){
            this.status.set(id, status);
            }
    public void tampilkanSiswa(){
        int n = this.namaSiswa.size();
        for(int i = 0;i<n;i++){
            System.out.println("--------------------------");
            System.out.println("Nama  Siswa  = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Status ="+getStatus(i));
        }
        
    }
}
