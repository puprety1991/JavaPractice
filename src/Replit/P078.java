package Replit;

import java.util.Scanner;

public class P078 {
    /*Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below

**Example:**

Input:    output:
1           10
2           20
3           30
4           40
5           50
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = scanner.nextInt();
        int [] number = new int[size];
        for(int i=0; i<number.length;i++){
            number[i] = scanner.nextInt();
        }
        for(int i=0; i<number.length;i++){
            System.out.println(number[i]*10);
        }
    }
}
