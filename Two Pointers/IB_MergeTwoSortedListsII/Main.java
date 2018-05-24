package ProgrammingExercises.TwoPointers.IB_MergeTwoSortedListsII;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for(int i = 1; i < 15; i++) {
            if(i%2 == 1) A.add(i);
            else B.add(i);
        }
        solution.merge(A, B);

        System.out.println(A);
    }
}
