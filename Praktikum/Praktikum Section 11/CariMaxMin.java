import java.util.Scanner;

public class CariMaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka : ");
        int jumlah = input.nextInt();

        int arr[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        int max = 0;
        int min = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        System.out.println("Nilai max yaitu " + arr[max] + ", pada posisi index " + max);
        System.out.println("Nilai min yaitu " + arr[min] + ", pada posisi index " + min);

    }

}