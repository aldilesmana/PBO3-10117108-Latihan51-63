/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan47.nilai.mahasiswa;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : Program menghitung nilai akhir dari nilai quiz uts & uas
 *
 */
public class PBO310117121Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Index objI = new Index();
        objI.setQuiz(0.0);
        objI.setUTS(0.0);
        objI.setUAS(0.0);
        System.out.println("QUIZ\t= "+objI.getQuiz());
        System.out.println("UTS\t= "+objI.getUTS());
        System.out.println("UAS\t= "+objI.getUAS());
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
         
        Index obj2 = new Index();
        obj2.setQuiz(50.0);
        obj2.setUTS(50.0);
        obj2.setUAS(50.0);
        System.out.println("QUIZ\t= "+obj2.getQuiz());
        System.out.println("UTS\t= "+obj2.getUTS());
        System.out.println("UAS\t= "+obj2.getUAS());
        System.out.println("");
        System.out.println("Nilai Akhir = "+obj2.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");     
        
        Index obj3 = new Index();
        obj3.setQuiz(90.0);
        obj3.setUTS(90.0);
        obj3.setUAS(90.0);
        System.out.println("QUIZ\t= "+obj3.getQuiz());
        System.out.println("UTS\t= "+obj3.getUTS());
        System.out.println("UAS\t= "+obj3.getUAS());
        System.out.println("");
        System.out.println("Nilai Akhir = "+obj3.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
    }

}
