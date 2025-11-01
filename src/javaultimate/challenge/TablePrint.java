package challenge;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int table = sc.nextInt();

        for(int i = 10; i >=1; i--){
            int mul = table*i ;
            System.out.println(table+ " * " +i+ " = "+mul);
        }
    }
}
