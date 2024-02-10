import java.util.*;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(arr));
        cyclesort(arr);
        System.out.println("sorted array is: "+ Arrays.toString(arr));
    }
    static void cyclesort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
