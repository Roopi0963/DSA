package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x : set){
            nums[j++] = x;
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }

    }
}
