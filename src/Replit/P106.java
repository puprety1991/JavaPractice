package Replit;

public class P106 {
    /*Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
**Expected Output:**
HELLO WORLD*/
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        String s = stringBuilder.toString().toUpperCase();
        System.out.println(s);
    }
}
