package ProgrammingExercises.Hashing.IB_DiffkII;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] arr = {1, 5, 5};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(solution.diffPossible(arrayList, 1));
    }
}
