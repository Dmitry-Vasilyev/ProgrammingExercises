package ProgrammingExercises.Math.LC_AddStrings_415;
/*
415. Add Strings
https://leetcode.com/problems/add-strings/description/
*/

public class Solution {
    public String addStrings(String num1, String num2) {
        boolean flag = false;
        StringBuilder longNum;
        StringBuilder shortNum;

        if(num1.length() <= num2.length()) {
            shortNum = new StringBuilder(num1);
            longNum = new StringBuilder(num2);
        } else {
            shortNum = new StringBuilder(num2);
            longNum = new StringBuilder(num1);
        }

        int i, j;

        for(i = shortNum.length() - 1, j = longNum.length() - 1; i >= 0; --i, --j) {

            int firstOperand = Character.getNumericValue(shortNum.charAt(i));
            int secondOperand = Character.getNumericValue(longNum.charAt(j));
            if(flag) {
                ++firstOperand;
                flag = false;
            }
            int sum = firstOperand + secondOperand;
            if(sum >= 10) {
                sum %= 10;
                flag = true;
            }
            longNum.delete(j, j + 1);
            longNum.insert(j, sum);
        }
        while (flag && j >= 0) {
            int firstOperand = Character.getNumericValue(longNum.charAt(j));
            ++firstOperand;
            if(firstOperand == 10) {
                longNum.delete(j, j + 1);
                longNum.insert(j, 0);
            } else {
                longNum.delete(j, j + 1);
                longNum.insert(j, firstOperand);
                flag = false;
            }
            --j;
        }
        if(flag && j <= 0) {
            longNum.insert(0, 1);
        }
        return longNum.toString();
    }
}
