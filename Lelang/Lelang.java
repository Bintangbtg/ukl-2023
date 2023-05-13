package Lelang;

import java.util.ArrayList;

/**
 *
 * @author Bintang
 */
public class Lelang {
    public ArrayList <Integer> idPenawar = new ArrayList <Integer>(); 
    public ArrayList <Integer> idBarang = new ArrayList <Integer>(); 
    public ArrayList <Integer> Tawaran = new ArrayList <Integer>(); 
    
    public void setPenawar(int id){
        this.idPenawar.add(id);
    }
    public void setBarang(int id){
        this.idBarang.add(id);
    }
    public void setTawaran(int harga){
        this.Tawaran.add(harga);
    }
    
}
