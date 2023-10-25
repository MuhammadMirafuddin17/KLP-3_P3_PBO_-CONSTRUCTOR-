class Scincare{
    String produk;
    int harga;

    public Scincare(String produk, int harga){
        this.produk = produk;
        this.harga = harga;
    }
}
public class p3nomor2_F1B021040 {
  public static void main(String[] args) {
    Scincare mahasiswa = new Scincare( "hanasui", 21);
    
    System.out.println("produk:" + mahasiswa.produk);
    System.out.println("harga:" + mahasiswa.harga );
  }  
}
