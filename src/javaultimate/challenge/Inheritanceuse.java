package challenge;

class Circle{
     int radius;

    Circle(int r){
        System.out.println("I am a parent class constractor");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius*this.radius;
    }
}



class Cylinder extends Circle{
     int height ;

    public int getHeight() {
        return height;
    }

    Cylinder(int r , int h){
        super(r);
        System.out.println("I am a child class constractor");
        this.height = h;
    }

    public double volume(){
        return Math.PI * this.radius *this.radius*height;
    }
}


public class Inheritanceuse {
    public static void main(String[] args) {
        Cylinder obj2 = new Cylinder(21,32);
        System.out.println(obj2.area());
        System.out.println(obj2.volume());

    }
}

//
//class Circle{
//     private int radius;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    Circle(int radius){
//        System.out.println("I am a parent class constractor");
//        this.radius = radius;
//    }
//    public double area(){
//        return Math.PI * this.radius*this.radius;
//    }
//}
//
//
//
//class Cylinder extends Circle{
//    private int height ;
//
//    public int getHeight() {
//        return height;
//    }
//
//    Cylinder(int radius , int height){
//        super(radius);
//        System.out.println("I am a child class constractor");
//        this.height = height;
//    }
//
//    public double volume(){
//        return Math.PI * this.getRadius() *this.getRadius()*height;
//    }
//}
//
//public class Inheritanceuse{
//    public static void main(String[] args) {
//
//        Cylinder cy = new Cylinder(21,32);
//        System.out.println(cy.area());
//        System.out.println(cy.volume());
//    }
//
//}
