package oops;

public class AbstractDemoMain {
    public static void main(String[] args) {
//        Parent3 p3 = new Parent3(); //it is not allowed
//        Child4 c4 = new Child4(); //it is not allowed bucause abstract class ka hum object nahi bna sakte

        Child3 c3 = new Child3();
        System.out.println("------------------I am a Child3 object--------------");
        c3.greet();
        c3.sayHello();

        System.out.println();

        Child5 c5 = new Child5();
        System.out.println("-----------------I am a Child5 object-----------------");
        c5.weeping();
        c5.greet();
        c5.check();
        c5.eat();

    }
}
