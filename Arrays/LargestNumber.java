package Arrays;

public class LargestNumber {
    public static int largestNumber(int[] nums){
        int temp = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > temp){
                temp = num;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,2,5,9,4,1,5,3};
        largestNumber(arr);
    }
}
