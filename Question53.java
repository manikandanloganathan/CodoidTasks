import java.util.Scanner;

public class Question53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string :");

        String str = sc.nextLine();
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        if (str.equals(str2)) {
            System.out.println("its a parlindrome String");

        } else {
            System.out.println("its not a parlindrome String");
        }
    }
}
