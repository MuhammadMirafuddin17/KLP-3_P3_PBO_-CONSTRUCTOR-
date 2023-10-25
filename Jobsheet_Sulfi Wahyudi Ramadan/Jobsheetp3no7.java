/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no7;

import java.util.Scanner;
public class Jobsheetp3no7 { 
 int hitungDebit; 
 int Volume;
 static int waktu;

 public Jobsheetp3no7(int volume, int waktu){
 hitungDebit = volume/waktu;
 }
 
 public int hitungDebit(){
 return hitungDebit;
 }

 public static void main(String[] args){
 try (Scanner input = new Scanner (System.in)) {
    System.out.println("Volume air: ");
     int volume = input.nextInt();
     System.out.println("Waktu: ");
     waktu = input.nextInt();
     
     Jobsheetp3no7 nilai = new Jobsheetp3no7(volume, waktu);
     System.out.println("Debit air: " + nilai.hitungDebit);
}
 }
}
