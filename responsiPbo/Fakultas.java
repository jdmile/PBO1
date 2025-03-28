/*Nama File: Fakultas.java
* Deskripsi: Kelas Fakultas yang merepresentasikan fakultas dalam universitas
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/
public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
}
