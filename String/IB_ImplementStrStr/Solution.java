package ProgrammingExercises.String.IB_ImplementStrStr;
/*
IB_Implement StrStr
https://www.interviewbit.com/problems/implement-strstr/
*/


public class Solution {
    public int strStr(final String A, final String B) {
        int pi[] = getPi(B);
        int i = 0;
        int j = 0;
        while (i < A.length()){
            if(A.charAt(i) == B.charAt(j)) {
                i++;
                j++;
                if(j == B.length()) return i - j;
            } else if(j == 0){
                i++;
                if(i == A.length()) return -1;
            } else {
                j = pi[j-1];
            }
        }
        return -1;
    }

    private int[] getPi(String A) {
        int[] pi = new int[A.length()];
        pi[0] = 0;
        int i = 1;
        int j = 0;

        while(i < A.length()) {
            if(A.charAt(i) == A.charAt(j)) {
                pi[i] = j+1;
                j++;
                i++;
            } else {
                pi[i] = 0;
                i++;
                if(j == 0) continue;
                j = pi[j-1];
            }
        }
        return pi;
    }
}
