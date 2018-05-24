package ProgrammingExercises.TwoPointers.IB_MergeTwoSortedListsII;
/*
IB_Merge Two Sorted Lists II
https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
*/

import java.util.ArrayList;

public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i, j, z;
        i = j = z = 0;
        int sizeA = a.size();

        while(i < sizeA && j < b.size()) {
            if(a.get(z) <= b.get(j)) {
                i++;
                z++;
            } else  {
                a.add(z, b.get(j));
                j++;
                z++;
            }
        }
        while(b.size() > j) {
            a.add(b.get(j));
            ++j;
        }
    }
}