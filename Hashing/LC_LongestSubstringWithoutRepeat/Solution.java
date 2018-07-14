package ProgrammingExercises.Hashing.LC_LongestSubstringWithoutRepeat;
/*
LC_LongestSubstringWithoutRepeat
https://www.interviewbit.com/problems/longest-substring-without-repeat/
*/


import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class Solution {
    public int lengthOfLongestSubstring(String A) {
        HashSet<Character> hashSet = new HashSet<Character>();
        int maxCount = 0;
        int start = 0;
        for(char c : A.toCharArray()){
            while(hashSet.contains(c)){
                hashSet.remove(A.charAt(start));
                start++;
            }
            hashSet.add(c);
            maxCount = Math.max(maxCount, hashSet.size());
        }

        return maxCount;
    }
}