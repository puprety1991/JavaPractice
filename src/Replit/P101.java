package Replit;

import java.util.Scanner;

public class P101 {
    /*Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.

Sample input/outputs
In: hello
hlo
In: SSyynnttaaxxTTeecchhnnoollooggiieess
SyntaxTechnologies*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newStr = "";
        System.out.print("In: ");
        String word = input.next();
        for(int i=0; i<word.length(); i+=2){
            newStr+=word.charAt(i);
        }
        System.out.println("Output: "+newStr);
    }
}
