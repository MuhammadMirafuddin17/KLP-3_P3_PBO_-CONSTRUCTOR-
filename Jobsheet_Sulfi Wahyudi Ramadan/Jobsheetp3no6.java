/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no6;

import java.util.Scanner;

public class Jobsheetp3no6 {
    String judul;
    int halaman;
    
    public Jobsheetp3no6(String judul) {
        this.judul = judul;
    }
    
    public Jobsheetp3no6(int halaman) {
        this.halaman = halaman;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Judul buku: ");
        String judul = input.nextLine();
        
        System.out.println("Halaman buku: ");
        int halaman = input.nextInt();
        
        Jobsheetp3no6 buku = new Jobsheetp3no6("Laskar Pelangi"); 
        Jobsheetp3no6 buku2 = new Jobsheetp3no6(328); 

        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + buku.judul);
        System.out.println("Halaman: " + buku2.halaman);
    }
}




