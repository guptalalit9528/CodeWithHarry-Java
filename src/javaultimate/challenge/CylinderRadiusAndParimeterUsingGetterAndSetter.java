package challenge;

class Cyclinder {
    //problem 1
    private float radius;
    private float height;

    //problem 3
    public Cyclinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float h) {
        height = h;
    }

    //problem 2
    public double surfaceArea() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double valume() {
        return Math.PI * radius * radius * height; //Math.PI = 3.14 somthing
    }
}
    //problem 4
    class Rectangle{
        private int length;
        private int breadth;

        public Rectangle() {
            this.length = 4;
            this.breadth = 5;
        }
        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }




public class CylinderRadiusAndParimeterUsingGetterAndSetter {
    public static void main(String[] args) {
        //problem 1
    Cyclinder c = new Cyclinder(9.0f,12.0f); //problem 3 only parameter not the setter method use
    //c.setRadius(9.0f);
    //c.setHeight(12.0f);

    float r = c.getRadius();
    System.out.println(r);
    System.out.println(c.getHeight());

    //problem 2
    System.out.println(c.surfaceArea());

    double v = c.valume();
    System.out.println(v);


    //problem 4
        Rectangle re = new Rectangle(5,8);
        System.out.println(re.getLength());
        System.out.println(re.getBreadth());
    }
}
