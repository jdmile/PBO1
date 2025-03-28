/*Nama File: Main.java
* Deskripsi: Kelas utama untuk menajalankan program
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/

public class Main {
    public static void main(String[] args) {
        Fakultas teknik = new Fakultas("Teknik", 5000000, 7000000);
        Mahasiswa mhs1 = new Mahasiswa("Ucok Kele", "ucokkele48@email.com", "26045312234", 3, teknik);
        Dosen dosen1 = new Dosen("Dr. Siti Ropeah", "sitiropeah@email.com", "1980123456", 10, teknik);
        Tendik tendik1 = new Tendik("Pak Joko Mulyono", "mulmul994@email.com", "2001123456", 15);
        
        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkanInfo();
        System.out.println();
        
        System.out.println("=== Data Dosen ===");
        dosen1.tampilkanInfo();
        System.out.println();
        
        System.out.println("=== Data Tendik ===");
        tendik1.tampilkanInfo();
    }
}