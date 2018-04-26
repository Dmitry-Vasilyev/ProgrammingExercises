package ProgrammingExercises.Array.IB_SpiralOrderMatrixI;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int arr[][] = {
                {1,2,3,4,5},
                {12,13,14,15,6},
                {11,10,9,8,7}};

        List<ArrayList<Integer>> list = new ArrayList<>();

        for(int[] i: arr) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int j: i) {
                tmp.add(j);
            }
            list.add(tmp);
        }

        System.out.println(solution.spiralOrder(list).toString());
    }
}
