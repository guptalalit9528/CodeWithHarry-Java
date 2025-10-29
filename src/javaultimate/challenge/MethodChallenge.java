package challenge;

public class MethodChallenge {
    //problem 1
    static void multiplication(int n){
        for(int i = 1; i <=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    //problem 2
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //problem 3
    static int sumRect(int n){
        if(n == 1){
            return 1;
        }
        return  n + sumRect(n -1);  //recursion
    }

    //problem 4
     void pattern2(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //problem 5
    static int fibornaric(int n){
        /*if(n == 1){
          return 0;
        }
        else if (n == 2){
            return 1;
        }*/  //dono me se koi bhi use kr sakte hai ye iska sort way hai niche bala

        if(n == 1 || n == 2){
            return n-1;
        }
        else{
            return fibornaric(n-1) + fibornaric(n-2);
        }
    }

    //problem 7
    static void pattern2Rec(int n){
        if(n > 0){
            for(int j = n; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
            pattern2Rec(n - 1);
        }
    }

    //problem 8
    static void pattern1Rec(int n){
        if(n > 0) {
            pattern1Rec(n-1);
            for (int j = 0; j < n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    //problem 9
    static void fahrenheit(float celsius){
       // float a = 9/5;
        System.out.println((celsius*9/5f)+32);
    }

}
