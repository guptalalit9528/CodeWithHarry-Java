package oops;

public class AccessModifierMain {
    public static void main(String[] args) {
        C1 c = new C1();
        c.met1();
        System.out.println("Same package access private access nahi kr sakte ");
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);
    }
}
