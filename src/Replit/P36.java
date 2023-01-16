package Replit;

import java.util.Scanner;

public class P36 {
    /*
   Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
   and make the comparisons:
- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println("Please enter two numbers" );
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(str1.equalsIgnoreCase(str2) && num1 == num2){
            System.out.println("AND");
        }else if(!str1.equalsIgnoreCase(str2) && num1 == num2){
            System.out.println("OR");
        }else if(!str1.equalsIgnoreCase(str2) && num1 != num2){
            System.out.println("NONE");
        }
    }
}
