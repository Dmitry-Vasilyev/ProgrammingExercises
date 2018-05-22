package ProgrammingExercises.TwoPointers.IB_IntersectionOfSortedArrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int b[] = {1,2,3,5,6};
        int a[] = {3,3,4,5};

        for(int i: solution.intersect(a, b)) {
            System.out.print(i + " ");
        }
    }
}
