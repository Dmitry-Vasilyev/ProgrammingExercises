package ProgrammingExercises.Array.LC_ReshapeTheMatrix_566;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[][] = {
                {1,2,3,4},
                {5,1,2,3},
                {6,5,1,2},
                {7,6,5,1}
        };
        int result[][] = solution.matrixReshape(arr, 2, 8);
        for(int[] i: result) {
            System.out.println();
            for(int n: i) {
                System.out.print(n);
            }
        }
    }
}
