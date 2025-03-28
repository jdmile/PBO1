/*Nama File: Dosen.java
* Deskripsi: Kelas Dosen yang merepresentasikan dosen dalam universitas
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/

public class Dosen extends Karyawan {
    private Fakultas fakultas;

    public Dosen(String nama, String email, String NIP, int pengalaman, Fakultas fakultas) {
        super(nama, email, NIP, pengalaman);
        this.fakultas = fakultas;
    }

    public double hitungGaji() {
        return fakultas.getGajiPokok() + (pengalaman * 0.01 * fakultas.getGajiPokok());
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void tampilkanInfo() {
        System.out.printf("Nama: %s\nEmail: %s\nNIP: %s\nPengalaman: %d tahun\nFakultas: %s\nGaji: %.2f\n",
            nama, email, NIP, pengalaman, fakultas.getNama(), hitungGaji());
    }
}
