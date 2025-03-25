//File      : Pengusaha.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 21/03/2025


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + Character.getNumericValue(npwp.charAt(12));
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}
