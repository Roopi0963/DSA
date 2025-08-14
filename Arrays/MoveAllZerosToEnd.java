package Arrays;

import java.util.ArrayList;

public class MoveAllZerosToEnd {
    public static int[] moveZeros(int n, int []a) {
        //temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeros(arr.length,arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
