package oops;

 public class OverrideMethod {
    public int a ;

    public void method1(){
        System.out.println("I am method 2 of class OverrideMethod");
    }
    public void method2(){
        System.out.println("I am method 2 of class OverrrideMethod  ");
    }
}

class Overridem extends OverrideMethod{

     @Override
    public void method2(){
        // super.method2();  //jab hume parent class ka same method phle class karna hai or fir uske baad child class ka
        System.out.println("I am method 1 of class Override");
    }
    public void method3() {
        System.out.println("I am method 2 of class Override");
    }
}
