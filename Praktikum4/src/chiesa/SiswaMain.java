
package chiesa;

import java.text.ParseException;
import java.util.Scanner;

public class SiswaMain {
    public static void main(String[] args) throws ParseException {
        SiswaProgram sp = new SiswaProgram();
        sp.addData("a", "a", "21-11-2000", 0);
        sp.addData("b", "b", "1-1-1999", 1);
        sp.addData("c", "b", "1-1-1999", 0);
        sp.addData("d", "b", "1-1-1999", 1);
        Scanner in = new Scanner(System.in);
        boolean ind = true;
        while(ind){
            System.out.println("Data Siswa");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan :");
            int option = in.nextInt();
            if(option == 1){
                System.out.print("Masukkan NIM : ");
                String nim = in.next();
                System.out.print("Masukkan Nama : ");
                String nama = in.next();
                System.out.print("Masukkan Tanggal Lahir : ");
                String tgl = in.next();
                System.out.println("Masukkan Gender L(0)/P(1)");
                String gender = in.next();
                sp.addData(nim, nama, tgl, Integer.valueOf(gender));
            }
            else if(option == 2){
                System.out.println("Masukkan NIM : ");
                String nim = in.next();
                sp.deleteData(nim);
            }
            else if(option == 3){
                System.out.println("Cari berdasarkan");
                System.out.println("1. NIM");
                System.out.println("2. Gender");
                System.out.print("Masukkan pilihan :");
                int option2 = in.nextInt();
                
                if(option2 == 1){
                    System.out.print("Masukkan NIM : ");
                    String nim = in.next();
                    sp.searchData(nim);
                }
                else if(option2 == 2){
                    System.out.print("Masukkan Gender L(0) / P(1) : ");
                    int gender = in.nextInt();
                    sp.searchData(gender);
                }
                
            }
            else if(option == 4){
                sp.showData();
            }
            else{
                ind = false;
            }
        }
    }
}
