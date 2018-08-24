package ProgrammingExercises.Array.IB_WaveArray;
/*
IB_WaveArray
https://www.interviewbit.com/problems/wave-array/
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();

        Collections.sort(A);

        for(int i = 0; i < A.size(); i++) {
            if((i%2) == 0) {
                if((i+1) == A.size()) {
                    result.add(A.get(i));
                    continue;
                }
                result.add(A.get(i+1));
            } else {
                result.add(A.get(i-1));
            }
        }
        return result;
    }
}