package ProgrammingExercises.Math.IB_GreatestCommonDivisor;
/*
IB_Greatest Common Divisor
https://www.interviewbit.com/problems/greatest-common-divisor/
*/

import java.util.ArrayList;

public class Solution {
    public int gcd(int A, int B) {
        int min, max;
        if(A >= B) {
            max = A;
            min = B;
        } else {
            max = B;
            min = A;
        }
        if(A == 0 || B == 0) return max;
        if(max%min == 0) return min;

        for(int i = min / 2; i != 0; i--) {
            if(min%i == 0 && max%i == 0) return i;
        }
        return 1;
    }
}