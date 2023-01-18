package Replit;

public class P134 {
    /*Write a method with the following specs:
Returns:
an integer
Name:
countVowels
Parameters:
a String called s
```*/
    public static int countVowels(String str){
        String vowels = str.replaceAll("[^aeiou]", "");
        return vowels.length();
    }

    public static void main(String[] args) {
        System.out.println(countVowels("happy friday! i love weekends"));
    }
}
