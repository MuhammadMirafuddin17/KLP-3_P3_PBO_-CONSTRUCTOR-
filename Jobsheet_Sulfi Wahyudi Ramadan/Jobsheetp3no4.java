/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no4;

/**
 *
 * @author Sulfi Wahyudi R
 */
public class Jobsheetp3no4 {
    private String merk;
    private String model;
    private int tahun;
    private double harga;

    public Jobsheetp3no4() {
        merk = "Tidak Diketahui";
        model = "Tidak Diketahui";
        tahun = 0;
        harga = 0.0;
    }

    public Jobsheetp3no4(String merk, String model) {
        this.merk = merk;
        this.model = model;
        tahun = 0;
        harga = 0.0;
    }

    public Jobsheetp3no4(String merk, String model, int tahun, double harga) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    public void tampilan() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: $" + harga);
    }

    public static void main(String[] args) {
        Jobsheetp3no4 mobil1 = new Jobsheetp3no4();
        Jobsheetp3no4 mobil2 = new Jobsheetp3no4("Toyota", "Camry");
        Jobsheetp3no4 mobil3 = new Jobsheetp3no4("Honda", "Civic", 2022, 25000.0);

        System.out.println("Informasi Mobil 1:");
        mobil1.tampilan();

        System.out.println("\nInformasi Mobil 2:");
        mobil2.tampilan();

        System.out.println("\nInformasi Mobil 3:");
        mobil3.tampilan();
    }
}
