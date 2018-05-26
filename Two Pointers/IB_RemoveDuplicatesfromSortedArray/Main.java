package ProgrammingExercises.TwoPointers.IB_RemoveDuplicatesfromSortedArray;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> A = new ArrayList<>();

        for(int i = 1; i < 6; i++) {
            A.add(i);
            if(i%2 == 0) A.add(i);

        }
        System.out.println("До: " + A + " || " + A.size());
        solution.removeDuplicates(A);

        System.out.println("После: " + A + " || " + A.size());
    }
}
