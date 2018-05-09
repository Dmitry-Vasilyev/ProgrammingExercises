package ProgrammingExercises.Array.IB_PRETTYPRINT;
/*
IB_PRETTYPRINT
https://www.interviewbit.com/problems/prettyprint/
*/


public class Solution {
    public int[][] prettyPrint(int A) {
        int lines = A*2-1;
        int up = 0;
        int down = lines - 1;

        int arr[][] = new int[lines][lines];

        for (int j = A; j > 0; j--) {
            for(int i = up; i <= down; ++i) {
                arr[up][i] = j;
                arr[i][down] = j;
                arr[down][i] = j;
                arr[i][up] = j;
            }
            ++up;
            --down;
        }
        return arr;
    }
}