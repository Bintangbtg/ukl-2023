package Lelang;

import java.util.ArrayList;

/**
 *
 * @author Bintang
 */
public class Barang extends Lelang{
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    public ArrayList<Integer> hargaTertinggi = new ArrayList<Integer>();
    public int jumlahBarang = namaBarang.size();
    
    public int getHargaTertinggi(int id){
        return this.hargaTertinggi.get(id);
    }
    
    public Barang(){
        this.namaBarang.add("Jas Pria");
        this.hargaAwal.add(500000);
        this.status.add(true);
        
        this.namaBarang.add("Gaun");
        this.hargaAwal.add(500000);
        this.status.add(true);
        
        for(int i = 0;i<jumlahBarang;i++){
            hargaTertinggi.add(hargaAwal.get(i));
        }
    }
    
    public void gantiHargaAwal(int id , int harga){
        this.hargaAwal.set(id, harga);
    }
   public void setIdMasyarakat(int idMasyarakat){
        this.idMasyarakat.add(idMasyarakat);
    }
   public void setNamaBarang(String namaBarang){
       this.namaBarang.add(namaBarang);
   }
   public void setHargaAwal(int hargaAwal){
       this.hargaAwal.add(hargaAwal);
   }
   public void setStatus(boolean status){
       this.status.add(status);
   }
   public int getIdMasyarakat(int id){
       return this.idMasyarakat.get(id);
   }
   public String getNamaBarang(int id){
       return this.namaBarang.get(id);
   }
   public int getHargaAwal(int id){
       return this.hargaAwal.get(id);
   }
   public boolean getStatus(int id){
       return this.status.get(id);
   }
   public void editStatus(int id , boolean status){
       this.status.add(id, status);
   }
   
    public void tampilBarang(){
        int n = namaBarang.size();
        for(int i = 0;i < n;i++){
            System.out.println("---------------------------");
            System.out.println("ID = "+(i+1));
            System.out.println("Nama Barang = "+getNamaBarang(i));
            System.out.println("Harga Awal = "+getHargaAwal(i));
            System.out.println("Dapat Dilelang = "+getStatus(i));
            System.out.println("----------------------------");
        }
    }
    
}
