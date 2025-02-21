/* Nama File : Garis.Java */
/* Deskripsi : Main Garis */
/* Nama Pembuat/NIM : Juan Dito Siregar/24060123120037 */
/* Tanggal pembuatan : 19 Februari 2024 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik(3, 5);
        Titik t4 = new Titik(6, 10);

        // Membuat garis
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);

        // Cetak informasi garis
        System.out.println("Garis 1:");
        g1.cetakGaris();
        System.out.println("Panjang Garis 1: " + g1.getPanjang());
        System.out.println("Gradien Garis 1: " + g1.getGradien());
        System.out.println("Titik Tengah Garis 1: (" + g1.getTitikTengah().getAbsis() + ", " + g1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis 1: " + g1.getPersamaanGaris());

        System.out.println("\nGaris 2:");
        g2.cetakGaris();
        System.out.println("Panjang Garis 2: " + g2.getPanjang());
        System.out.println("Gradien Garis 2: " + g2.getGradien());
        System.out.println("Titik Tengah Garis 2: (" + g2.getTitikTengah().getAbsis() + ", " + g2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis 2: " + g2.getPersamaanGaris());

        // Cek apakah sejajar atau tegak lurus
        System.out.println("\nApakah Garis 1 dan Garis 2 sejajar? " + g1.isSejajar(g2));
        System.out.println("Apakah Garis 1 dan Garis 2 tegak lurus? " + g1.isTegakLurus(g2));

        // Menampilkan jumlah objek yang dibuat
        System.out.println("\nJumlah objek Titik yang dibuat: " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}
