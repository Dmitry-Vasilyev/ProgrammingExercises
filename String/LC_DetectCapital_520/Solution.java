package ProgrammingExercises.String.LC_DetectCapital_520;
/*
520. Detect Capital
https://leetcode.com/problems/detect-capital/description/
*/


import java.util.HashMap;

public class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals = 0;
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            if (isUpperCase(aChar)) ++capitals;
        }
        if(capitals == chars.length || capitals == 0) return true;
        if(capitals == 1 && isUpperCase(chars[0])) return true;
        return false;
    }
    private boolean isUpperCase(char ch) {
        return ch <= 'Z';
    }
}
