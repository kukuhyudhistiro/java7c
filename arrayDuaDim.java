/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
public class arrayDuaDim {
     public static void main(String args[]) {
         String mhs[][] = { {"19830001", "A","SBY"},
                            {"19830002", "B","MLG"},
                            {"19830002", "C","MLG"},
                            {"19830002", "D","MLG"},
                            {"19830002", "E","MLG"},
                            {"19830002", "F","MLG"}};
         for(int baris = 0 ; baris < 6; baris++ ){
             for(int kolom=0; kolom < 3; kolom++){
                 System.out.print(mhs[baris][kolom] + " | ");
             }
             System.out.println("");
         }
         
     }
}
