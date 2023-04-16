public class Question72 {
    public static void main(String[] args) {

        String Firstname = "john", lastNmae = "berkin";

        Firstname.length(); // finding length of string

        System.out.println("the length of the string is " + Firstname.length());

        String Fullname = Firstname + lastNmae; // concatention

        System.out.println(Fullname);

        Fullname = Fullname.replaceAll("berkin", "zaidne"); // replacing String

        System.out.println(Fullname);

    }
}
