package Hashing;

public class CountFrequency {
    static void countFreq(int[] arr,int n){
        boolean[] visited = new boolean[n];

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
            System.out.println(arr[i]+" "+count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1,2,2,2,3,3,4,4,4,5,5,5,5,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        countFreq(arr,n);
    }
}
