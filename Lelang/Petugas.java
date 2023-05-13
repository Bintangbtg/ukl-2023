package Lelang;

import java.util.ArrayList;

/**
 *
 * @author Bintang
 */
public class Petugas implements User{
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public int size(){
       return this.nama.size();
    }
    public Petugas(){
        this.nama.add("Vino");
        this.alamat.add("Bunder");
        this.telepon.add("Lupa");
        
        this.nama.add("Bian");
        this.alamat.add("Jumput");
        this.telepon.add("-");
    }
     public void setNama(String nama){
                this.nama.add(nama);
            }
    @Override
            public void setTelepon(String  telepon){
                this.telepon.add(telepon);
            }
    @Override
            public void setAlamat(String alamat){
                this.alamat.add(alamat);
            }
    @Override
            public String getNama(int id){
                return this.nama.get(id);
            }
    @Override
            public String  getAlamat(int id){
                return this.alamat.get(id);
            }
    @Override
            public String getTelepon(int id){
                return this.telepon.get(id);
            }
            
            public void Petugas(){
        int n = this.nama.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama = "+getNama(i));
            System.out.println("Alamat = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }
}
