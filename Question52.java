public class Question52 {
    public static void main(String[] args) {
        int a[] = { 255, 458, 7, 2, 5, 8 };

        int b[] = { 265, 7, 35, 25, 2, 18 };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.println(" the common elements are " + a[i]);
                }
            }
        }

    }
}
