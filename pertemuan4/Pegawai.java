import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

abstract class Pegawai {
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;
    protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears();
    }

    public abstract void printInfo();
}