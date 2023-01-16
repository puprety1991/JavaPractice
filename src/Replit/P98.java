package Replit;

public class P98 {
    /*
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family
*/
    public static void main(String[] args) {
        String str = "Hello Syntax friends";
        String newStr = str.replaceAll("Hello", "Welcome");
        String str1 = newStr.replaceAll("friends", "family");
        System.out.println(str1);

    }
}
