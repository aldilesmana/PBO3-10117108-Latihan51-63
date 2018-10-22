/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan50.energi.kinetik;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : 
 *
 */
public class Energi {
    private int kecepatan;
    private double massa;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double hitungEnergiKinetik(){
        return 0.5*massa*(kecepatan*kecepatan);
        
    }
    /* karena dimulai dalam keadaan diem maka kecepatan nya menjadi nol*/
    public double hitungUsaha(){
        return 0.5*massa*(kecepatan*kecepatan) - 0.5*massa*(0*0);
    }
}
