import java.util.Scanner;

public class Question66 { // multiplication program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");

        int number = sc.nextInt();

        int intial = 0;

        while (intial <= 12) {

            System.out.println(number + " * " + intial + " = " + intial * number);

            intial++;
        }

        sc.close();
    }

}
