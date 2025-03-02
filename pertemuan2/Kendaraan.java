//File      : Kendaraan.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 30/11/2025


class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {}
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    public String getNoPlat() { return noPlat; }
    public void setNoPlat(String noPlat) { this.noPlat = noPlat; }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
}