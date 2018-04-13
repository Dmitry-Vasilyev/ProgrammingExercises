package ProgrammingExercises.Array.LC_MoveZeroes_283;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int arr[] = {0,1,2,4,0,5};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution.moveZeroes(arr)));
    }
}
