package oops;


  abstract class Parent3{
     public Parent3() {
        System.out.println("Mai Parent3 ka constractor hoon ...parent3");
    }
    public void sayHello(){
        System.out.println(" I am a simple method from Parent3 class ...Hello");
    }
    abstract public void greet(); //abstract method
}

class Child3 extends Parent3{
      @Override
      public void greet(){
          System.out.println("I am a Child3 inherit Parent3 ...Good Morning");
      }
}

abstract class Child4 extends Parent3{
      public void eat(){
          System.out.println("I am child4 inherit Parent3...i am eating something");
      }
      abstract public void weeping();  //abstract method
}

class Child5 extends Child4{
    @Override
    public void weeping() {
        System.out.println("I am a child5 inherit Child4...I am a weep");
    }
    @Override
    public void greet(){
        System.out.println(" I am a Child5 inherit Child4...Good Morning");
    }
    public void check(){
        System.out.println(" I am a Child5 inherit Child4...only check");
    }
}
