package Strings;

public class CountVowelAndConsonants {
    public static void count(String s){
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowels : "+vowels+" Consonants : "+consonants);
    }
    public static void main(String[] args) {
        String s = "Hello";
        count(s);
    }
}
