public class Question03 {
    public static void main(String[] args) {

        String name = "banana";

        for (int i = 0; i < name.length(); i++) {

            for (int j = i + 1; j < name.length(); j++) {

                char a = name.charAt(i);
                char b = name.charAt(j);
                if (a == b) {
                    System.out.println("the duplicate character are " + a);
                }

            }
        }
    }
}
