package challenge;

class Square{
        int side ;
    public void side(){
        System.out.println(side);
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


public class SquareUsingMethod {
    public static void main(String[] args) {
        Square sq = new Square();

        sq.side = 12;

        sq.side();

        System.out.println(sq.area());
        System.out.println(sq.perimeter());



    }
}
