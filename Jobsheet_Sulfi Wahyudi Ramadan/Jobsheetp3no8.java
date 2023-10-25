/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheetp3no8;

import java.util.Scanner;
public class Jobsheetp3no8 {
    int hitungKecepatan;
    
    public Jobsheetp3no8(int jarak,int waktu){
        hitungKecepatan = jarak / waktu;
    }
    public int hitungKecepatan(){
        return hitungKecepatan;
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Jarak tempuh: ");
            int jarak = input.nextInt();
            System.out.println("Watu tempuh: ");
            int waktu = input.nextInt();
            Jobsheetp3no8 hasil = new Jobsheetp3no8(jarak, waktu);
            System.out.println("Kecepatan tempuh: " + hasil.hitungKecepatan());
}
 
 }
}
