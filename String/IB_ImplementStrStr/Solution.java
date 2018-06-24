package ProgrammingExercises.String.IB_ImplementStrStr;
/*
IB_Implement StrStr
https://www.interviewbit.com/problems/implement-strstr/
*/


public class Solution {
    public int strStr(final String A, final String B) {
        if(A.length() == 0 || B.length() == 0) return -1;
        int counter = 0;
        for(int i = 0; i < A.length() - B.length() + 1; i++) {
            while(A.charAt(i + counter) == B.charAt(counter)) {
                counter++;
                if(counter == B.length()) return i;
            }
            counter = 0;
        }
        return -1;
    }
}
