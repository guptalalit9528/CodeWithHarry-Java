package corejava;

import java.util.Scanner;

public class LadderIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age > 56){
            System.out.println("You are experienced");
        } else if (age>66) {
            System.out.println("You are Semi Experienced");
        } else if (age>46) {
            System.out.println("you are semi semi experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
    }
}
