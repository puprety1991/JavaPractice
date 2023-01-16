package Replit;

import java.util.Scanner;

public class P35 {
    /*Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
- if score is below  600 --> eligibility = "Not eligible"
- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
- if score is higher than any other previous values --> eligibility = "Definitely eligible" . */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean isDecision = scanner.nextBoolean();
        if (isDecision == true){
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();
            if(creditScore < 600){
                System.out.println("Not eligible");
            }else if( creditScore <= 700){
                System.out.println("Maybe eligible");
            }else if( creditScore <=800){
                System.out.println("Eligible");
            }else {
                System.out.println("Definitely eligible");
            }

        }else {
            System.out.println("Unknown");
        }

    }
}
