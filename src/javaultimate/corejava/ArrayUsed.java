package corejava;

public class ArrayUsed {
    public static void main(String[] args) {
        int [] arr = {12,23,43,54,65,87};

        System.out.println("Jis order me hai usi me elements print honge");
        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Reverse order Array");
        for (int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);
        }

        System.out.println("Printing using for each loop");
        for (int element : arr){
            System.out.println(element);
        }


    }
}
