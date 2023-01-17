package Replit;

public class P068 {
    //Write a program to print out the pattern:
    /*$$$$
      $  $
      $  $
      $$$$   */
    public static void main(String[] args) {
        for(int i = 0; i<4;i++){
            for(int j=0;j<4;j++){
                if(i == 1 || i == 2){
                    if(j == 1 || j == 2){
                        System.out.print(" ");
                        continue;
                    }
            }
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
