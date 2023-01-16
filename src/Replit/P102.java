package Replit;

import java.util.Scanner;

public class P102 {
    /*Write a for loop that will loop through every character of a word and print out each character, each on a separate line */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newStr = "";
        System.out.print("Word: ");
        String word = scanner.next();
        for(int i=0; i<word.length();i++){
            System.out.println(word.charAt(i));
        }

    }
}
