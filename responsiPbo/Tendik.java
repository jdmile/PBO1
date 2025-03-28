/*Nama File: Tendik.java
* Deskripsi: Kelas Tendik yang merupakan bagian dari civitas akademika dan mengimplementasikan Penghasilan.
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/

public class Tendik extends Karyawan {
    public Tendik(String nama, String email, String NIP, int pengalaman) {
        super(nama, email, NIP, pengalaman);
    }

    public double hitungGaji() {
        return 4000000 + (pengalaman * 0.01 * 4000000);
    }

    public void tampilkanInfo() {
        System.out.printf("Nama: %s\nEmail: %s\nNIP: %s\nPengalaman: %d tahun\nGaji: %.2f\n",
            nama, email, NIP, pengalaman, hitungGaji());
    }
}