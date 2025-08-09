package LeetCodeProblems;

public class ReverseArray {
    static void reverse(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }
}
