package ProgrammingExercises.Math.IB_PrimeNumbers;
/*
All Factors
https://www.interviewbit.com/problems/all-factors/
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == 1) return list;

        list.add(2);

        f1 : for(int i = 3; i <= A; i++) {
            for(int j = 2; j <= Math.sqrt(i); ++j) {
                if (i%j == 0) continue f1;
            }
            list.add(i);
        }

        return list;
    }
}