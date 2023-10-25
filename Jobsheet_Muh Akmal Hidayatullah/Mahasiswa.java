package praktikum_p3;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
        nama = "Muh Akmal Hidayatullah";
        nim = "F1B021132";
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        System.out.println("Informasi Mahasiswa :");
        mahasiswa1.displayInfo();
    }
}
