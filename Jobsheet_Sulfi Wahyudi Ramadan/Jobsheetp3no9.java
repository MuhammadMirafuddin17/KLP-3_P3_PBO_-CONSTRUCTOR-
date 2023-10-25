/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no9;


import java.util.Scanner;
public class Jobsheetp3no9 {
    double energiPotensial;
    final double gravitasi = 9.81;
    public Jobsheetp3no9(double massa, double gravitasi, double tinggi){
        energiPotensial = massa * gravitasi *  tinggi;
    }
    public double getEnergiPotensial(){
        return energiPotensial;
    }

 public static void main(String[] args){
 try (Scanner input = new Scanner(System.in)) {
     System.out.println("Massa benda: ");
     double massa = input.nextInt();
     System.out.println("Tinggi: ");
     double tinggi = input.nextInt();
     Jobsheetp3no9 energi = new Jobsheetp3no9(massa, 9.81, tinggi);
     double hasilEnergiPotensial = energi.getEnergiPotensial();
     System.out.println("Energi Potensial: " + hasilEnergiPotensial);
 }
 }
}
