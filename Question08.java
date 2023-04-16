public class Question08 {

    public static void Method(int a) {
        System.out.println(a);

    }

    public static void Method(String a, int b) {
        System.out.println(a + " " + b);
    }

    public static void Method(String a, int b, char c) {

        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Method(100); // all the methods are same name but different aruguments so this is method
                     // overloading

        Method("good", 100);

        Method("good", 100, 'a');
    }
}
