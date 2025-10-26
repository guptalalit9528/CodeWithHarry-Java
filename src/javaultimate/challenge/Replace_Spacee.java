package challenge;

import java.util.Locale;

public class Replace_Spacee {
    public static void main(String[] args) {
        String name = "LaLit Gupta";
        System.out.println(name.toLowerCase());

        System.out.println(name.replace(" ","_"));


        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>","Lalit"));


        String mystring = "This string contains doupble  and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));


        System.out.println("Dear Lalit ,\n\t This java Course is Nice.\n\t Thanks");

    }
}
