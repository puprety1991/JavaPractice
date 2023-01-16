package Replit;

import java.util.Scanner;

public class P100 {
    /* String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String string = input.next();
        String reverseString = "";
        for(int i=string.length()-1;i>=0;i--){
            reverseString+=string.charAt(i);
        }
        System.out.println("Reversed word: "+reverseString);
    }
}
