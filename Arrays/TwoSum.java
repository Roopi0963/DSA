package Arrays;

public class TwoSum {
    static int[] twoSum(int[] nums, int target){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }

            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
