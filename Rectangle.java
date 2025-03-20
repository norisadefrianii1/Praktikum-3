package praktic.geometry.shapes; // Menentukan package tempat kelas shapes

public class Rectangle {
    private int id; // Atribut untuk ID Rectangle
    private double panjang; // Atribut untuk panjang Rectangle
    private double lebar; // Atribut untuk lebar Rectangle

    // Konstruktor dengan tiga parameter
    public Rectangle(int id, double panjang, double lebar) {
        this.id = id; // Menetapkan ID
        this.panjang = panjang; // Menetapkan panjang
        this.lebar = lebar; // Menetapkan lebar
    }

    // Method Getter untuk mendapatkan nilai ID
    public int getId() {
        return id; // Mengembalikan nilai ID
    }

    // Method Getter untuk mendapatkan nilai panjang
    public double getPanjang() {
        return panjang; // Mengembalikan nilai panjang
    }

    // Method Getter untuk mendapatkan nilai lebar
    public double getLebar() {
        return lebar; // Mengembalikan nilai lebar
    }

    public double getKeliling() {
        return 2 * (panjang + lebar); // Menghitung keliling Rectangle
    }

    public double getLuas() {
        return panjang * lebar; // Menghitung luas Rectangle
    }

    // Method untuk mencetak deskripsi dari Rectangle / Persegi Panjang
    public void printDeskripsi() {
        System.out.println("ID      : " + id);
        System.out.println("Panjang : " + panjang);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas    : " + getLuas());
    }
}
