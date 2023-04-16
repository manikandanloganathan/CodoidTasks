
//Nested If Else clause in java
//  program for nested if else clause
import java.util.Scanner;

public class Question64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age for voter eligibility : ");
        int age = sc.nextInt(); // getting value form user

        if (age < 18) {
            System.out.println("your age is below 18 you are not eiligiable");
        }

        else {
            if (age >= 18 && age <= 65) {
                System.out.println(" you are  eiligiable for voting");
            } else {
                System.out.println(" your age is bar you are not eiligiable");
            }
        }
        sc.close();
    }

}
