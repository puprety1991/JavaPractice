package Replit;

public class P090 {
    /*Create a String named s1 = "hello"  check weather string is empty or not
Create a String named s2 = ""  check weather string is empty or not
**Expected Output:**
false
true
```*/
    String s1 = "hello";
    String s2 = "";
    public void isEmpty(){
        boolean toCheck = s1.isEmpty();
        boolean toCheck1 = s2.isEmpty();
        System.out.println(toCheck);
        System.out.println(toCheck1);
    }

    public static void main(String[] args) {
        P090 str = new P090();
        str.isEmpty();
    }
}
