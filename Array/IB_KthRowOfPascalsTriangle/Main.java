package ProgrammingExercises.Array.IB_KthRowOfPascalsTriangle;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        for(int i : solution.getRow(11)) {
            System.out.print(" " + i + " ");
        }
    }
}
