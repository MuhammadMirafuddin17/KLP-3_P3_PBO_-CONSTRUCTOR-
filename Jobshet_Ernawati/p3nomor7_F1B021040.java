import java.util.Scanner;

class Debit_air{
    int hitungDebit;
    int Volume;
    int Waktu;

    //rumus Debit = Volume/Waktu
    Debit_air(int Volume, int Waktu){
        hitungDebit = Volume/Waktu;
    }
}
public class p3nomor7_F1B021040 {
    public static void main(String[] args) {
        //deklarasi objek Scanner
        Scanner obj = new Scanner(System.in);

        //input nilai Volume dan Waktu
        System.out.println("Masukkan Volume: ");
        int Volume = obj.nextInt();
        System.out.println("masukkan Waktu: ");
        int Waktu = obj.nextInt();

        // Deklarasi objek
        Debit_air Air = new Debit_air(Volume,Waktu);

        //tampilkan nilai/data
        System.out.println("hasil air berdasarkan rumus Debit_air: " + Air.hitungDebit );
    }
    
}
