package Replit;

public class P122 {
    /*Declare 3 instance variables to hold:
- name of the country
- capital
- population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
**Expected Output:**
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
```*/
    String country;
    String capital;
    long population;
    public void countryInfo(){
        System.out.println("The capital of "+country+" is "+capital+" and population is "+population);
    }
    public static void main(String[] args) {
        P122 obj = new P122();
        obj.country="USA";
        obj.capital = "Washington DC";
        obj.population = 330000000;
        obj.countryInfo();

    }
}
