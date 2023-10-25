/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no2;

/**
 *
 * @author Sulfi Wahyudi R
 */
public class Jobsheetp3no3 {
    private String mataKuliah;
    private int nilaiMatkul;

    public Jobsheetp3no3(String mataKuliah, int nilaiMatkul) {
        this.mataKuliah = mataKuliah;
        this.nilaiMatkul = nilaiMatkul;
    }

    public void tampilan() {
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Nilai Matkul: " + nilaiMatkul);
    }

    public static void main(String[] args) {
        Jobsheetp3no3 nilai1 = new Jobsheetp3no3("KSI",95);
        Jobsheetp3no3 nilai2 = new Jobsheetp3no3("Basis Data",89);

        System.out.println("Informasi Mahasiswa 1:");
        nilai1.tampilan();

        System.out.println("\nInformasi Mahasiswa 2:");
        nilai2.tampilan();
    }
}

