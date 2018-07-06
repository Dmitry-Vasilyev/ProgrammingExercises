package ProgrammingExercises.Hashing.IB_DiffkII;
/*
IB_DiffkII
https://www.interviewbit.com/problems/diffk-ii/
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> set = new HashSet<>();

        for(Integer num : A) {
            if(set.contains(num + B) || set.contains(num - B)) return 1;
            set.add(num);
        }

        return 0;
    }
}