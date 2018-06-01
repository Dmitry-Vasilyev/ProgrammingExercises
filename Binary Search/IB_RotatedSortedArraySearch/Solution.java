package ProgrammingExercises.BinarySearch.IB_RotatedSortedArraySearch;
/*
IB_Rotated Sorted Array Search
https://www.interviewbit.com/problems/rotated-sorted-array-search/
*/

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final List<Integer> a, int b) {
        int start = 0;
        int end = a.size();
        int mid;



        while(start <= end) {
            mid = (start + end) / 2;

            if(a.get(mid) == b) return mid;
            if(b == a.get(0)) return 0;

            if(b > a.get(0) && a.get(mid) > a.get(0) && a.get(mid) > b) end = mid - 1;
            else if(b > a.get(0) && a.get(mid) > a.get(0) && a.get(mid) < b) start = mid + 1;
            else if (b > a.get(0) && a.get(mid) < a.get(0)) end = mid - 1;
            else if (b < a.get(0) && a.get(mid) > a.get(a.size()-1)) start = mid + 1;
            else if (b < a.get(0) && a.get(mid) < a.get(a.size()-1) && a.get(mid) > b) end = mid - 1;
            else if (b < a.get(0) && a.get(mid) < a.get(a.size()-1) && a.get(mid) < b) start = mid + 1;
        }
        return -1;
    }
}