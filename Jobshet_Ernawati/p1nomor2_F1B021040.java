class Pemain {
    String nama;
    int no_punggung;
    String negara;
    int usia;
    double tinggi;
    String posisi;

    public void hasil() {
        System.out.println("Nama Pemain Bola ini adalah " + nama);
        System.out.println("No Punggung pemain ini adalah " + no_punggung);
        System.out.println("Negara asal Pemain Bola ini adalah " + negara);
        System.out.println("Usia pemain ini adalah " + usia + " tahun");
        System.out.println("Tinggi pemain ini adalah " + tinggi + " cm");
        System.out.println("Posisi pemain ini adalah " + posisi);
    }
}

public class p1nomor2_F1B021040 {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain();
        pemain1.nama = "Lionel Messi";
        pemain1.no_punggung = 10;
        pemain1.negara = "Argentina";
        pemain1.usia = 34;
        pemain1.tinggi = 170;
        pemain1.posisi = "Penyerang";
        pemain1.hasil();

        Pemain pemain2 = new Pemain();
        pemain2.nama = "Cristiano Ronaldo";
        pemain2.no_punggung = 7;
        pemain2.negara = "Portugal";
        pemain2.usia = 36;
        pemain2.tinggi = 187;
        pemain2.posisi = "Penyerang";
        pemain2.hasil();
    }
}