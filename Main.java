package praktic.geometry.mains; // Package tempat kelas main berada

import java.util.Scanner; // Mengimpor scanner untuk input dari user
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;

// Deklarasi kelas utama
public class Main {
    // Pewarna untuk teks
    public static String Default = "\u001B[0m"; // Warna Putih untuk isi teks
    public static String Blue = "\u001B[34m"; // Warna Biru untuk judul
    public static String Purple = "\u001B[35m"; // Warna Ungu untuk garis pemisah

    // Method untuk mencetak garis pemisah
    public static void printGaris() {
        /**
         * Mencetak garis pemisah dengan wwarna ungu dan mengembalikan warna menjadi
         * default
         * agar warna setelahnya tidak terganti / berubah menjadi ungu.
         **/
        System.out.println(Purple + "============================================" + Default);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Menampilkan Nama dan NIM
        printGaris(); // Memanggil method untuk mencetak garis pemisah
        System.out.println("Nama    : Norisa Defriani");
        System.out.println("NIM     : 245150707111038");

        // Input untuk Circle
        printGaris(); // Mencetak garis pemisah
        System.out.println(Blue + "Circle" + Default); // Menampilkan judul Circle dengan warna biru
        printGaris();
        Circle circle = inputCircle(scan); // Memanggil method untuk mengambil input dari user

        // Output untuk Circle
        printGaris();
        circle.printDeskripsi(); // Memanggil method printDeskripsi() dari objek circle untuk menampilkan hasil
                                 // perhitungan
        printGaris();

        // Input untuk Rectangle
        System.out.println(Blue + "Rectangle" + Default); // Menampilkan judul Rectangle
        printGaris();
        Rectangle rectangle = inputRectangle(scan); // Memanggil method untuk mengambil input dari useer

        // Output untuk Rectangle
        printGaris();
        rectangle.printDeskripsi(); // Memanggil method printDeskripsi() dari objek rectangle untuk menampilkan
                                    // hasil perhitungan
        printGaris();

        scan.close(); // Menutup objek scanner
    }

    // Method untuk mengambil nilai input dari user dan membuat objek Circle
    public static Circle inputCircle(Scanner scan) {
        System.out.print("Masukkan ID        : "); // Meminta user untuk memasukkan ID
        int id = scan.nextInt(); // Membaca ID dari inputan user
        System.out.print("Masukkan Radius    : "); // Meminta user untuk memasukkan nilai radius
        double radius = scan.nextDouble(); // Membaca radius dari inputan user
        Circle circle = new Circle(); // Membuat objek circle
        circle.setId(id); // Mengeset ID ke objek circle
        circle.setRadius(radius); // Mengeset radius ke objek circle
        return circle; // Mengembalikan objek circle
    }

    // Method untuk mengambil input dan membuat objek Rectangle
    public static Rectangle inputRectangle(Scanner scan) {
        System.out.print("Masukkan ID        : "); // Meminta user memasukkan ID
        int id = scan.nextInt(); // Membaca ID dari inputan user
        System.out.print("Masukkan Panjang   : "); // Meminta user memasukkan nilai panjang rectangle
        double panjang = scan.nextDouble(); // Membaca nilai panjang dari inputan user
        System.out.print("Masukkan Lebar     : "); // Meminta user memasukkan nilai lebar rectangle
        double lebar = scan.nextDouble(); // Membaca nilai lebar dari inputan user
        return new Rectangle(id, panjang, lebar); // Mengembalikan objek Rectangle yang sudah dibuat dengan parameter
    }
}
