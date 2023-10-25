//buat class
class Roti{
    private String nama;
    private int jumlah;

    //buat constructor Roti
    Roti(){
        this.nama = nama;
        this.jumlah = jumlah;
    }
    

    //geter nama
    public String getnama(){
        return nama;
    }

    //setter nama
    public void setnama(String nama){
        this.nama = nama;
    }

    //getterjumlah
    public int getjumlah(){
        return jumlah;
    }

    //setterjumlah
    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
}
 
//class utama
public class p3nomor4_F1B021040 {
   
    //main function -> wajib ada
    public static void main(String[] args) {
      //deklarasi objek Roti1 
      Roti Roti1 = new Roti ();
      Roti1.setnama("sariroti");
      Roti1.setjumlah(5);

    System.out.println("jenis Roti: " + Roti1.getnama ());
    System.out.println("jumlah Roti: " + Roti1.getjumlah());
   } 
}
