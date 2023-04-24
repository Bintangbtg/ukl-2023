package Laundry;
import java.util.ArrayList;

public class Client implements User{
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public int size(){
        return this.nama.size();
    }
    
   public Client(){
            this.nama.add("Bian");
            this.alamat.add("Jumput");
            this.telepon.add("081 kapan kapan ta kasi tau");
            this.saldo.add(10000);
            
            this.nama.add("Vino");
            this.alamat.add("Bunder");
            this.telepon.add("08 berapa?");
            this.saldo.add(100000);
            
            this.nama.add("Bintang");
            this.alamat.add("Bunder");
            this.telepon.add("085102369827");
            this.saldo.add(1000000);
            }

            public void setSaldo(int saldo){
            this.saldo.add(saldo);
            }
            public int getSaldo(int id){
            return this.saldo.get(id);
            }
            public void editSaldo(int id, int saldo){
            this.saldo.set(id, saldo);
            }
            public void addSaldo(int saldo){
                    this.saldo.add(saldo);
                }
            public int getJmlClient(){
            return this.saldo.size();
            }
            
            public int getId(String nama){
              return  this.nama.indexOf(nama);
            }
    @Override
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
            
            public void ClientTampil(){
        int n = this.nama.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama Pelangan= "+getNama(i));
            System.out.println("Alamat Pelangan= "+getAlamat(i));
            System.out.println("Telepon Pelangan= "+getTelepon(i));
            System.out.println("Saldo Pelangan= "+getSaldo(i));
        }
    }
}
