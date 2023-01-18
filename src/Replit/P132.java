package Replit;

public class P132 {
    /*Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below
input
1 2 3 4
4 5 6 7
1 3 5 7
**Expected Output:**
-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3 */
    public static void arraySub(int[][]query){
        int result = 0;
        for(int i=0;i<query.length;i++){
            for(int j=0;j<query[i].length;j++){
                result = query[i][j]-10;
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
       arraySub(a);
    }
}
