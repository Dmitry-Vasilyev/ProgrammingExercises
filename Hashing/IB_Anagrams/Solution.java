package ProgrammingExercises.Hashing.IB_Anagrams;
/*
IB_Anagrams
https://www.interviewbit.com/problems/anagrams/
*/


import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < A.size(); i++) {
            char[] chars = A.get(i).toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);

            if(map.containsKey(word)) {
                map.get(word).add(i+1);
            } else {
                map.put(word, new ArrayList<>(Collections.singletonList(i+1)));
            }
        }

        return new ArrayList<>(map.values());
    }
}