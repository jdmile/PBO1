//File      : MMahasiwa.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 30/11/2025


public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("D001", "Dr. Rahmat", "Informatika");
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 4);
        Kendaraan kendaraan1 = new Kendaraan("AB 1234 CD", "Motor");
        
        Mahasiswa mhs1 = new Mahasiswa("24060123120037", "Juan Dito Siregar", "Informatika");
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);
        
        mhs1.printDetailMhs();
    }
}
