public class Question02 {
    public static void main(String[] args) {

        String name = "dhoni";

        String Reversename = "";

        System.out.println("befor reverse a String " + name);

        int len = name.length(); // find a length odf the string

        for (int i = len - 1; i >= 0; i--) {

            char a = name.charAt(i); // getting a char one by one using charAtstring method

            Reversename = Reversename + a;

        }

        System.out.println("after reverse a String " + Reversename);

    }
}
