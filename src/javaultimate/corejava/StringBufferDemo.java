package corejava;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Lalit ");
        System.out.println("Original: " + sb);

        sb.append(" Gupta"); // Add text
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
