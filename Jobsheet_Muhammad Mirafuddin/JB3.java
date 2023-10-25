package praktikum_p3;

public class nilai {
    private String mataKuliah;
    private int nilaiMatkul;

    public nilai(String mataKuliah, int nilaiMatkul) {
        this.mataKuliah = mataKuliah;
        this.nilaiMatkul = nilaiMatkul;
    }

    public void displayInfo() {
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Nilai Matkul: " + nilaiMatkul);
    }

    public static void main(String[] args) {
        nilai nilai1 = new nilai("PBO",90);
        nilai nilai2 = new nilai("Basis Data",89);

        System.out.println("Informasi Mahasiswa 1:");
        nilai1.displayInfo();

        System.out.println("\nInformasi Mahasiswa 2:");
        nilai2.displayInfo();
    }
}
