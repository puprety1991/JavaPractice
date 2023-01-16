package Replit;

public class P94 {
    /*- Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them
**Expected Output:**
classes at Syntax
I love Java*/
    public static void main(String[] args) {
        String fullSent = "I love Java classes at Syntax";
        String firstPart = fullSent.substring(0, 11);
        String secondPart = fullSent.substring(12);
        System.out.println(firstPart);
        System.out.println(secondPart);
    }
}
