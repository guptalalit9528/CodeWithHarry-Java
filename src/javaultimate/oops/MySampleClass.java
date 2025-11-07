package oops;

class MySample implements ChildSampleInterface{
    public void met1(){
        System.out.println("met1");
    }
    public void met2(){
        System.out.println("met2");
    }
    public void met3(){
        System.out.println("met3");
    }
    public void met4(){
        System.out.println("met4");
    }
}


public class MySampleClass {
    public static void main(String[] args) {
        MySample ms = new MySample();
        ms.met1();
        ms.met2();
        ms.met3();
        ms.met4();
    }
}
