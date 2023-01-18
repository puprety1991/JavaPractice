package Replit;

public class P133 {
    /*Create a static method with the following specs:
Returns:
an integer
Name:
countA
Parameters:
a String called s
Purpose:
count the number of occurrences of 'a' or 'A' within s*/
    public static int countA(String str){
        int count = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countA("aaBBdf8k3AAadnklAjfdfjdkfaaakjfdkfjaaa"));
    }
}
