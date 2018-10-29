/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117108.latihan56.umurbarangantik;

/**
 *
 * @author Aldi Lesmana
 * NAMA                 : Aldi Lesmana
 * KELAS                : PBO-3 
 * NIM                  : 10117108 
 * Deskripsi            : 
 *
 */
public class Radio extends BarangAntik {
   private String nama;

    public Radio(int umur) {
        super(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
