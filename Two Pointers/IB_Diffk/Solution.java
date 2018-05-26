package ProgrammingExercises.TwoPointers.IB_Diffk;
/*
IB_Diffk
https://www.interviewbit.com/problems/diffk/
*/

import java.util.ArrayList;

public class Solution {
    public int diffPossible(int[] A, int B) {
        for(int i = 0; i < A.length; i++) {
            if(search(A, B, A[i], i + 1)) return 1;
        }
        return 0;
    }

    private boolean search(int[] A, int B, int X, int start) {
        int end = A.length - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            if((A[mid] - X) == B) return true;
            if((A[mid] - X) > B) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}