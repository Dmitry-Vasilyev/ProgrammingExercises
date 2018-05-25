package ProgrammingExercises.String.IB_Atoi;
/*
IB_Atoi
https://www.interviewbit.com/problems/atoi/
*/


public class Solution {
    public int atoi(final String A) {
        StringBuilder numStr = new StringBuilder();

        for(int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if(ch == ' ' && numStr.length() == 0) continue;
            if(numStr.length() == 0 && !Character.isDigit(ch) && ch != ' ' && ch != '-' && ch != '+') return 0;
            if(numStr.length() > 11) break;
            if(!Character.isDigit(ch) && numStr.length() > 0) break;
            numStr.append(ch);
        }
        if(numStr.length() == 1 && (numStr.charAt(0) == '-' || numStr.charAt(0) == '+')) return 0;
        long num = Long.parseLong(numStr.toString());
        if(num > Integer.MAX_VALUE) num = Integer.MAX_VALUE;
        if(num < Integer.MIN_VALUE) num = Integer.MIN_VALUE;
        return (int) num;
    }
}
