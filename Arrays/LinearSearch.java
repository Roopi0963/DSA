package Arrays;

public class LinearSearch {

    /*
        Input: arr[]= 1 2 3 4 5, num = 3
        Output: 2
    */

    static int linearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearch(arr,5));
    }
}
