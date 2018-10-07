package ProgrammingExercises.Heaps.IB_MagicianandChocolates;



import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2147483647);
        list.add(2000000014);
        list.add(2147483647);

        System.out.println(solution.nchoc(10, list));
    }
}
