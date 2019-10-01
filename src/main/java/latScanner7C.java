/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 1 okt 2019
 * @author x220
 */
import java.util.Scanner;

public class latScanner7C {
     public static void main(String args[]){
         String nama="";
         Scanner inNama = new Scanner(System.in);
         
         System.out.print("Masukkan Nama : ");
         nama = inNama.nextLine();
         
         System.out.println("===========================");
         System.out.println("Nama anda adalah " + nama);
         System.out.println("===========================");
     }
}
