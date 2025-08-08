package Strings;

public class Palindrome {
    static boolean isPalindrome(String s){
        int i = 0;
        int j = 0;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("Not Palindrome");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
