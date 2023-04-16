interface one {

    default void run() { // one different think in interface that one is you dont mention access modifier
                         // default it will be consider a abstract method
        System.out.println("runing");
    }

    static void swim() {
        System.out.println("swiming");
    }
}

public class Question22 {
    public static void main(String[] args) {

    }
}
