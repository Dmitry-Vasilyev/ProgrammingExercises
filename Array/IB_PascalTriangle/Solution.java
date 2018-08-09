package ProgrammingExercises.Array.IB_PascalTriangle;
/*
IB_Kth Row of Pascal's Triangle
https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
*/

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0) {
                    row.add(1);
                    continue;
                }
                if(j == i) {
                    row.add(1);
                    continue;
                }
                int left = result.get(i-1).get(j-1);
                int right = result.get(i-1).get(j);

                row.add(left + right);
            }
            result.add(row);
        }
        return result;
    }
}