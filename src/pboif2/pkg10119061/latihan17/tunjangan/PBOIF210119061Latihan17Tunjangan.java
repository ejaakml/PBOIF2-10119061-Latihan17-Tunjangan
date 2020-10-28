/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan17.tunjangan;

/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
import java.util.Scanner;
public class PBOIF210119061Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String status;
       int gaji, tunjangan;
       
       System.out.println("Program Tunjangan");
       System.out.println("=================");
       System.out.print("Berapa gaji pokok anda sebulan? :Rp. ");
       gaji = input.nextInt();
       System.out.print("Status Anda?(Menikah/Belum): " );
       status=input.next();
            if ("Belum".equals(status)){
        tunjangan=0;
    } else {
       tunjangan=(int)(0.35*gaji);
    }
    int gajiTotal = gaji+ tunjangan;
    System.out.println("");
    System.out.println("========Hasil Perhitungan Gaji Anda========");
    System.out.println("Gaji Pokok  : "+gaji);
    System.out.println("Tunjangan   : "+tunjangan);
    System.out.println("Gaji Total  : "+gajiTotal);
    System.out.println("============================");
    System.out.println("Developed by: Rheiza Akmal R");
    }
}
    
    

    

