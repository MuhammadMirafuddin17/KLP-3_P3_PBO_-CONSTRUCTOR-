import java.util.Scanner;

public class debit { 
 int hitungDebit; 
 int Volume;
 static int waktu;

 public debit(int volume, int waktu){
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
     
     debit nilai = new debit(volume, waktu);
     System.out.println("Debit air: " + 
    nilai.hitungDebit);
}
 }
}
