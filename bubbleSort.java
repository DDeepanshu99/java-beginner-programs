import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,3,6};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println("sorted array is: "+ Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
