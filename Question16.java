import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) {
        int a[] = { 88, 25, 54, 2, 1, 77 };

        System.out.print("before sorting a array " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("after sorting a array " + Arrays.toString(a));

        /*
         * System.out.print("before sorting a array " + Arrays.toString(a)); // this
         * another way sorting method
         * 
         * Arrays.sort(a); // sorting array
         * 
         * System.out.println("after sorting a Array" + Arrays.toString(a));
         */
    }
}
