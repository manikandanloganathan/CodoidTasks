abstract class action {

    abstract void eat(); /// both abstract and concreate methods are support in abstract calss

    public void sleeping() {
        System.out.println("sleeping");
    }

}

public class Question59 extends action {
    public static void main(String[] args) {

        Question59 obj = new Question59();
        // why i am obj creating for that calss because you can acces a nonstatic
        // members u must be create obj
        obj.sleeping();
        obj.eat();

    }

    @Override
    void eat() {
        System.out.println("eating");
    }

}
