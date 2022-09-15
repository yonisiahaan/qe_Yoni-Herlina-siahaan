import java.text.DecimalFormat;
import java.util.Scanner;
public class CariNilaiMaxMin {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in );

        int number = 0;
        double total = 0;
        int minimum;
        int maximum = 0;

        System.out.print("Input Number 1 : ");

        number = scan.nextInt();
        minimum=number;
        total += number;

        for(int i = 2; i<=5; i++){

            if(number<0 || number >100){
                System.out.println("valid number: ");
                number = scan.nextInt();
                i--;
            }
            else{
                System.out.print("Input Number " + i + ":");
                number = scan.nextInt();
                total += number;

                if(number<minimum)
                    minimum = number;
                if(number>maximum)
                    maximum = number;
            }
        }

        DecimalFormat oneDecimalPlace = new DecimalFormat("##.#");
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);

    }
}