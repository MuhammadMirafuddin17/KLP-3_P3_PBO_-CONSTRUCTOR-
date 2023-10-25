public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad Mirafuddin", "F1B021136");

        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.displayInfo();
    }
}
