package Replit;

public class P117 {
    /*Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20*/
    int sumEvenToX(int x){
        int sum = 0;
        for(int i=2; i<=x;i++){
            if(i%2==0){
                sum+=i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        P117 obj = new P117();
        int i = obj.sumEvenToX(8);
        System.out.println(i);
    }
}
