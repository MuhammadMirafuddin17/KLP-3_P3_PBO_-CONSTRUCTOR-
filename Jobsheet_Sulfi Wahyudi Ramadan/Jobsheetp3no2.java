/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no3;
public class Jobsheetp3no2 {
    private String nama;
    private String nim;

    public Jobsheetp3no2(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilan() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        Jobsheetp3no2 mahasiswa1 = new Jobsheetp3no2("Sulfi Wahyudi Ramadan", "F1B021091");

        System.out.println("Informasi Buronan:");
        mahasiswa1.tampilan();
    }
}
