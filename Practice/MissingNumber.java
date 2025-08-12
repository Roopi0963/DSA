package Practice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // 4 is missing
        int n = 5;
        int total = n * (n + 1) / 2;

        for (int num : arr)
            total -= num;

        System.out.println("Missing number: " + total);
    }
}
