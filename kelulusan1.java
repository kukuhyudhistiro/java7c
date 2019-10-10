/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
public class kelulusan1 {
    public static void main(String args[]){
         //cek kelulusan
         //jika N > 60 maka status LULUS, selain itu TIDAK LULUS
         int N;
         String sts;
         //proses
         N = 65;
         if (N > 60) {
             sts = "LULUS";
         } else {
             sts = "TIDAK LULUS";
         }
         System.out.println("Nilai Anda = " + N);
         System.out.println("Status Anda = " + sts);
     }
}
