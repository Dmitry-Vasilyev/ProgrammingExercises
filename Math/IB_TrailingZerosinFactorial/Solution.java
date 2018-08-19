package ProgrammingExercises.Math.IB_TrailingZerosinFactorial;
/*
IB_TrailingZerosinFactorial
https://www.interviewbit.com/problems/trailing-zeros-in-factorial/
*/


public class Solution {
    public int trailingZeroes(int A) {
        int divider = 5;
        int counter = 0;

        while (divider <= A) {
            counter += A/divider;
            divider *= 5;
        }
        return counter;
    }
}