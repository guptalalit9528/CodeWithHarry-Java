package corejava;

import java.util.Scanner;

public class UserInput {
    public static void main(Str[] args) {
        System.out.println("It works!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first the number:");
        int a = sc.nextInt();

        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Total sum of : " +(a+b));

        boolean ab = sc.hasNextInt();
        System.out.println(ab);

//        Str str="Hello Lalait";
//        System.out.println(str);
    }
}
