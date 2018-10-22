/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan49.emas.kawin;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : Program menghitung harga mas
 *
 */
public class PBO310117121Latihan49EmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas objE = new Emas();
        objE.setHarga(570000);
        objE.setTotalBerat(15.7);
        System.out.println("Rho Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat 15,7 gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp.570.000. Berapa total");
        System.out.println("harus dikeluarkan oleh Rho ?");
        System.out.println("");
        System.out.println("Jadi Biaya Yang Harus Dikeluarkan Oleh Rho Adalah "
                + "Rp."+objE.perhitungan());
    }

}
