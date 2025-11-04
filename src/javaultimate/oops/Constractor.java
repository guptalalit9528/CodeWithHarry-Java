package oops;

class MyMainEmployee{
    private int id;
    private String name;

    //Constrator (isme hum set kr rahe hai values ko main method me baar baar set krne ki
    // jarurat nahi  hai (yaha constractor ye work hta hai baar baar set krne ki koi jarurat nahi hai))


//method overloading hoo rahi hai
    //without parimeter defaul constractor
    public MyMainEmployee(){
        id = 32;
        name = "Lalit Bhai";
    }
    //with parimeter parameterized contractor
    public MyMainEmployee(int myId ,String myName){
        id = myId;
        name = myName;
    }
    //only one parameter parameterized contractor
    public MyMainEmployee(String myName){
        id = 76;
        name = myName;
    }


    public int getId(){
        return id;
    }
//    public void setId(int n){  //set Method bnane ki bhi koi jarurat nahi hai kyuki humne iska bina use kre hi values set kr di contractor me
//        id = n;
//    }

    public String getName(){
        return name;
    }
//    public void setName(String n){
//        this.name = n;
//    }
}


public class Constractor {
    public static void main(String[] args) {
        MyMainEmployee mme = new MyMainEmployee();
        //Jab Contractor na hoo tab ese set kr sakte hai values ko (or agar aap fir bhi karte hai to jo main method me set kri hai values bahi print hongi contractor ki nahi)
//          mme.setId(45);
//          mme.setName("Lalit Gupta Ji");

        System.out.println("Without parimeter : "+mme.getId());
        System.out.println("Without parimeter : "+mme.getName());

        MyMainEmployee mme2 = new MyMainEmployee(12,"Coder Lalit Bhai");
        System.out.println("With parimeter : "+mme2.getId());
        System.out.println("With parimeter : "+mme2.getName());

        MyMainEmployee mme3 = new MyMainEmployee("Lalit Gupta ji");
        System.out.println("Without parimeter : "+mme3.getId());
        System.out.println("With one parimeter : "+mme3.getName());
    }
}
