/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117108.latihan55.handpone;

/**
 *
 * @author Aldi Lesmana
 * NAMA                 : Aldi Lesmana
 * KELAS                : PBO-3 
 * NIM                  : 10117108 
 * Deskripsi            : 
 *
 */
class Handphone {
  protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.println("\nManufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }

    
}


