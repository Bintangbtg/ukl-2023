package Laundry;
import java.util.Scanner;

public class AppLaundry {
        static Client c = new Client();
        static Petugas p = new Petugas();
        static Transaksi t= new Transaksi();
        static JenisLaundry jenislaundry = new JenisLaundry();
        static Scanner input = new Scanner(System.in);
        static boolean tetap = true;
        static String key;
        
   public static void main(String[] args) {
                System.out.println("-Selamat datang di Laundry Saya-");
                System.out.println("Masukkan ID Anda");
                int id = input.nextInt()-1;
                System.out.println("Hi Selamat Datang "+c.getNama(id));
                System.out.println("ID anda "+(id+1));
                System.out.println("Jumlah saldo Anda :Rp."+c.getSaldo(id));
                menu(id);
    }
    public static void tampilLaundry(){
        int n = jenislaundry.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("ID :"+(i+1));
            System.out.println("Jenis Laundry :"+jenislaundry.getNamaJenisLaundry(i));
            System.out.println("Harga :Rp."+jenislaundry.getHarga(i));
            System.out.println("Durasi :"+jenislaundry.getDurasi(i)+"Jam");
        }
    }

        public static void menu(int id){
        while(tetap){
            System.out.println("- Laundry -");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petugas");
            System.out.println("3. List Client");
            System.out.println("4. Laundry");
            System.out.println("5. Top up");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            if(menu==1){
                tampilLaundry();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==2){
                p.tampilPetugas();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==3){
                c.ClientTampil();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==4){
                tampilLaundry();
                System.out.println("Masukkan Id laundry yang diinginkan");
                int laundry = input.nextInt()-1;
                System.out.println("Masukkan berapa banyak yang akan di laundry:   Kg");
                int banyak = input.nextInt();
                System.out.println("Jumlah  yang akan di laundry:"+banyak+"kg");
                t.setBanyak(banyak);
                int harga = jenislaundry.getHarga(t.getIDJenisLaundry(laundry))*banyak;
                if(c.getSaldo(id)>=harga){
                     int saldo = c.getSaldo(id);
                     int sisa = saldo - harga;
                     c.setSaldo(sisa);
                     c.editSaldo(id, sisa);
                    System.out.println("- Total -");
                    System.out.println("Jenis Laundry :"+jenislaundry.getNamaJenisLaundry(laundry));
                    System.out.println("Total Harga :Rp."+harga);
                    System.out.println("Durasi :"+jenislaundry.getDurasi(laundry)+" Jam");
                    System.out.println("Terimakasih telah menggunkaan jasa kami");
                    System.out.println("Total Transaksi:Rp."+harga);
                    System.out.println("Sisa saldo anda adalah:Rp."+sisa);
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                }
                else{
                    System.out.println("Mohon Maaf Saldo anda tidak cukup\nMohon anda top up terlebih dahulu melalui fitur Topup\nMakasih ");
                     System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
            }
            }
            else if(menu==5){
                    System.out.println("-Top up-");
                    System.out.println("Masukkan Jumlah untuk top up:Rp.");
                    int Topup = input.nextInt();
                    int hasil = c.getSaldo(id)+Topup;
                    c.editSaldo(id, hasil);
                    System.out.println("Selamat Anda berhasil Topup sebesar:Rp."+Topup+"\nSaldo anda sekarang:Rp."+hasil);
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
            }
            else if(menu==6){
                    System.out.println("Terimakasih telah percaya dengan kami \nSampai jumpa lagi");
                    tetap = false;
            }
            else{
                System.out.println("Input yang anda masukkan tidak sesuai");
                System.out.println("Ketik apapun dan enter untuk kembali");
                key = input.next();
            }
        }
    }
        }
