package ProgrammingExercises.Array.IB_MaxSumContiguousSubarray;
/*
Max Sum Contiguous Subarray
https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
*/

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int ans = Integer.MIN_VALUE, sum = 0;

        for(int j = 0; j < A.size(); j++) {
            int num = A.get(j);
            if(num > 0) break;
            ans = Math.max(num, ans);
            if(j == A.size()-1) return ans;
        }
        ans = 0;
        for(int i: A) {
            if(sum + i > 0) sum+=i;
            else sum = 0;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}