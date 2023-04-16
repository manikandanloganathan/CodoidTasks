class one extends Thread {

    public void run() {

        System.out.println("Thread " + getName() + " is running");
    }

}

public class Question10 {
    public static void main(String[] args) {

        one thread1 = new one();

        thread1.setName("hello");
        thread1.start();

    }
}
