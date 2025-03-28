/*Nama File: CivitasAkademika.java
* Deskripsi: Kelas Abstrak yang merepresentasikan civitas akademika
* Tanggal: 28 Maret 2025
* Nama/NIM: Juan Dito Siregar/24060123120037 
*/

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;
    
    public CivitasAkademika(String nama, String email) {
        if (nama == null || email == null) {
            throw new IllegalArgumentException("Nama dan email tidak boleh null");
        }
        this.nama = nama;
        this.email = email;
    }

    public abstract void tampilkanInfo();
}
