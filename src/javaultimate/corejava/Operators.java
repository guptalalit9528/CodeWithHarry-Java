package corejava;

public class Operators {
    public static void main(String[] args) {
        System.out.println(4.8%1.1);
        char c = 'a';
        String str = "Lalit";
        System.out.println(c+str);

        if (str instanceof String) {
            System.out.println("Datatype is String");

            int d = 7;
            System.out.println(++d*8);
            System.out.println(d);

            char bd = 't';
            System.out.println(bd++);
            System.out.println(bd);
        }
    }
}
