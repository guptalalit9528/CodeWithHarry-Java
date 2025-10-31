package challenge;

public class PatternPrint {
    public static void main(String[] args) {
//        for (int i = 5; i >=1; i--){
//        //for(int i = 1; i <=5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

        int i = 1;

        while(i<=5) {
            int j = 1;
            while (j <= i) {
                System.out.print(" * ");
                j++;
            }
            System.out.print("\n");
            i++;
        }

    }
}
