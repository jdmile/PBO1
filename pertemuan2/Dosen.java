//File      : Dosen.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 14/03/2025

class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {}
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }
}
