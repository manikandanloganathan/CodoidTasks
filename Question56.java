class googlepay {

    private int balance = 1000;

    public void setter(int a) {
        balance = balance - a;
    }

    public void getter() {
        System.out.println("the remaning balance is" + balance);
    }

}

public class Question56 extends googlepay {
    public static void main(String[] args) {
        int spendmoney = 100;
        Question56 obj = new Question56();

        obj.setter(spendmoney);
        obj.getter();

    }
}
