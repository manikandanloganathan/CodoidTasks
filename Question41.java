public class Question41 {
    public static void main(String[] args) {
        int a = 20, b = 50;

        System.out.println("before swaping" + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swaping" + a + " " + b);
    }
}
