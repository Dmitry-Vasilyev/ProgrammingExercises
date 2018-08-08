package ProgrammingExercises.Backtracking.IB_Permutations;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        for(ArrayList arr: solution.permute(new ArrayList<>(Arrays.asList(1, 2, 3)))) {
            System.out.println(arr);
        }

    }
}
