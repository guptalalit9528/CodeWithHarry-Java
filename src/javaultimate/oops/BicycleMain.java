package oops;

class AvonCycle implements Bicycle,Bike, Bicycle.Road {
    @Override
    public void applyBreak() {
        System.out.println("I am a applyBreak " +a);
    }

    @Override
     public void speedUp() {
        System.out.println("I am a sppedUp ");
    }

    void greet(){
        System.out.println("sdbsdfbs");
    }





      //override bhi kr sakte hai khali default method ko
//   public  void deafu(){
//        System.out.println("I am default method 2!");
//    }






public void black(){
    System.out.println("Bicycle ke andar new interface road , black");
}
public void tails(){
    System.out.println("Bicycle ke andar new interface road , tails");
}





    public void race(){
        System.out.println("Second Interface Race");
    }
    public void motor(){
        System.out.println(" Second Interface Start the engine ");
    }
}
