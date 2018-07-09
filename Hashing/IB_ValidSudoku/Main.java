package ProgrammingExercises.Hashing.IB_ValidSudoku;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(solution.isValidSudoku(arrayList));
    }
}
