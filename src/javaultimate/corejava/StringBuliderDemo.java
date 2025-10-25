package corejava;

import java.lang.module.ModuleDescriptor;

public class StringBuliderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Lalit");
        System.out.println("Original: " + sb);

        sb.append(" Kumar"); // Add text
        System.out.println("After append: " + sb);

        sb.insert(0, "Mr. "); // Insert at start
        System.out.println("After insert: " + sb);

        sb.replace(0, 3, "Sir"); // Replace text
        System.out.println("After replace: " + sb);

        sb.delete(0, 4); // Delete part of string
        System.out.println("After delete: " + sb);

        sb.reverse(); // Reverse the whole string
        System.out.println("After reverse: " + sb);
    }
}
