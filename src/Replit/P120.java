package Replit;

public class P120 {
    /*Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
I am a student of batch 14 studying at Syntax in the year of 2021
```*/
    int year;
    String schoolName;
    String batch;
    public void info(){
        System.out.println("I am a student of "+batch+" studying at "+schoolName+" in the year of "+year);
    }

    public static void main(String[] args) {
        P120 obj = new P120();
        obj.batch="batch 14";
        obj.year = 2021;
        obj.schoolName ="Syntax";
        obj.info();
    }
}
