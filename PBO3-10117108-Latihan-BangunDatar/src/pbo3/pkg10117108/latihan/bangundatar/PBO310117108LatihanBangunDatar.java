/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117108.latihan.bangundatar;

/**
 *
 * @author Aldi Lesmana
 * NAMA                 : Aldi Lesmana
 * KELAS                : PBO-3 
 * NIM                  : 10117108
 * Deskripsi            : 
 * 
 */
public class PBO310117108LatihanBangunDatar {

        public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        System.out.println("Volume Bola : " + b.hitungVolume());
        
        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + t.hitungVolume());
        
        k.setR(14);
        k.setT(9);
        k.hitungSisiSelimut();
        System.out.println("Volume Kerucut : " + k.hitungVolume());
    }
    
    
}

   