package oops;

class SmartPhone2 implements CellPhone,Wifi,MediaPlayer,Camera{

   public void keypad(){
       System.out.println("Enter the number 123...");
   }
    public void coupuon(){
        System.out.println("Please Paise dalba lo");
    }
   public void network(){
       System.out.println("My network issue");
   }
   public void bluetooth(){
       System.out.println("Conted successfully");
   }

    public void music(){
        System.out.println("Music suno bro");
    }
    public void record(){
        System.out.println("Recoding kr lo");
    }
    public void frontCamera(){
        System.out.println("Please open front camera");
    }
    public void selfiCamera(){
        System.out.println("Please open selfi camera");
    }
}


public class CellPhoneMain {
    public static void main(String[] args) {
        CellPhone cp = new SmartPhone2(); //interface ka refrence or class ka object ban jata hai
        //lekin interface ka object nahi ban sakta
        cp.keypad();
        cp.coupuon();

        Wifi wifi = new SmartPhone2();
        wifi.network();
        wifi.bluetooth();

        SmartPhone2 sp2 = new SmartPhone2();
        sp2.network();
    }
}
