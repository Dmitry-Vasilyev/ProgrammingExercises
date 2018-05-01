package ProgrammingExercises.Math.IB_AllFactors;
/*
All Factors
https://www.interviewbit.com/problems/all-factors/
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <=  Math.sqrt(A); ++i) {
            if(A%i == 0) {
                arr.add(i);
                if(A/i != i) arr.add(A/i);
            }

        }
        Collections.sort(arr);
        return arr;
    }
}