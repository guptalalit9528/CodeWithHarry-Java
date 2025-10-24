package corejava;

import java.sql.SQLOutput;

public class Str_Method {
    public static void main(String[] args) {
        String name = "LaLit";
        String last = "Gupta";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));
        System.out.println(name.replace('i','o'));
        System.out.println(name.replace("i","orp"));
        System.out.println(name.startsWith("La"));
        System.out.println(name.endsWith("if"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("L"));
        System.out.println(name.indexOf("L",1));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.equals("lalit"));
        System.out.println(name.equalsIgnoreCase("lalit"));
        System.out.println(name.compareTo("LaLit"));
    }
}
