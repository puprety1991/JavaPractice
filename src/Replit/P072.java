package Replit;

public class P072 {
    /*Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
Print the values so the output should look like below
**Output:**
syntax
```*/
    public static void main(String[] args) {
        char[] letter = {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
        for(int i=0; i<= letter.length;i+=2){
            System.out.print(letter[i]);
        }
    }
}
