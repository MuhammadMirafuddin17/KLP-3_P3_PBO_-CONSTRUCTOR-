/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no1;

public class Jobsheetp3no1 {
    private String nama;
    private String nim;

    public Jobsheetp3no1() {
        nama = "Sulfi Wahyudi Ramadan";
        nim = "F1B021091";
    }

    public void tampilan() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        Jobsheetp3no1 mahasiswa1 = new Jobsheetp3no1();

        System.out.println("Informasi Mahasiswa :");
        mahasiswa1.tampilan();
    }
}
