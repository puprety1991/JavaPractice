package Replit;

import java.util.Scanner;

public class P032 {
  /*  Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"
    You have 2 conditions:
    If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
    If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

*/
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your gender: M or F");
    String gender = input.next().toUpperCase();
    System.out.println("Please enter your age");
    int age = input.nextInt();
   if(age >= 25){
     if(gender.equals("F")){
       System.out.println("Woman");
     }else{
       System.out.println("Man");
     }
   }else{
     if(gender.equals("F")){
       System.out.println("Girl");
     }else{
       System.out.println("Boy");
     }
   }
  }
}
