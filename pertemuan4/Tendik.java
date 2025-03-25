import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.printf("NIP : %s\nNama : %s\nTanggal Lahir : %s\nTMT : %s\nJabatan : Tenaga Kependidikan\nBidang : %s\nMasa Kerja : %d tahun\nBUP : %s\nGaji Pokok : Rp %,d\nTunjangan : Rp %,d\n", 
                          NIP, nama, tanggalLahir.format(formatter), TMT.format(formatter), bidang, hitungMasaKerja(), hitungBUP().format(formatter), (int) gajiPokok, (int) hitungTunjangan());
    }
}
