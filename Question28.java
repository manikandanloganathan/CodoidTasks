import java.util.Scanner;

public class Question28 {
    public static int fac(int num) { // method for find a factorial

        if (num == 1) {
            return 1;
        } else {

            int a = num;

            int b = a * fac(a - 1);

            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a number : ");

        int number = sc.nextInt(); // getting value from user

        System.out.println("the value of " + number + " factorial is " + fac(number)); // calling factorial method

        sc.close(); // closing scanner
    }
}
