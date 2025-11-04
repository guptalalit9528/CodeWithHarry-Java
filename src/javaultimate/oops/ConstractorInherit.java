package oops;


import java.sql.Driver;

class Base1{
    private int x ;

    Base1(){
        System.out.println("This is a Base1 constractor");
    }
    Base1(int x){

        System.out.println("This is a overload Base1 constractor :" +x);
    }
}

class Derived1 extends Base1{
    private int y ;

    Derived1(){
        //super(12);
        System.out.println("This is a Derived1 Constractor");
    }
    Derived1(int y){
        //super(23);
        System.out.println("This is a overload Derived1 Constractor : " +y);
    }


}


public class ConstractorInherit {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1( );

    }
}
