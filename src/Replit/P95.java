package Replit;

import java.util.Scanner;

public class P95 {
    /*Using Scanner class input string value.
Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
```*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word?");
        String word = input.next();
        if(word.length()>3){
            System.out.println(word.substring(0,3));
        }else{
            System.out.println(word);
        }
    }
}
