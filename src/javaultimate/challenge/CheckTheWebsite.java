package challenge;

import java.util.Scanner;

public class CheckTheWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you site : ");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commericial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
    }
}
