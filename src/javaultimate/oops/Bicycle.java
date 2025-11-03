package oops;

public interface Bicycle {
    abstract void applyBreak();
    void speedUp(); //agar hum abstract naa bhi likhe too bhi ise abstract method hii mana jayega

   // public static final int a = 3;
    int a = 23; //dono variable same  hai public static final automatically le leta hai ye


    //jab default me jada code use hoo jaye to tab hum use krte hai default
    //or fir is private method ko call kar sakte hai iske naam se
    private void greeti(){
        System.out.println("Good morning private method");
    }


    default void deafu(){//jab default ke andar jada code hoo jata hai to tab aata hai private method isliye private method use kiya jata hi
        greeti(); //private method call
        System.out.println("I am a default method 1!");
    }



    static void  stack(){
        System.out.println(" i am a static method");
    }


    interface Road{
        void black();
        void tails();
    }
}


interface Bike{
    void race();
    void motor();
}
