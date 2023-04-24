package Laundry;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idjenislaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    
        public JenisLaundry l = new JenisLaundry();
        
        public int size(){
            return this.idClient.size();
        }
        
        public Transaksi(){
        this.idClient.add(12345);
        this.idClient.add(54321);
        for(int i=0;i<l.size();i++){
            this.idjenislaundry.add(i);
        }
    }
        public void setIDClient(int id){
        this.idClient.add(id);
    }
    
    public void setIDJenisLaundry(int id){
        this.idjenislaundry.add(id);
    }
    
    public void setBanyak(int banyak){
        this.banyak.add(banyak);
    }
    
    public int getClient(int id){
        return this.idClient.indexOf(id);
    }
    
    public int getIDClient(int id){
        return this.idClient.get(id);
    }
    
    public int getIDJenisLaundry(int id){
        return this.idjenislaundry.get(id);
    }
    
    public int getBanyak(int banyak){
        return this.banyak.get(banyak);
    }
    
    public int getIDBanyak(int banyak){
        return this.banyak.indexOf(banyak);
    }
     }
