public class Question38 {

    Question38(int a, int b) {
        System.out.println(a + " " + b);
    }

    Question38(String a, String b) {
        System.out.println(a + "" + b);
    }

    public static void main(String[] args) {

        Question38 obj = new Question38(20, 10);

        Question38 obj1 = new Question38("hello", "world");

    }

}
