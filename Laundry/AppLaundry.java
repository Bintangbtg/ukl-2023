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
            System.out.println("Apakah sebelumnya anda sudah  memiliki akun?(ya/belum)");
            String jawab = input.nextLine();
            if(jawab.equalsIgnoreCase("ya")){
                System.out.println("Masukkan ID Anda");
                int id = input.nextInt()-1;
                System.out.println("Hi Selamat Datang "+c.getNama(id));
                System.out.println("ID anda "+(id+1));
                System.out.println("Jumlah saldo Anda :"+c.getSaldo(id));
                menu(id);
        }
          else{
                System.out.println("Maap Gabisa :b");
                System.out.println("Mohon Melakukan Pendaftaran dahulu secara offline \nLokasi kantor diatas tanah dan di bawah Langit :q");
                /*System.out.println("Masukkan Nama:");
            String nama = input.next();
            c.setNama(nama);
            System.out.println("Masukkan ID yang diinginkan:");
            int id = input.nextInt();
            t.setIDClient(id);
            System.out.println("Masukkan Alamat:");
            String alamat = input.next();
            c.setAlamat(alamat);
            System.out.println("Masukkan Nomor Telepon:");
            String telepon = input.next();
            c.setTelepon(telepon);
            System.out.println("Masukkan saldo yang ingin ditambahkan");
            int saldo = input.nextInt();
            c.addSaldo(saldo);
            System.out.println("Terimakasih telah mendaftar "+nama);
            System.out.println("ID anda "+id);
            menu(id);*/
        }
    }
    public static void tampilLaundry(){
        int n = jenislaundry.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Jenis Laundry :"+jenislaundry.getNamaJenisLaundry(i));
            System.out.println("Harga :"+jenislaundry.getHarga(i));
            System.out.println("Durasi :"+jenislaundry.getDurasi(i));
            System.out.println("ID :"+(i+1));
        }
    }

        public static void menu(int id){
        while(tetap){
            System.out.println("-- Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petugas");
            System.out.println("3. List Client");
            System.out.println("4. Laundry");
            System.out.println("5. Exit");
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
                System.out.println("Masukkan berapa banyak yang akan di laundry:");
                int banyak = input.nextInt();
                System.out.println("Jumlah  yang akan di laundry:"+banyak+"kg");
                t.setBanyak(banyak);
                int harga = jenislaundry.getHarga(t.getIDJenisLaundry(laundry))*banyak;
                if(c.getSaldo(id)>=harga){
                     int saldo = c.getSaldo(id);
                     int sisa = saldo - harga;
                     c.setSaldo(sisa);
                     c.editSaldo(id, sisa);
                    System.out.println("----------Total----------");
                    System.out.println("Jenis Laundry :"+jenislaundry.getNamaJenisLaundry(laundry));
                    System.out.println("Total Harga :"+harga);
                    System.out.println("Durasi :"+jenislaundry.getDurasi(laundry)+" Jam");
                    System.out.println("Terimakasih telah menggunkaan jasa kami");
                    System.out.println("Total Transaksi:"+harga);
                    System.out.println("Sisa saldo anda adalah:"+sisa);
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                }
                else{
                    System.out.println("Mohon Maaf Saldo anda tidak cukup");
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                }
            }
            else if(menu==5){
                System.out.println("Terimakasih telah percaya dengan kami /n Sampai Jumpa Lagi");
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
