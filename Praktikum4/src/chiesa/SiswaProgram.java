
package chiesa;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SiswaProgram{
    public ArrayList<String> nim, nama;
    public ArrayList<Date> tglLahir;
    public ArrayList<Integer> gender;

    public SiswaProgram() {
        this.nama = new ArrayList<>();
        this.nim = new ArrayList<>();
        this.gender = new ArrayList<>();
        this.tglLahir = new ArrayList<>();
    }
    
    public void addData(String nim, String nama, String tgl, Integer gender) throws ParseException{
        Date date = new SimpleDateFormat("dd-MM-yy").parse(tgl);
        this.nim.add(nim);
        this.nama.add(nama);
        this.gender.add(gender);
        this.tglLahir.add(date);
    }
    
    public void deleteData(String nim){
        int pos = this.nim.indexOf(nim);
        this.nim.remove(pos);
        this.nama.remove(pos);
        this.tglLahir.remove(pos);
        this.gender.remove(pos);
    }
    
    public void showData(){
        int sz = this.nim.size();
        for(int i = 0; i < sz; i++){
            System.out.println("====================================================");
            System.out.println("NIM           : " + this.nim.get(i));
            System.out.println("Nama          : " + this.nama.get(i));
            System.out.println("Tanggal Lahir : " + this.tglLahir.get(i));
            String g;
            if(this.gender.get(i) == 0){
                g = "Laki - Laki";
            }else{
                g = "Perempuan";
            }
            System.out.println("Gender        : " + g);
            System.out.println("====================================================");
        }
        
        System.out.println("Total Data : " + this.nim.size());
    }
    public void searchData(String nim){
        int pos = this.nim.indexOf(nim);
        System.out.println("====================================================");
        System.out.println("NIM           : " + this.nim.get(pos));
        System.out.println("Nama          : " + this.nama.get(pos));
        System.out.println("Tanggal Lahir : " + this.tglLahir.get(pos));
        String g;
        if(this.gender.get(pos) == 0){
            g = "Laki - Laki";
        }else{
            g = "Perempuan";
        }
        System.out.println("Gender        : " + g);
        System.out.println("====================================================");
    }
    
    public void searchData(int gender){
        int sz = this.nim.size();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        for(int i = 0; i < sz; i++){
            if(this.gender.get(i) == 0){
                l.add(i);
            }else{
                p.add(i);
            }
        }
        if(gender == 0){
            for(int i: l){
                System.out.println("====================================================");
                System.out.println("NIM           : " + this.nim.get(i));
                System.out.println("Nama          : " + this.nama.get(i));
                System.out.println("Tanggal Lahir : " + this.tglLahir.get(i));
                String g;
                if(this.gender.get(i) == 0){
                    g = "Laki - Laki";
                }else{
                    g = "Perempuan";
                }
                System.out.println("Gender        : " + g);
                System.out.println("====================================================");
            }
        }else{
            for(int i: p){
                System.out.println("====================================================");
                System.out.println("NIM           : " + this.nim.get(i));
                System.out.println("Nama          : " + this.nama.get(i));
                System.out.println("Tanggal Lahir : " + this.tglLahir.get(i));
                String g;
                if(this.gender.get(i) == 0){
                    g = "Laki - Laki";
                }else{
                    g = "Perempuan";
                }
                System.out.println("Gender        : " + g);
                System.out.println("====================================================");
            }
        }
    }
}
