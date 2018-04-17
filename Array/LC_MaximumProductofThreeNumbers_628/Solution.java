package ProgrammingExercises.Array.LC_MaximumProductofThreeNumbers_628;
/*
628. Maximum Product of Three Numbers
https://leetcode.com/problems/maximum-product-of-three-numbers/description/
*/

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        if(nums[0] < 0 && nums[1] < 0 && nums[0]*nums[1] > nums[nums.length-2] * nums[nums.length-3] ){
            nums[nums.length-2] = nums[0];
            nums[nums.length-3] = nums[1];
        }
        for(int i = nums.length - 1; nums.length - 4 < i; --i) {
            result*=nums[i];
        }

        return result;
    }
}
