package Strings;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "banana";
        int[] freq = new int[256];

        for (char c : str.toCharArray())
            freq[c]++;

        for (char c : str.toCharArray()) {
            if (freq[c] != 0) {
                System.out.println(c + " = " + freq[c]);
                freq[c] = 0;
            }
        }
    }
}
