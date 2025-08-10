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

    static int removeDuplicates2(int[] nums){
        int i =0;
        for(int j = 1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];

            }
        }
        return i+1;
    }

    public static void main(String[] args) {
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        int k = removeDuplicates(arr);
//        System.out.println(k);
//        for(int i=0;i<k;i++){
//            System.out.println(arr[i]);
//        }
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
