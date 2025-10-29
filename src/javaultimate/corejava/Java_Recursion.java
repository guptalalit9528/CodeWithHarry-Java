package corejava;

public class Java_Recursion {

    static int factorial(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        else{
            return n * factorial(n-1); //recursive use
        }
    }


    public static void main(String[] args) {
        int x = 4;
        System.out.println("The value of factorial is : "+factorial(x));
    }
}
