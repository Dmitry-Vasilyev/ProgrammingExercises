package ProgrammingExercises.Array.IB_PRETTYPRINT;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for(int[]arr: solution.prettyPrint(6)){
            for (int i : arr) System.out.print(i + " ");
            System.out.println();
        }
    }
}
