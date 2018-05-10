package ProgrammingExercises.String.IB_LengthOfLastWord;
/*
Length Of Last Word IB
https://www.interviewbit.com/problems/length-of-last-word/
*/


public class Solution {

    public int lengthOfLastWord(final String A) {
        int counter = 0;

        for(int i = A.length() - 1; i >= 0; i--) {
            if(counter == 0 && A.charAt(i) == ' ') continue;
            if(A.charAt(i) == ' ') return counter;
            counter++;
        }
        return counter;
    }
}
