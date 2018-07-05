package ProgrammingExercises.StacksAndQueues.IB_MinStack;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] ar = new Integer[]{4, 5, 2, 10, 8};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(ar));

        for(int i: solution.prevSmaller(arr)) {
            System.out.print(i + " ");
        }
    }
}
