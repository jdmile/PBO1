/* Nama File : Titik.Java */
/* Deskripsi : atribut dan method class Titik */
/* Nama Pembuat/NIM : Juan Dito Siregar/24060123120037 */
/* Tanggal pembuatan : 19 Februari 2024 */


public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // Konstruktor default
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Getter untuk absis
    public double getAbsis() {
        return absis;
    }

    // Setter untuk absis
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Getter untuk ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Setter untuk ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Getter untuk counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Method untuk mencetak koordinat titik
    public void cetakTitik() {
        System.out.println("Titik: (" + absis + ", " + ordinat + ")");
    }
}
