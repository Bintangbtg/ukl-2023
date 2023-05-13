package Lelang;

import java.util.Scanner;

/**
 *
 * @author Bintang
 */
public class AppLelang {
    static Masyarakat m = new Masyarakat();
    static Petugas p = new Petugas();
    static Lelang l = new Lelang();
    static Barang b = new Barang();
    static Scanner y = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean tetap = true;
        String key;
        System.out.print("Masukkan ID = ");
        int id = y.nextInt()-1;
        System.out.println("Selamat Datang "+m.getNama(id));
        if(id == 0){
            while(tetap == true){
            System.out.println("-- Pelelangan --");
            System.out.println("1. List Barang yang Dilelang");
            System.out.println("2. List Petugas");
            System.out.println("3. List User");
            System.out.println("4. Lelang");
            System.out.println("5. Top up Saldo");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = y.nextInt();
            
            if(menu==1){
                b.tampilBarang();
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==2){
                p.Petugas();
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==3){
                m.Masyarakatl();
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==4){
                b.tampilBarang();
                System.out.println("Masukkan id barang yang ingin anda bid");
                int idb = y.nextInt()-1;

                if(b.getStatus(idb) == true){
                    System.out.println("Masukkan Harga Tawar untuk "+b.getNamaBarang(idb));
                    int tawaran = y.nextInt();
                    if(tawaran > b.getHargaAwal(idb)){
                        System.out.println("Masukkan Tawaran dari:"+m.getNama(1));
                        int tawaran2 = y.nextInt();
                        if(tawaran > tawaran2){
                                 System.out.println("Selamat anda menang dengan harga:"+tawaran);
                                m.editSaldo(id, m.getSaldo(id)-tawaran);
                                b.editStatus(idb, false);
                                b.setStatus(false);
                                System.out.println("Sisa saldo anda:"+m.getSaldo(id));
                        }
                        else{
                            System.out.println("yah sayang sekali anda kalah dari "+m.getNama(1));
                            b.editStatus(idb, false);
                            m.editSaldo(1, m.getSaldo(1)-tawaran2);
                            System.out.println("Selamat "+m.getNama(1)+" Anda berhak menang dengan tawaran  "+tawaran2+"\nSisa saldo anda:"+m.getSaldo(1));
                        }
                      }
                    else{
                    System.out.println("Maaf anda memasukkan harga yang kurang dari harga awal\nPenawaran hanya akan di terima jika nominal lebih dari harg awal");
                    }
                }else if(b.getStatus(idb) == false){
                    System.out.println("Maaf barang ini sudah terjual\nAnda bisa menawar hal lainya\nUtuk melihat apa saja maka lihatlah menu nomor 1");
                }
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==5){
                System.out.println("Masukkan Jumlah Top up anda:");
                int t = y.nextInt();
                System.out.println("Selamat anda berhasil top up"+t);
                m.editSaldo(id, m.getSaldo(id)+t);
                System.out.println("Saldo anda sekarang: "+m.getSaldo(id));
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            else if(menu==6){
                tetap = false;
            }
        }
        }
        
        else if(id == 1){
            while(tetap == true){
            System.out.println("-- Pelelangan --");
            System.out.println("1. List Barang yang Dilelang");
            System.out.println("2. List Petugas");
            System.out.println("3. List User");
            System.out.println("4. Lelang");
            System.out.println("5. Top up Saldo");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = y.nextInt();
            
            if(menu==1){
                b.tampilBarang();
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==2){
                p.Petugas();
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==3){
                m.Masyarakatl();
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==4){
                b.tampilBarang();
                System.out.println("Masukkan id barang yang ingin anda bid");
                int idb = y.nextInt()-1;

                 if(b.getStatus(idb) == true){
                    System.out.println("Masukkan Harga Tawar untuk "+b.getNamaBarang(idb));
                    int tawaran = y.nextInt();
                    if(tawaran > b.getHargaAwal(idb)){
                        System.out.println("Masukkan Tawaran dari: "+m.getNama(1));
                        int tawaran2 = y.nextInt();
                        if(tawaran > tawaran2){
                                 System.out.println("Selamat anda menang dengan harga:"+tawaran);
                                m.editSaldo(id, m.getSaldo(id)-tawaran);
                                b.editStatus(idb, false);
                                b.setStatus(false);
                                System.out.println("Sisa saldo anda:"+m.getSaldo(id));
                        }
                        else{
                            System.out.println("yah sayang sekali anda kalah dari "+m.getNama(1));
                            b.editStatus(idb, false);
                            m.editSaldo(1, m.getSaldo(1)-tawaran2);
                            System.out.println("Selamat "+m.getNama(1)+" Anda berhak menang dengan tawaran  "+tawaran2+"\nSisa saldo anda:"+m.getSaldo(1));
                        }
                      }
                    else{
                    System.out.println("Maaf anda memasukkan harga yang kurang dari harga awal\nPenawaran hanya akan di terima jika nominal lebih dari harg awal");
                    }
                }else if(b.getStatus(idb) == false){
                    System.out.println("Maaf barang ini sudah terjual\nAnda bisa menawar hal lainya\nUtuk melihat apa saja maka lihatlah menu nomor 1");
                }
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            
            else if(menu==5){
                System.out.println("Masukkan Jumlah Top up anda:");
                int t = y.nextInt();
                System.out.println("Selamat anda berhasil top up"+t);
                m.editSaldo(id, m.getSaldo(id)+t);
                System.out.println("Saldo anda sekarang:"+m.getSaldo(id));
                System.out.println("\nMasukkan apapun dan tekan enter");
                key = y.next();
            }
            else if(menu==6){
                tetap = false;
            }
        }
         }
        
}
}
