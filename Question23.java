import java.util.StringJoiner;

public class Question23 {
    public static void main(String[] args) {

        StringJoiner obj = new StringJoiner("|");

        obj.add("mango");
        obj.add("apple");
        obj.add("banana");

        System.out.println(obj.toString());
    }
}
