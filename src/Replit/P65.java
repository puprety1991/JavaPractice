package Replit;

import java.util.Scanner;

public class P65 {
    //Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X : ");
        int num = scanner.nextInt();
        for(int i = num-1;i>=0; i--){
            System.out.print(i+" ");
        }
    }
}
