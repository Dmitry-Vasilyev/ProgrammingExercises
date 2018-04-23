package ProgrammingExercises.Math.LC_HappyNumber_202;
/*
202. Happy Number
https://leetcode.com/problems/happy-number/description/
*/

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        while(sum != 1) {
            sum = 0;
            while(n != 0) {
                sum += Math.pow(n%10, 2);
                n /= 10;
            }
            n = sum;
            if(!set.add(sum)) {
                return false;
            }
        }

        return true;
    }
}
