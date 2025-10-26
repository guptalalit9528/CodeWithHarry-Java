package challenge;

public class ArrraySUm {
    public static void main(String[] args) {
        float [] marks = {33.0f, 54, 53.7f,76.42f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("Total sum of Array : " +sum);
    }
}
