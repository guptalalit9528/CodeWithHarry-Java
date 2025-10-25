package corejava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        while (true) {
            System.out.print("\nEnter operator (+, -, *, /, %, e=exit, n=NewNumber): ");
             char op = sc.next().charAt(0);

            if(op=='n'){
                System.out.print("Enter the first NewNumber : ");
                a = sc.nextInt();
                System.out.print("Enter the second NewNumber : ");
                b = sc.nextInt();
            }

           else
            {
                float result;

                switch (op) {
                    case '+':
                        result = a + b;
                        System.out.println(result);
                        break;

                    case '-':
                        result = a - b;
                        System.out.println(result);
                        break;

                    case '*':
                        result = a * b;
                        System.out.println(result);
                        break;

                    case '/':
                        result = a / b;
                        System.out.println(result);
                        break;

                    case '%':
                        result = a % b;
                        System.out.println(result);
                        break;

                    case 'e':
                        System.out.println("GoodBye!");
                        sc.close();
                        break;

                    default:
                        System.out.println("Invalid charater");
                }
            }
        }
    }
}
