package challenge;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {

        boolean isSorted = true;
        int [] arr = {1,2,34,5};
        for(int i = 0; i <arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
}
