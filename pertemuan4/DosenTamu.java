import java.time.LocalDate;


class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate kontrakBerakhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.printf("NIP : %s\nNIDK : %s\nNama : %s\nTanggal Lahir : %s\nTMT : %s\nJabatan : Dosen Tamu\nFakultas : %s\nMasa Kerja : %d tahun\nKontrak Berakhir : %s\nGaji Pokok : Rp %,d\nTunjangan : Rp %,d\n", 
                          NIP, NIDK, nama, tanggalLahir.format(formatter), TMT.format(formatter), fakultas, hitungMasaKerja(), kontrakBerakhir.format(formatter), (int) gajiPokok, (int) hitungTunjangan());
    }
}