package ProgrammingExercises.BinarySearch.IB_RotatedArray;
/*
IB_RotatedArray
https://www.interviewbit.com/problems/rotated-array/
*/

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int findMin(final List<Integer> a) {
        int left = 0;
        int right = a.size()-1;
        int mid;
        if (a.size() == 1) return a.get(0);

        while(left <= right) {
            mid = (left + right) / 2;

            if(mid == 0) return a.get(1);
            if(a.get(mid) < a.get(mid -1)) return a.get(mid);
            if(a.get(left) < a.get(right)) return a.get(left);

            if(a.get(mid) < a.get(left)) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}