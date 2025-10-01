package challenge;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println("Grade me add:" + grade);

        //decrypting the grade
        grade = (char)(grade -8);
        System.out.println("Grade:" + grade);
    }
}
