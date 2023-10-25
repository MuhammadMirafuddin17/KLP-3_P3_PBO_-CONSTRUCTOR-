import java.util.Scanner;
class Tablet{
   // tipe data 1 String 
    String merek;
    String seri;
    // tipe data 2 integer
    int tahun_keluar;
    int banyak;
    
    // constructor 1
    Tablet(String merek){
        this.merek = merek;
        
    }
    // constructor 2
    Tablet(){
        this.seri = seri;
        this.tahun_keluar = tahun_keluar;
        this.banyak = banyak;
    }
}
public class p3nomor6_F1B021040 {
    // deklarasi objek 1 dan 2
    public static void main(String[] args) {
        Tablet barang1 = new Tablet ("vivo");
        Tablet barang2 = new Tablet ();

        // deklarasi scanner untuk membaca inputan dinamis
        Scanner obj = new Scanner(System.in);
        
        // bagian untuk input data dynamis
        System.out.println("masukkan seri Tabel: " ); 
        barang2.seri = obj.nextLine();
        System.out.println("masukan tahun_keluar: "); 
        barang2.tahun_keluar = obj.nextInt();
        System.out.println(" masukan banyak barang: ");
        barang2.banyak= obj.nextInt();
        
        // bagian untuk menampilkan data
        System.out.println("merek :" + barang1.merek );
        System.out.println("seri: " + barang2.seri);
        System.out.println("tahun_keluar: " + barang2.tahun_keluar);
        System.out.println("banyak: " + barang2.banyak);
    
    }
}


