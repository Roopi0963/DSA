package LeetCodeProblems;

public class RemoveDuplicatesFromSortedArray_26 {
    static int removeDuplicate(int[] nums){
        int j = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }

        }
//        System.out.println(j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicate(arr);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
