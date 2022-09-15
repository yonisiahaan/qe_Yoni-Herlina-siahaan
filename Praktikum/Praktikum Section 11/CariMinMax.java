import java.util.Scanner;

public class CariMinMax {
    public static void main(String[] args) {
        double[] angka = new double[10];

        // Inputan angka
        for (int i = 0; i < 5; i=i+1) {
            System.out.print(" Masukkan Angka ke- " + (i+1) + " = ");
            angka[i] = new Scanner(System.in).nextDouble();}

        // Urutan
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    double n = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = n;}}}

        double nilaibesar = angka[4];
        double nilaikecil = angka[0];

        System.out.println("");
        System.out.println("Bilangan terbesar adalah : " + nilaibesar);
        System.out.println("Bilangan terkecil adalah : " + nilaikecil);
    }
}
