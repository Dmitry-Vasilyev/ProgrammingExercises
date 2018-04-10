package ProgrammingExercises.Math.LC_SelfDividingNumbers_728;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> result = (ArrayList<Integer>) solution.selfDividingNumbers(1, 22);

        System.out.println(result.toString());
    }
}
