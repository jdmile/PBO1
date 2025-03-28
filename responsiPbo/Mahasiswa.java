/*Nama File: Mahasiswa.java
* Deskripsi: Kelas Mahasiwa yang merepresentasikan mahasiswa dalam universitas
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/

public class Mahasiswa extends CivitasAkademika {
    private static int counter = 0;
    private String NIM;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        assert semester > 0 : "Semester harus lebih dari 0";
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public double hitungUKT() {
        double ukt = fakultas.getTarifUKT();
        for (int i = 1; i < semester; i++) {
            ukt *= 0.95; // mengurangi 5% dari semester sebelumnya
        }
        return ukt;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Biaya UKT: " + hitungUKT());
    }

    public static int getCounter() {
        return counter;
    }
}

