interface check {
    void add(int a);

    void add(String name, int b);
}

public class Question31 implements check {
    public static void main(String[] args) {

        Question31 obj = new Question31();
        obj.add(10);
        obj.add("hello", 20);
    }

    @Override
    public void add(int a) {
        System.out.println(a);
    }

    @Override
    public void add(String name, int b) {
        System.out.println(name + " " + b);
    }
}
