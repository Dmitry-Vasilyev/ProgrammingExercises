package ProgrammingExercises.TwoPointers.IB_ContainerWithMostWater;
/*
IB_Container With Most Water
https://www.interviewbit.com/problems/container-with-most-water/
*/

import java.util.ArrayList;

public class Solution {
    public int maxArea(ArrayList<Integer> A) {

        int i = 0;
        int j = A.size()-1;
        int S = 0;
        while(i < j) {
            S = Math.max(S, (j - i) * Math.min(A.get(i), A.get(j)));

            if(A.get(i) < A.get(j))
                i++;
            else
                j--;
        }
        return S;
    }
}