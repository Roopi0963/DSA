package Hashing;

public class HighestAndLowestFrequency {
    static void printHighestAndLowest(int[] arr , int n){
        boolean[] visited = new boolean[n];

        int maxFreq = 0;
        int minFreq = n;
        int maxFreqElement = 0;
        int minFreqElement = 0;

        for(int i=0;i<n;i++){
            if(visited[i] == true)
                continue;

            int count = 1;

            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            if(count > maxFreq){
                maxFreqElement = arr[i];
                maxFreq = count;
            }

            if(count < minFreq){
                minFreqElement = arr[i];
                minFreq = count;
            }
        }

        System.out.println(maxFreqElement+" "+minFreqElement);
    }
    public static void main(String[] args) {
        int[] arr = {1, 1,2,2,2,3,3,4,4,4,5,5,5,5,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        printHighestAndLowest(arr,n);
    }
}
