package ProgrammingExercises.BinarySearch.IB_SquareRootofInteger;
/*
IB_Square Root of Integer
https://www.interviewbit.com/problems/square-root-of-integer/
*/

import java.util.LinkedList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int sqrt(int a) {
        int start = 1;
        int end = a / 2;
        int mid = 0;
        int root = 0;
        if(a == 1) return 1;
        if(a == 0) return 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if(mid * mid == a) return mid;

            if(mid <= a / mid) {
                start = mid + 1;
                root = mid;
            }
            else end = mid - 1;
        }
        return root;
    }
}