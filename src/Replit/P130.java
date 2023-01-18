package Replit;

public class P130 {
    /*Complete the mystery method so that it takes in an integer array as a parameter,
    and then modifies each element based on whether it's even or odd.
    If the number is even, divide it by 2.  If it's odd, multiply it by 10.
    **Expected Output:**
    10 1 30 2 50 */
    public static void calculate(int[] array){
      int num;
        for(int i=0; i<array.length;i++){
            if(array[i]%2 == 0){
                num = array[i] / 2;
                System.out.print(num+" ");
            }else{
                if(array[i]%2 == 1){
                    num = array[i] * 10;
                    System.out.print(num+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]query = {1,4,6,3};
        calculate(query);
    }
}
