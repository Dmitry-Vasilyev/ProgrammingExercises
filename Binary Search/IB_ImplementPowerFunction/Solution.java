package ProgrammingExercises.BinarySearch.IB_ImplementPowerFunction;
/*
IB_Implement Power Function
https://www.interviewbit.com/problems/implement-power-function/
*/

public class Solution {


    public int pow(int x, int n, int d) {
        for(int i = 1; i < n; i++) {
            x*=x;
        }
        int z = x / d;
        int result = x - (z * d);
        if(result < 0) result *= -1;
        return result;
    }
}