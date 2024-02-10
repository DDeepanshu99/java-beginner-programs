import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 7, 3, 6};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("sorted array is: "+ Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getmax(arr, 0, last);
            swap(arr, max, last);
        }
    }
    static int getmax(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
