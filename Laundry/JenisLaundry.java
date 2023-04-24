package Laundry;

import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
  
    public int size(){
        return this.JenisLaundry.size();
    }
    
    public JenisLaundry(){
        this.JenisLaundry.add("Reguler");
        this.durasi.add(24);
        this.harga.add(5000);
        
        this.JenisLaundry.add("Kilat");
        this.durasi.add(12);
        this.harga.add(7500);
        
        this.JenisLaundry.add("Expres");
        this.durasi.add(6);
        this.harga.add(10000);
    }
    
    public void setNamaJenisLaundry(String jenis){
        this.JenisLaundry.add(jenis);
    }
    public String getNamaJenisLaundry(int id){
        return this.JenisLaundry.get(id);
    }
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    public int getDurasi(int durasi){
        return this.durasi.get(durasi);
    }
    public void editDurasi(int id , int durasi){
        this.editDurasi(id, durasi);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
}
