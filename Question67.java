import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" enter a number :");

        int number = sc.nextInt();
        int sum = 0;
        int temp = number;

        while (0 < number) {

            int rem = number % 10;

            sum = (rem * rem * rem) + sum;

            number = number / 10; // divide a number it coming decimal value but int data type does not support
                                  // decimal in consider before a point
        }

        if (sum == temp) {
            System.out.println("its a AMSTRONG NUMBER");
        } else {
            System.out.println("NON  AMSTRONG NUMBER");
        }

        sc.close();
    }
}
