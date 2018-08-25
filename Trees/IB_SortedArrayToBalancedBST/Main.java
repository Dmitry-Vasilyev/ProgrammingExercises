package ProgrammingExercises.Trees.IB_SortedArrayToBalancedBST;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree = new TreeNode(1);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        solution.sortedArrayToBST(list);

    }

}
