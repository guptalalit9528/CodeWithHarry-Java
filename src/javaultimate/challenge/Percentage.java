package challenge;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculate percentage value");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the inside the Hundread");
        float marks = sc.nextFloat();
        if(marks <=100) {

            System.out.print("Enter the a value: ");
            float oops = sc.nextFloat();
            System.out.print("Enter the b value: ");
            float java = sc.nextFloat();
            System.out.print("Enter the c value: ");
            float ddco = sc.nextFloat();
            System.out.print("Enter the d value: ");
            float math = sc.nextFloat();
            System.out.print("Enter the e value: ");
            float excel = sc.nextFloat();

            float totalMarks = oops + java + ddco + math + excel;
            float res = (totalMarks / 500 ) * 100;
            System.out.println(res);
        }
        else{
            System.out.println("Your Marks out off Hundread");
        }
    }

}
