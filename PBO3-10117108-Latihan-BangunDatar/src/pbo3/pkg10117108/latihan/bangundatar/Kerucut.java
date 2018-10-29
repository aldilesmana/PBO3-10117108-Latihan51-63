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
public class Kerucut extends BangunRuang {
    private double r;
    private double t;
    private double s;
    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    public double hitungSisiSelimut() {
        this.s = Math.sqrt((r*r)+(t*t));
        return this.s;
    }
    
    public double hitungVolume() {
        this.volume = (1 * 3.14 * r * r * t) / 3;
        return this.volume;
    }
}