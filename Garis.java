/* Nama File : Garis.Java */
/* Deskripsi : atribut dan method class Garis */
/* Nama Pembuat/NIM : Juan Dito Siregar/24060123120037 */
/* Tanggal pembuatan : 19 Februari 2024 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor default
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Getter Titik Awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Setter Titik Awal
    public void setTitikAwal(Titik awal) {
        this.titikAwal = awal;
    }

    // Getter Titik Akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Setter Titik Akhir
    public void setTitikAkhir(Titik akhir) {
        this.titikAkhir = akhir;
    }

    // Getter counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Menghitung gradien garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal).");
        }
        return dy / dx;
    }

    // Mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // Mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Mengecek apakah dua garis tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Mencetak koordinat titik awal dan titik akhir
    public void cetakGaris() {
        System.out.println("Garis dari (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + 
                           ") ke (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Mendapatkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
