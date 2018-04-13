package ProgrammingExercises.Array.LC_MoveZeroes_283;
/*
283. Move Zeroes
https://leetcode.com/problems/move-zeroes/description/
*/

public class Solution {

    public int[] moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                for(int j = i + 1; j < nums.length; j++) {
                    if(nums[j] == 0) continue;
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
        return nums;
    }
}
