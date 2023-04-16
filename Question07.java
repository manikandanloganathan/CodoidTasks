public class Question07 {

    public static void Method(int a, String b) {
        System.out.println(a + " " + b);

    }

    public static void Method(String a, int b) {
        System.out.println(a + " " + b);
    }

    public static void Method(String a, char c) {

        System.out.println(a + " " + c);
    }

    public static void main(String[] args) {

        Method("hello", 100); // all the methods are same name but different data order so this is method
                              // overloading

        Method("good", 'A');

        Method(18, "bad");
    }
}
