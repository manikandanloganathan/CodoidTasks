
// method overiding in java 
// both class  have  same methodname & same parameter that is a overiding method 
// how its work ? first that class checking a method class itself suppose that method not presenting in  current class it will be check parent class 
class one {

    public void method() {

        System.out.println("method from class one");
    }

}

class two extends one {

    public void method() {

        System.out.println("method  from class two");
    }

}

public class Question05 extends two {
    public static void main(String[] args) {

        two obj = new two();
        obj.method(); // calling overiding method suppose this method not presenting in class two it
                      // will call a parent class one method

        // if want access class one overiding method;
        // create object for that class one
        //
        one obj1 = new one();

        obj1.method();

    }

}
