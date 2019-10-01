/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
public class kelulusan {
        public static void main(String args[]){
            int uts, uas, tugas;
            String status; //lulus / tidak
            String statusbayar; //lunas / belum
            //LULUS jika UAS > 90 ATAU UTS >70 DAN tugas > 80
            
            statusbayar = "LUNAS";
            uas = 80;
            uts = 75;
            tugas = 85;
                
               if(statusbayar == "LUNAS"){
                   if(uas>90 && uts>70 && tugas>80){
                       status = "LULUS";
                   } else {
                       status = "TIDAK LULUS";
                   }
                   System.out.println("Status Kelulusan : " + status );
                   
               } else {
                   status = "BAYAR DULU!";
                   System.out.println("Status Bayar : " + status );
               }
         
        }

}
