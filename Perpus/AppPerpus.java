package Perpus;

import java.util.Scanner;
public class AppPerpus {
    static Buku buku = new Buku();
    static Peminjaman peminjaman = new Peminjaman();
    static Petugas petugas = new Petugas();
    static Siswa siswa = new Siswa();
    
    static Scanner input = new Scanner(System.in);
    
    static boolean tetap = true;
    static String key;
    
    public static void main(String[] args){
        menu();
        
    }
    
    public static void menu(){
        //siswa.tampilkanSiswa();
        System.out.println("Masukkan ID Siswa");
        int id = input.nextInt()-1;
        int BukuPinjaman = 3;
        System.out.println("Hii selamat datang "+siswa.getNama(id));
        while(tetap){
            System.out.println("-- Perpustakaan --");
            System.out.println("1. List Buku");
            System.out.println("2. List Petugas");
            System.out.println("3. List Siswa");
            System.out.println("4. Pinjam Buku");
            System.out.println("5. Kembalikan Buku");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            if(menu==1){
                buku.tampilkanBuku();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==2){
                petugas.tampilPetugas();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==3){
                siswa.tampilkanSiswa();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==4){
                buku.tampilkanBuku();
                System.out.println("Masukkan id buku yang ingin dipinjam");
                int ID = input.nextInt()-1;
                if(siswa.getStatus(id)==true){
                    buku.setStok(ID, buku.getStok(ID)-1);
                    BukuPinjaman = ID;
                    System.out.println("Terimakasih telah meminjam buku "+buku.getNama(ID));
                    siswa.setStatus(id, false);
                    //siswa.setStatus(ID, false);
                    //siswa.setStatus(peminjaman.getIDSiswa(id), false);
                    System.out.println("Ketik apapun dan enter untuk keluar");
                    key = input.next();
                }
                else if (siswa.getStatus(id)==false){
                    System.out.println("Anda sudah meminjam buku \n Mohon kembalikan lalu anda bisa kembali meminjam");
                    System.out.println("Ketik apapun dan enter untuk keluar");
                    key = input.next();
                }
            }
            else if(menu==5){
                System.out.println("Masukkan id buku yang ingin anda kembalikan");
                int ID = input.nextInt()-1;
                if(siswa.getStatus(id)==false){
                    if(peminjaman.getBuku(ID)==BukuPinjaman){
                        buku.setStok(ID, buku.getStok(ID)+1);
                        System.out.println("Terimakasih telah mengembalikan buku "+buku.getNama(ID));
                        siswa.setStatus(id, true);
                        //siswa.setStatus(peminjaman.getIDSiswa(id), true);
                        System.out.println("Ketik apapun dan enter untuk keluar");
                        key = input.next();
                    }
                    else{
                        System.out.println("Buku yang ingin anda kembalikan tidak sesuai");
                        System.out.println("Ketik apapun dan enter untuk keluar");
                        key = input.next();
                    }
                }
                else if(siswa.getStatus(id)==true){
                    System.out.println("Anda belum meminjam buku");
                    System.out.println("Ketik apapun dan enter untuk keluar");
                    key = input.next();
                }
            }
            else if(menu==6){
                tetap = false;
            }
            else{
                System.out.println("Input anda salah");
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
    }
    }
}
    