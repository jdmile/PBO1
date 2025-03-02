class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {}
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    public void setDosenWali(Dosen dosen) { this.dosenWali = dosen; }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }
    public void addMatKul(MataKuliah matKul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul++] = matKul;
        }
    }
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }
    public int getJumlahMatKul() { return jumlahMatKul; }
    public void printDetailMhs() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Tidak Ada"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")" : "Tidak Ada"));
        System.out.println("Mata Kuliah yang diambil:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }
        System.out.println("Total SKS: " + getJumlahSKS());
    }
}