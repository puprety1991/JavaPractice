package Replit;

public class P74 {
    //Write a program that creates an array of integers of size 11.
    // Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.
    public static void main(String[] args) {
        int [] year = new int[11];
        year[0] = 2010;
        year[1] = 2011;
        year[2] = 2012;
        year[3] = 2013;
        year[4] = 2014;
        year[5] = 2015;
        year[6] = 2016;
        year[7] = 2017;
        year[8] = 2018;
        year[9] = 2019;
        year[10] = 2020;
        for(int i=0; i<year.length;i++){
            System.out.println(year[i]);
        }
    }
}
