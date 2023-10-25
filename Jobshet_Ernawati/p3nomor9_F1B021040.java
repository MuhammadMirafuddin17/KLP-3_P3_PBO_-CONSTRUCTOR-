import java.util.Scanner;

class energipotensial{
 double energipot;
    double gravitasi;
    double massa;
    double tinggi;

    /* rumus energi potensial. Ep = m × g × h
    m = massa benda
    g = gravitasi
    h = tinggi benda
    */
    energipotensial(double massa, double gravitasi, double tinggi){
        energipot = massa*gravitasi*tinggi;
    }
}
public class p3nomor9_F1B021040{
    public static void main(String[] args) {
        // Deklarasi objek scanner
        Scanner obj = new Scanner(System.in);

        // input nilai jarak dan waktu
        System.out.println("\nMasukan massa benda: ");
        int massa = obj.nextInt();
        System.out.println("Masukan tinggi benda: ");
        int tinggi = obj.nextInt();
        double gravitasi = 9.81;

        // deklarasi objek
        energipotensial ep = new energipotensial(massa, gravitasi, tinggi);

        // tampilkan nilai/data
        System.out.println("Hasil Kecepatan  berdasarkan rumus jarak/waktu: "+ep.energipot);
    }
}
