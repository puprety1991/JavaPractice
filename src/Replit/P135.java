package Replit;

public class P135 {
    /*Write a method with the following specs:
Returns:
a String
Name:
surround
Parameters:
a String called s
a String called search_term
Then complete the method by programming the following behavior
Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.*/
    public static String surround(String str, String c){
        String s = "";
        s=str.replaceAll(c,"("+c+")");

        return s;
    }

    public static void main(String[] args) {
        System.out.println(surround("abracadabra","a"));
    }
}
