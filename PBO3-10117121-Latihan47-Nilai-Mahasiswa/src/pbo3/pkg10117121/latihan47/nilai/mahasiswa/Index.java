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
 * Deskripsi Program    : 
 *
 */
public class Index {
    private double quiz,uts,uas;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUTS() {
        return uts;
    }

    public void setUTS(double uts) {
        this.uts = uts;
    }

    public double getUAS() {
        return uas;
    }

    public void setUAS(double uas) {
        this.uas = uas;
    }
    
    public double nilaiAkhir(double nilaiAkhir){
        nilaiAkhir = (0.2*quiz)+(0.3*uts)+(0.5*uas);
        
        if(nilaiAkhir >=80 && nilaiAkhir<=100){
            System.out.println("Index = 'A'");
            System.out.println("Keterangan = Sangat Baik");
        }else if(nilaiAkhir >=68 && nilaiAkhir<=80){
            System.out.println("Index = 'B'");
            System.out.println("Keterangan = Baik");
        }else if(nilaiAkhir >=56 && nilaiAkhir<=68){
            System.out.println("index = 'C'");
            System.out.println("Keterangan = Cukup");
        }else if(nilaiAkhir >=45 && nilaiAkhir<=56){
            System.out.println("Index = 'D'");
            System.out.println("Keterangan = kurang");
        }else{
            System.out.println("Index = 'E'");
            System.out.println("Keterangan = Sangat Kurang");
        }
        return nilaiAkhir;
    }

}
