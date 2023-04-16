public class Question47 {
    public static void main(String[] args) {
        String name = "good day";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {

            for (int j = i + 1; j < name.length(); j++) {

                char a = name.charAt(i);
                char b = name.charAt(j);
                if (a == b) {
                    System.out.println("the repeated  characters are " + a);
                    count++;
                }

            }
        }
        System.out.println("total count of repeted char " + count);
    }
}
