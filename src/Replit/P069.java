package Replit;

public class P069 {
    //Write a program to print out the pattern:
    /*1234567
      123456
      12345
      1234
      123
      12
      1
      12
      123
      1234
      12345
      123456
      1234567*/
    public static void main(String[] args) {
        for(int i=7; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=2;i<=7; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
