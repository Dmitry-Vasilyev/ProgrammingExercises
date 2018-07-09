package ProgrammingExercises.Hashing.IB_2Sum;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(19, 7, 11, 15));
        System.out.println(solution.twoSum(arrayList, 9));
    }
}
