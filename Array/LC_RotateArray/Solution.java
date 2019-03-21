package ProgrammingExercises.Array.LC_RotateArray;
/*
LC_RotateArray
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
*/

public class Solution {
    public void rotate(int[] nums, int k) {

        int[] arr = new int[nums.length];

        for (int i = 0, j = nums.length - k; i < nums.length; i++, j = ++j % nums.length) {
            arr[i] = nums[j];
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

    }
}
