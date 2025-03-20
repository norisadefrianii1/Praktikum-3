package praktic.geometry.shapes; // Menentukan package tempat kelas Circle

public class Circle {
    private int id; // Atribut untuk ID lingkaran
    private double radius; // Atribut untuk jari- jari lingkaran
    private final int pembilang = 22; // Nilai pembilang untuk phi (22/7)
    private final int penyebut = 7; // Nilai penyebut untuk phi (22/7)

    // Konstruktor tanpa parameter
    public Circle() {

    }

    // Method Setter untuk ID
    public void setId(int id) {
        this.id = id;
    }

    // Method setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method menghitung keliling lingkaran
    public double getKeliling() {
        return (pembilang / (double) penyebut) * 2 * radius;
    }

    // Method menghitung luas lingkaran
    public double getLuas() {
        return (pembilang / (double) penyebut) * radius * radius;
    }

    // Method untuk mencetak deskripsi dari lingkaran
    public void printDeskripsi() {
        System.out.println("ID      : " + id);
        System.out.println("Radius  : " + radius);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas    : " + getLuas());
    }
}
