package ProgrammingExercises.BinarySearch.IB_CountElementOccurence;
/*
Count Element Occurence
https://www.interviewbit.com/problems/count-element-occurence/
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int findCount(final int[] A, int B) {
        int count;

        int first = search(A, B, true);
        int last = search(A, B, false);




        return last - first + 1;
    }

    private int search(int[] arr, int x, boolean first) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        int position = -1;

        while (start <= end) {
            mid = (start + end) / 2;
            if(arr[mid] == x) {
                position = mid;
                if(first)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (arr[mid] > x) end = mid - 1;
            else start = mid + 1;
        }
        return position;
    }
}