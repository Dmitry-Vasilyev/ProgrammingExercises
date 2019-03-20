package ProgrammingExercises.Array.LC_RemoveDuplicatesFromSortedArray;
/*
LC_RemoveDuplicatesFromSortedArray
https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
*/



public class Solution {
    public int removeDuplicates(int[] a) {
        if(a.length == 0) return 0;
        int index = 0;
        int lastNum = a[0];

        for(int i = 1; i < a.length; i++) {
            if(lastNum < a[i]) {
                a[++index] = a[i];
                lastNum = a[i];
            }
        }
        return ++index;
    }
}
