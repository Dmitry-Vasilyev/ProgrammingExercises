package ProgrammingExercises.BinarySearch.IB_RotatedSortedArraySearch;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(solution.search(new ArrayList<>(Arrays.asList(arr)), 5));
    }
}
