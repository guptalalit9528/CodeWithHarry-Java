package oops;

public class BycycleMain {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();

        System.out.println("-------------------new interface --------------------------");
        ac.applyBreak();
        ac.speedUp();
        ac.greet();
       // ac.greeti(); //thow error kyuki private method ko hum ese call nahi kr sakte isliye default me diya jata hai tab bo defaulr method call hota hai  tabhi private hota hai
        ac.deafu();
        Bicycle.stack();

        System.out.println("-----------------interface ke andar dusra interface road-----------------");
       ac.black();
       ac.tails();

        System.out.println("------------------new interface Bike----------");
        ac.race();
        ac.motor();
        System.out.println("----------------variable-------------------");
        System.out.println(AvonCycle.a);
    }
}
