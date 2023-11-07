class BengkelMotor{
    String NamaBengkel;
    String Pemilik;
    String Alamat;
    int TahunBerdiri;

    //dengan parameter
    public BengkelMotor(String NamaBengkel, String Pemilik, String Alamat, int TahunBerdiri){
        this.NamaBengkel = NamaBengkel;
        this.Pemilik = Pemilik;
        this.Alamat = Alamat;
        this.TahunBerdiri = TahunBerdiri;
    }

    //tanpa Parameter
    public BengkelMotor(){
        NamaBengkel = "JayaBengkel";
        Pemilik = "Jaya Putra";
        Alamat = "Jln. Salahudin No.11 Depan Kantor Pos";
        TahunBerdiri = 2023;
    }

    public void infoBengkel(){
        System.out.println("Nama Bengkel : " + NamaBengkel);
        System.out.println("Nama Pemilik : " + Pemilik);
        System.out.println("Alamat Bengkel : " + Alamat);
        System.out.println("Tahun Berdiri : " + TahunBerdiri);

    }
}

public class tugasresponp3 {
    public static void main (String [] args) {
        BengkelMotor bklmotor1 = new BengkelMotor("SaputraBengkel", "Saputra", "Jln. Majapahit no.32", 2020);
        BengkelMotor bklmotor2 = new BengkelMotor();

        System.out.println("Info Bengkel Motor 1: ");
        bklmotor1.infoBengkel();

        System.out.println("Info Bengkel Motor 2: ");
        bklmotor2.infoBengkel();
    }
    
}
