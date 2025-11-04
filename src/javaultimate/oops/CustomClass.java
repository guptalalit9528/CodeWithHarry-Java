package oops;


import java.util.EmptyStackException;

class Employee{
    int id;  //intilize   attributes
    String name;   //intilize  attributes

    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is " +name);
    }

}


public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");


        //instantiating a new Employee object
       Employee lalit = new Employee();

        //set attrinutes
       lalit.id = 386;
       lalit.name = "Lalit Gupta ji";

        //print the attribute
        System.out.println(lalit.id);
        System.out.println(lalit.name);

        //method call
        lalit.printDetails();

    }
}
