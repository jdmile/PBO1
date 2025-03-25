//File      : Petani.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 21/03/2025

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        int tambahan = (asal_kota.length() > 11) ? Character.getNumericValue(asal_kota.charAt(11)) : 0;
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + tambahan;
    }
    

    @Override
    public double hitungPajak() {
        return 0;
    }
}
