//File      : Manusia.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 21/03/2025


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    public abstract int hitungMasaKerja();
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
