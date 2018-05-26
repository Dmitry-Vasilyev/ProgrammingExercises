package ProgrammingExercises.TwoPointers.IB_RemoveDuplicatesfromSortedArray;
/*
IB_Remove Duplicates from Sorted Array
https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/
*/

import java.util.ArrayList;

public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        for(int i = 1; i < a.size(); ++i) {
            if(a.get(i - 1).equals(a.get(i))) {
                a.remove(i);
                --i;
            }
        }
        return a.size();
    }

}