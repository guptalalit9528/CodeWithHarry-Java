package oops;

class Base{
    private int x ;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printMe(int x){
        this.x = x;
        System.out.println("I am a method " +x);
    }
}

class Derived extends Base{
    private int y ;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    void print(){
        System.out.println("I am method " +y);
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Derived b = new Derived();
        int x = 12;
        b.setX(x);
        System.out.println(b.getX());
        b.printMe(x);


        b.setY(22);
        System.out.println(b.getY());
        b.print();
    }
}
