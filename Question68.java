
public class Question68 {
    public static void main(String[] args) {

        int a[][] = { { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } }; // decalring multi dimension array

        int b[][] = { { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        int c[][] = new int[3][3]; // another way of decalring multi dimension array

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                int value = 0;
                value = a[i][j] + b[i][j]; // adding two matrix
                c[i][j] = value;
            }

        }

        for (int i = 0; i < 3; i++) { // this loop is printing after adding two matrix

            for (int j = 0; j < 3; j++) {

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}