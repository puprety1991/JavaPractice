package Replit;
/*create method and name as m1. Inside your method body add print statement as "m1 method implementation"
2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
3. Call these two methods in the main method
**Expected Output:**
m1 method implementation
m2 method implementation
```*/
public class P108 {
    public void m1(){
        System.out.println( "m1 method implementation");
    }
    public void m2(){
        System.out.println("m2 method implementation");
    }

    public static void main(String[] args) {
        P108 obj = new P108();
        obj.m1();
        obj.m2();
    }


}
