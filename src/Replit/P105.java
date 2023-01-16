package Replit;

import java.util.Scanner;

public class P105 {
    /*There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
In: howdyho
oo*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("In: ");
        String word = scanner.nextLine();
        String vowel = word.replaceAll("[^aeiou]", "");
        System.out.println(vowel);
    }
}
