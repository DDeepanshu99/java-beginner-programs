public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23,4,5,23,12,13,78,79,15,17};
        int target = 15;
        int ans = linearsearchalgo(nums, target);
        System.out.println(ans);
    }
    public static int linearsearchalgo(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
