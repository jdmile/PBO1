//File      : Asersi1.java
//Nama      : Juan Dito Siregar
//NIM       : 24060123120037
//Tanggal   : 07/03/2025

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0 ;
        if ( x>0 ){
            System.err.println("\nX Bilangan Positif\n");
        }else{
            assert ( x<0 ):"ada kesalahan kode";
            System.err.println("\nX Bilangan Negatif\n");
        }
    }
}