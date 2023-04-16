import java.util.Arrays;

public class Question33 {
    public static void main(String[] args) {

        int a[] = new int[10];

        int b[] = new int[20];

        int c[] = mergearray(a, b);

        System.out.print(Arrays.toString(mergearray(a, b)));

    }

    public static int[] mergearray(int a[], int b[]) {

        int length = a.length + b.length;

        int[] c = new int[length];

        for (int i = 0; i < a.length; i++) {
            a[i] = c[i];

        }
        for (int j = 0; j < b.length; j++) {
            b[j] = c[j + a.length];
        }
        return c;

    }

}
