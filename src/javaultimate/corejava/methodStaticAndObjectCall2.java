package corejava;

import static corejava.methodStaticAndObjectCall.met1;

public class methodStaticAndObjectCall2 {

       //none static method me call kra hai static method
        void met1nonstatic() {

        int m = met1(43, 44);
        System.out.println(m);

        int g = methodStaticAndObjectCall.met1(32,99);
        System.out.println(g);

        methodStaticAndObjectCall mo = new methodStaticAndObjectCall();
        int o = mo.met1(54,6);
        System.out.println(o);

    }



    public static void main(String[] args) {
        int a = 25 ;
        int b = 5;

        System.out.println("-------------------------------Static method ke 3 types call krne ke ------------------------------");
        //Direct call
        int c = met1( a,b);   //Yaha values bhi deee sakte hai parameter me isi ko bolte hai arguments
        System.out.println("This is a Static method but other class me main mehod me : "+c);


       // class name call
        int p = methodStaticAndObjectCall.met1(24,15);
        System.out.println("Second type Static method call in other class : "+p);


        //object refrence call
        methodStaticAndObjectCall ms = new methodStaticAndObjectCall();
        int o = ms.met1(a,b);
        System.out.println("Third type static method call in other class : "+o);

        System.out.println("\n----------------none Static menthod hai lekin isme static method cal use hai use call kese 1 hi trike se kr sakte hai ---------------------------");
        //call none static method
        methodStaticAndObjectCall2 mo2 = new methodStaticAndObjectCall2();
        System.out.println("This is a none static method : ");
        mo2.met1nonstatic();

        System.out.println("\n-------------------------------------none static method ko call sirf 1 trike se kr sakte hai---------------------------------");
        //Object refrence call hai but none static method hai oe alag class me
        methodStaticAndObjectCall msc  = new methodStaticAndObjectCall();
        int j = msc.met2(9,56);   //yaha hum a or b bhi de sakte hai
        System.out.println("None Static method other class : "+j);
    }
}
