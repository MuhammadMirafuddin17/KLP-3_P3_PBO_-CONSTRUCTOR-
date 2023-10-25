/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetnp3no5;

/**
 *
 * @author Sulfi Wahyudi R
 */
public class Jobsheetnp3no5 {
    String hari;
    String bulan;
    int tanggal;
    int tahun;
 
 public Jobsheetnp3no5(String hari, String bulan) {
     this.hari = hari;
     this.bulan = bulan;
 }
 public Jobsheetnp3no5(int tanggal, int tahun) {
     this.tanggal = tanggal;
     this.tahun = tahun;
 }
 public static void main(String[] args){
     Jobsheetnp3no5 lahir1 = new Jobsheetnp3no5("Senin","Desember");
     
     Jobsheetnp3no5 lahir2 = new Jobsheetnp3no5(17,2003);
     System.out.println("Hari: " + lahir1.hari);
     System.out.println("Tanggal: " + lahir2.tanggal);
     System.out.println("Bulan: " + lahir1.bulan);
     System.out.println("Tahun: " + lahir2.tahun);
 }
 
}
