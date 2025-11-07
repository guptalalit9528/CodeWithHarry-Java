package oops;

class PhoneDynamicMethodDispatch {
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("Only phone start");
    }
}

class Smartphone extends PhoneDynamicMethodDispatch{
    public void swagat(){
        System.out.println("Namaste aapka swagat hai");
    }
    @Override
    public void on(){
        System.out.println("Only smartphone start");
    }
}