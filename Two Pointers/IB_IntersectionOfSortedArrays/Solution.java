package ProgrammingExercises.TwoPointers.IB_IntersectionOfSortedArrays;
/*
IB_Intersection Of Sorted Arrays
https://www.interviewbit.com/problems/intersection-of-sorted-arrays/
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int[] intersect(final int[] A, final int[] B) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < A.length && j < B.length) {
            if(A[i] == B[j]) {
                list.add(A[i]);
                i++; j++;
            } else if(A[i] > B[j]) j++;
            else i++;
        }

        int arr[] = new int[list.size()];
        for(int x = 0; x < arr.length; x++)
            arr[x] = list.get(x);

        return arr;
    }
}