/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
import java.util.Scanner;
public class cekKelulusanInputNilai7C {
    
    public static void main(String args[]){
        int stsbayar=0; //0=belum, 1=lunas
        int uts, uas, tugas; //input
        Scanner instsbayar = new Scanner(System.in);
        Scanner inuts = new Scanner(System.in);
        Scanner inuas = new Scanner(System.in);
        Scanner intgs = new Scanner(System.in);
        
        
        String stslulus; //lulus / tidak
        
        //LULUS jika UAS > 90 ATAU UTS >70 DAN tugas > 80
        System.out.println("Masukkan Status bayar (0/1) = ");
        stsbayar = instsbayar.nextInt();
        if(stsbayar!=0){
            System.out.println("Sudah Lunas");
             System.out.print("Masukkan Tugas = ");
             tugas = intgs.nextInt();
             System.out.print("Masukkan UTS = ");
             uts = inuts.nextInt();
             System.out.print("Masukkan UAS = ");
             uas = inuas.nextInt();
             if (uas > 90 || uts > 70 && tugas > 80) {
                stslulus = "LULUS";
                } else {
                stslulus = "TIDAK LULUS";
                }
            System.out.println("Status Kelulusan : " + stslulus);
             
        } else {
            System.out.println("Belum Lunas");
        }
        
    }
    
}
