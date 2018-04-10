package ProgrammingExercises.Math.LC_SelfDividingNumbers_728;
/*
728. Self Dividing Numbers
https://leetcode.com/problems/self-dividing-numbers/description/
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(isSelfDiving(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isSelfDiving(int num) {
        char[] numChars = Integer.toString(num).toCharArray();
        for(char ch : numChars) {
            Integer n = Integer.parseInt(Character.toString(ch));
            if(n == 0 || num % n != 0) return false;
        }
        return true;
    }
}
