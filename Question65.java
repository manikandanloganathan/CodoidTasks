
import java.util.Scanner;

public class Question65 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number :");
        int number = sc.nextInt(); // getting value from user

        if (number % 2 == 0) {
            System.out.println(number + " IS EVEN NUMBER");
        }

        else if (number % 2 != 0) {
            System.out.println(number + " IS ODD NUMBER");
        }

        sc.close();
    }

}
