package Lelang;

import java.util.ArrayList;

/**
 *
 * @author Bintang
 */
public class Masyarakat implements User{
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public int size(){
       return this.nama.size();
    }
    public Masyarakat(){
        this.nama.add("bintang");
        this.alamat.add("Bunder");
        this.telepon.add("085");
        this.saldo.add(10000000);
        
        this.nama.add("ytta");
        this.alamat.add("lupa");
        this.telepon.add("-");
        this.saldo.add(10000000);
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
            public void setSaldo(int saldo){
                this.saldo.add(saldo);
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
            public Integer getSaldo(int id){
                return this.saldo.get(id);
            }
            public void editSaldo(int id , int saldo){
                this.saldo.add(id, saldo);
            }
            
            public void Masyarakatl(){
        int n = this.nama.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama = "+getNama(i));
            System.out.println("Alamat = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Saldo Anda:"+getSaldo(i));
        }
    }
}
