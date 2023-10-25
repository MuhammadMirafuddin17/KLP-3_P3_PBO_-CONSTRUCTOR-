import java.util.Scanner;

class Mobil{
    int hitung_kecepatan;
    int jarak;
    int Waktu;

    //rumus Debit = jarak/Waktu
    Mobil(int jarak, int Waktu){
        hitung_kecepatan = jarak/Waktu;
    }
}
public class p3nomor8_F1B021040 {
    public static void main(String[] args) {
        //deklarasi objek Scanner
        Scanner obj = new Scanner(System.in);

        //input nilai jarak dan Waktu
        System.out.println("Masukkan jarak: ");
        int jarak = obj.nextInt();
        System.out.println("masukkan Waktu: ");
        int Waktu = obj.nextInt();

        // Deklarasi objek
        Mobil mbl = new Mobil(jarak,Waktu);

        //tampilkan nilai/data
        System.out.println("hasil kecepatan mbl berdasarkan rumus kecepatan mbl: " + mbl.hitung_kecepatan);
    }
    
}