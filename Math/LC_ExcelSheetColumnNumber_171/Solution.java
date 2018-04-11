package ProgrammingExercises.Math.LC_ExcelSheetColumnNumber_171;
/*
171. Excel Sheet Column Number
https://leetcode.com/problems/excel-sheet-column-number/description/
*/

public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result += Math.pow(26, i) * (s.charAt(s.length() - 1 - i) - 'A' + 1);
        }
        return result;
    }
}
