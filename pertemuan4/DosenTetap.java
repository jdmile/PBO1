import java.time.LocalDate;

class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.printf("NIP : %s\nNIDN : %s\nNama : %s\nTanggal Lahir : %s\nTMT : %s\nJabatan : Dosen Tetap\nFakultas : %s\nMasa Kerja : %d tahun\nBUP : %s\nGaji Pokok : Rp %,d\nTunjangan : Rp %,d\n", 
                          NIP, NIDN, nama, tanggalLahir.format(formatter), TMT.format(formatter), fakultas, hitungMasaKerja(), hitungBUP().format(formatter), (int) gajiPokok, (int) hitungTunjangan());
    }
}

