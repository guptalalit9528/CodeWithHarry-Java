package oops;

public class PhoneDynamicMethodDispatchMain {
    public static void main(String[] args) {
        System.out.println("-----------------object Parent class------------------");
        PhoneDynamicMethodDispatch pdmd1 = new PhoneDynamicMethodDispatch();
        pdmd1.greet();
        pdmd1.on();
        System.out.println("-------------------object child class-------------------");
        Smartphone sp = new Smartphone();
        sp.greet();
        sp.swagat();
        sp.on();
        System.out.println("--------------------object child class but refrence variable Parent class-----------------");
        PhoneDynamicMethodDispatch pdmd = new Smartphone();
        pdmd.greet();
        pdmd.on();
    }
}
