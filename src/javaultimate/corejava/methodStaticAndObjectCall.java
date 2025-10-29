package corejava;

public class methodStaticAndObjectCall {

    //Static method sirf sirf static me hi call hoo
    // sakta hai jo ki aap dekh sakte hai main method me
    // or khai bhi call kar skate hai alag sirf static method hona chaiye
     static int met1(int x , int y){
        int z = 0;
        if(x > y){
            z = x + y;
        }
        else{
            z = x - y;
        }
        return z;
    }

    //none static method me static method call kra hai bas
    void met1nonstatic() {

        int m = met1(43, 44);
        System.out.println(m);

        int g = methodStaticAndObjectCall.met1(32,99);
        System.out.println(g);

        methodStaticAndObjectCall mo = new methodStaticAndObjectCall();
        int o = mo.met1(54,6);
        System.out.println(o);
    }



    //none static method
     int met2(int x , int y){
        int z = 0;
        if(x > y){
            z = x + y;
        }
        else{
            z = x - y;
        }
        return z;
    }






    public static void main(String[] args) {
        int a = 10 ;
        int b = 5;


        //Direct Call
        System.out.println("-------------------------------Static method ke 3 types call krne ke ------------------------------");
        int c = met1( a,b);   //Yaha values bhi deee sakte hai parameter me isi ko bolte hai arguments
        System.out.println("This is a Static method But same class me main method me : "+c);


        //Object refrence call
        methodStaticAndObjectCall mo  = new methodStaticAndObjectCall();
        int d = mo.met1(24,56);   //yaha hum a or b bhi de sakte hai
        System.out.println("Second type ststic ka same class me call krne ka : "+d);


        //class name call
       int s =  methodStaticAndObjectCall.met1(a,b);
        System.out.println("Third type static ka same class ke andar call krne ka : "+s);

        System.out.println("\n----------------none Static menthod hai lekin isme static method cal use hai use call kese 1 hi trike se kr sakte hai ---------------------------");
        //none static me static ko call kra or fir print kra diya
        methodStaticAndObjectCall sample = new methodStaticAndObjectCall();
        System.out.println("This is a None Static method : ");
        sample.met1nonstatic();


        System.out.println("\n-------------------------------------none static method ko call sirf 1 trike se kr sakte hai---------------------------------");
        //Object refrence call hai but none static method hai but same class me
        methodStaticAndObjectCall mo2  = new methodStaticAndObjectCall();
        int j = mo2.met2(99,56);   //yaha hum a or b bhi de sakte hai
        System.out.println("None Static method : "+j);
    }
}
