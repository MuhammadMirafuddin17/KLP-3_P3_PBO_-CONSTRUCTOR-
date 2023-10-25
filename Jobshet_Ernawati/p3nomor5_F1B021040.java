class Hp{
   // tipe data 1 String 
    String merek;
    String seri;
    // tipe data 2 integer
    int tahun_keluar;
    int banyak;
    
    // constructor 1
    public Hp(String merek, String seri){
        this.merek = merek;
        this.seri = seri;
    }
    // constructor 2
    public Hp(int tahun_keluar, int banyak){
        this.tahun_keluar = tahun_keluar;
        this.banyak = banyak;
    }
}
public class p3nomor5_F1B021040 {
    // deklarasi objek 1 dan 2
    public static void main(String[] args) {
        Hp barang1 = new Hp ("vivo", "Y");
        Hp barang2 = new Hp (2022, 4);

        System.out.println("merek :" + barang1.merek );
        System.out.println("seri: " + barang1.seri);
        System.out.println("tahun_keluar: " + barang2.tahun_keluar);
        System.out.println("banyak: " + barang2.banyak);
    }
}
