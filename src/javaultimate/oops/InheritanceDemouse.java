package oops;


// ---------- Circle Class ----------
class Circle {
    private int radius;   // private variable

    // Constructor
    Circle(int radius) {
        this.radius = radius;
    }

    // Getter
    public int getRadius() {
        return radius;
    }

    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }
}

// ---------- Cylinder Class ----------
class Cylinder {
    private int radius;   // child ka apna radius (independent)
    private int height;   // second variable

    // Constructor
    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Getters
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    // Method to calculate volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// ---------- Main Class ----------
public class InheritanceDemouse {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Circle Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.area());

        System.out.println("-----------------------------");

        Cylinder cy = new Cylinder(7, 10);
        System.out.println("Cylinder Radius: " + cy.getRadius());
        System.out.println("Cylinder Height: " + cy.getHeight());
        System.out.println("Cylinder Volume: " + cy.volume());
    }
}


