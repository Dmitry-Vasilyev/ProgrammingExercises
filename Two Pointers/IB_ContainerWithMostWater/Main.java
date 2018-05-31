package ProgrammingExercises.TwoPointers.IB_ContainerWithMostWater;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(10);
        a.add(10);


        System.out.println(solution.maxArea(a));
    }
}
