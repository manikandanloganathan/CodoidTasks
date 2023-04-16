class negativevalue extends Exception { // creating Exception message

    public String toString() {

        return "negative";

    }

}

public class Question01 {

    public static void fun(int a) throws negativevalue {

        if (a < 0) {
            throw new negativevalue(); // throw custom exception
        } else {

        }
    }

    public static void main(String[] args) {

        int number = -1;

        try { // handling exception using try catch

            fun(number);

        } catch (Exception e) {

            e.printStackTrace();

        }

        System.out.println("running");
    }
}
