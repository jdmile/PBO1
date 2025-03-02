//File      : MataKuliah.java
//Nama      : JUAN DITO SIREGAR
//NIM       : 24060123120037
//Tanggal   : 30/11/2025


class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {}
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }
    public String getIdMatKul() { return idMatKul; }
    public void setIdMatKul(String idMatKul) { this.idMatKul = idMatKul; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getSks() { return sks; }
    public void setSks(int sks) { this.sks = sks; }
}
