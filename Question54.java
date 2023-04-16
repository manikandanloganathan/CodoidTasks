interface gym {
    void run();
}

public class Question54 implements gym {
    public static void main(String[] args) {

        Question54 obj = new Question54();
        obj.run();
    }

    @Override
    public void run() {
        System.out.print("walking");
    }
}
