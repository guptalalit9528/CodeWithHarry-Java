package challenge;

public class FindMaximumArrayElement {
    public static void main(String[] args) {

        int [] arr = {2,31,4,5,-6654,23};
        int max = 0;
        for(int element : arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println("The value of the maximum element in this array is : " + max);
    }
}
