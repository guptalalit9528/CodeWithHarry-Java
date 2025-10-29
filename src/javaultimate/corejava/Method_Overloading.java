package corejava;

public class Method_Overloading {

    static void foo(){
        System.out.println("Good Morning bro !...");
    }
    static void foo(int a){
        System.out.println("Good Morning" + a + " bro!...");
    }
    static void foo(int a , int b){
        System.out.println("Total rupya tumahra : "+(a+b));
    }

    //error occur bucause phle se hii bna pda hai is naam ka method
   // or perameters bhi same to ye error dega bolega ki already define
//    static int foo(int a,int b){
//        System.out.println();
//        return 0;
//    }

    public static void main(String[] args) {

        foo();
        foo(500);
        foo(200,3);
    }
}
