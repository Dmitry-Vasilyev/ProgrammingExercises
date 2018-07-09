package ProgrammingExercises.Hashing.IB_2Sum;
/*
IB_2Sum
https://www.interviewbit.com/problems/2-sum/
*/


import java.util.*;

public class Solution {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        Integer index1 = null;
        Integer index2 = null;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.size(); i++) {
            Integer num = A.get(i);
            if(map.containsKey(num) && (B - num) != num) continue;

            if(map.containsKey(B - num)) {
                index1 = map.get(B - num);
                index2 = i + 1;
                break;
            } else {
                map.put(num, i+1);
            }
        }

        return index1 != null ? new ArrayList<>(Arrays.asList(index1, index2)) : new ArrayList<>();
    }
}