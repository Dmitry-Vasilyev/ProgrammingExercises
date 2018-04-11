package ProgrammingExercises.Math.LC_ExcelSheetColumnTitle_168;
/*
168. Excel Sheet Column Title
https://leetcode.com/problems/excel-sheet-column-title/description/
*/

import java.util.LinkedList;

public class Solution {
    public String convertToTitle(int n) {
        char ch;
        int mod;
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            mod = n % 26;
            if(mod == 0) {
                mod = 26;
                --n;
            }
            ch = (char)('A' - 1 + mod);
            sb.append(ch);
            n = n / 26;
        }
        return sb.reverse().toString();
    }
}
