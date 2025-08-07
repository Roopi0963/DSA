package Arrays;

public class SecondLargest {

    /*
        Input: [1, 5, 3, 9, 2]
        Output: 5
     */

    static int secondLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }


        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,2,5,9,4,1,5,3};
        System.out.println(secondLargest(arr));
    }
}
