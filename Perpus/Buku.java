package Perpus;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga  = new ArrayList<Integer>();
    
    public int size(){
        return this.namaBuku.size();
    }
    
    public Buku(){
        this.namaBuku.add("Mariposa");
        this.stok.add(29042007);
        this.harga.add(84150);
        
         this.namaBuku.add("12 Cerita Glen Anggara");
         this.stok.add(12);
         this.harga.add(84150);
        
         this.namaBuku.add("Laskar Pelangi");
         this.stok.add(50);
         this.harga.add(75650);
    }
    
     public String getNama(int id){
        return this.namaBuku.get(id);
    }
    public int getStok(int id){
        return this.stok.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public void setNama(String nama){
        this.namaBuku.add(nama);
    }
    public void setStok(int id, int stok){
        this.stok.set(id, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void tampilkanBuku(){
        int n = this.namaBuku.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Judul = "+getNama(i));
            System.out.println("Stok = "+getStok(i));
            System.out.println("Harga = "+getHarga(i));
        }
    }
}
