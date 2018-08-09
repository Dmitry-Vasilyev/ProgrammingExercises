package ProgrammingExercises.Array.IB_PascalTriangle;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        for(ArrayList<Integer> arr : solution.solve(5)) {
            for(Integer i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
