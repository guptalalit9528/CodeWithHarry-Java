package oops;

public class ThisKeywordUse2 {
    private int a;
    private String name;

    public int getA() {
        return a;
    }

    // 4 constractor chaining
    ThisKeywordUse2() {
        this(3, "Gupta ji");
    }

    // 1 using this to refer instance variables
    ThisKeywordUse2(int a, String name) {
        this.a = a;
        this.name = name;
    }

    //2 using this to refer current object
    void display() {
        System.out.println(this.a + " " + this.name);
    }

    // 3  Returning current object
    ThisKeywordUse2 getStudent() {
        return this;
    }

    public int returnone() {
        return 1;
    }

}





     //use super keyword
    class Person{
    String name = "Parent Lalit";

    Person(){
        System.out.println("Display from Parent class constractor");
    }

    void display(){
        System.out.println("Display from Parent class method");
    }
}

     class Student extends Person {

         String name = "Child Lalit";


         void showNames() {
             System.out.println("Child name " + name);
             System.out.println("Parent name " + super.name);
         }

         Student() {
             super();   //parent class constractor call
             System.out.println("Display from Child class constractor");
         }

         void display() {
             super.display();
             System.out.println("Display from Child class method");
         }
     }


