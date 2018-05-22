package ProgrammingExercises.BinarySearch.IB_SortedInsertPosition;
/*
IB_Sorted Insert Position
https://www.interviewbit.com/problems/sorted-insert-position/
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int searchInsert(ArrayList<Integer> a, int b) {
        int start = 0;
        int end = a.size() - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            if(a.get(mid) == b) return mid;

            if(a.get(mid) < b) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
}