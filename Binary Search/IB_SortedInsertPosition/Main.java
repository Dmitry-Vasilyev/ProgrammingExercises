package ProgrammingExercises.BinarySearch.IB_SortedInsertPosition;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] arr = {1, 3, 5, 7, 9};
        System.out.println(solution.searchInsert(new ArrayList<>(Arrays.asList(arr)), 8));
    }
}
