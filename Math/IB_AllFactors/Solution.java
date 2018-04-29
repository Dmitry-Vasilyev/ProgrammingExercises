package ProgrammingExercises.Math.IB_AllFactors;
/*
All Factors
https://www.interviewbit.com/problems/all-factors/
*/

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i = 2; i <= A/2; ++i) {
            if(A%i == 0) arr.add(i);
        }
        if(A != 1) arr.add(A);
        return arr;
    }
}