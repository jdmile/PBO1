/*Nama File: Karyawan.java
* Deskripsi: Kelas Karyawan yang merepresentasikan pegawai universitas
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/

public abstract class Karyawan extends CivitasAkademika implements Penghasilan {
    protected String NIP;
    protected int pengalaman;
    
    public Karyawan(String nama, String email, String NIP, int pengalaman) {
        super(nama, email);
        this.NIP = NIP;
        this.pengalaman = pengalaman;
    }
}
