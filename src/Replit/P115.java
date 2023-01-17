package Replit;

public class P115 {
    /*Create a method that will accept a String as a parameter and return new String all in upper case
Call method
**Expected Output:**
TEST
```*/
    public String str(String msg){
        return msg.toUpperCase();
    }

    public static void main(String[] args) {
        P115 obj = new P115();
        System.out.println(obj.str("test"));
    }
}
