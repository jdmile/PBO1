//File      : PNS.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 21/03/2025


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + Character.getNumericValue(nip.charAt(13));
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}