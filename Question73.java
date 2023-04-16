public class Question73 {

    static int a, b; // gobal variable

    static String d, e;

    Question73(int num1, int num2) { // constructor diff aruguments
        a = num1;
        b = num2;
    }

    Question73(String str1, String str2) {
        d = str1;
        e = str2;
    }

    public static void main(String[] args) {

        Question73 obj = new Question73(5, 5); // constructor is used to intialized the local variable value to
                                               // assigning global variable

        Question73 obj1 = new Question73("hello", "world");

        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e); /// printing local variables values

    }

}
