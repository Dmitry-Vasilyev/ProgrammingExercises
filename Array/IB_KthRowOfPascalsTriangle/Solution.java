package ProgrammingExercises.Array.IB_KthRowOfPascalsTriangle;
/*
IB_Kth Row of Pascal's Triangle
https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
*/

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int[] getRow(int A) {
        int prev[] = {1};
        int [] current;
        int k = 1;

        if(A == 0) return prev;
        while(k <= A) {
            current = new int[k+1];
            current[0] = 1;
            current[k] = 1;
            for(int i = 1; i < k; i++) {
                current[i] = prev[i-1] + prev[i];
            }
            k++;
            prev = current;
        }
        return prev;
    }
}