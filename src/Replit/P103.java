package Replit;

import java.util.Scanner;

public class P103 {
    /*Write a for loop that will print out each letter of the string s, separated by spaces, on the same line
Sample input/outputs:
In: hello
h e l l o*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newStr = "";
        System.out.print("In: ");
        String word = input.next();
        for(int i = 0; i<word.length(); i++){
            newStr+=word.charAt(i)+" ";
        }
        System.out.println("Output: "+newStr);
    }
}
