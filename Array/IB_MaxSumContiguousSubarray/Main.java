package ProgrammingExercises.Array.IB_MaxSumContiguousSubarray;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int arr[]= {-2, -2, -2, -3, -2};

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) {
            list.add(num);
        }
        System.out.println(solution.maxSubArray(list));
    }
}
