interface one {
    void run();

}

interface two {
    void sleep();
}

public class Question29 implements one, two {
    public static void main(String[] args) {

        Question29 obj = new Question29();

        obj.sleep();
        obj.run();

    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void run() {
        System.out.println("running");
    }
}
