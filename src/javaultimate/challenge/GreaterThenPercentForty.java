package challenge;

import java.util.Scanner;

public class GreaterThenPercentForty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first sub : ");
        float m1 = sc.nextFloat();
        System.out.print("Enter the Second sub : ");
        float m2 = sc.nextFloat();
        System.out.print("Enter the third sub : ");
        float m3 = sc.nextFloat();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("total your average is : " + avg);

        if(avg>40 && m1>33 && m2>33 && m3>33){
            System.out.println("Congreatulations , you have promotted");
        }
        else{
            System.out.println("Sorry, you have not promotted");
        }
    }
}
