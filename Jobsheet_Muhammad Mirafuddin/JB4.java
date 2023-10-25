package praktikum_p3;

public class mobil {
    private String merk;
    private String model;
    private int tahun;
    private double harga;

    public mobil() {
        merk = "Tidak Diketahui";
        model = "Tidak Diketahui";
        tahun = 0;
        harga = 0.0;
    }

    public mobil(String merk, String model) {
        this.merk = merk;
        this.model = model;
        tahun = 0;
        harga = 0.0;
    }

    public mobil(String merk, String model, int tahun, double harga) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: $" + harga);
    }

    public static void main(String[] args) {
        mobil mobil1 = new mobil();
        mobil mobil2 = new mobil("Toyota", "Camry");
        mobil mobil3 = new mobil("Honda", "Civic", 2022, 25000.0);

        System.out.println("Informasi Mobil 1:");
        mobil1.displayInfo();

        System.out.println("\nInformasi Mobil 2:");
        mobil2.displayInfo();

        System.out.println("\nInformasi Mobil 3:");
        mobil3.displayInfo();
    }
}
