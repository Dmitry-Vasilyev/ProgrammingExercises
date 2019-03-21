package ProgrammingExercises.Array.LC_RotateArray;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        int[] arr = {1, 2, 3, 4};
//        int[] arr = {1};


        System.out.print("Before: ");
        System.out.println(Arrays.toString(arr));

        solution.rotate(arr,  3);

        System.out.print("After: ");
        System.out.println(Arrays.toString(arr));
    }
}
