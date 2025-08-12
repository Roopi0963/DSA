package Strings;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog".toLowerCase();
        boolean[] letters = new boolean[26];

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c))
                letters[c - 'a'] = true;
        }

        boolean isPangram = true;
        for (boolean b : letters) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        System.out.println("Pangram? " + isPangram);
    }


}
