package ProgrammingExercises.Hashing.IB_ValidSudoku;
/*
IB_DiffkII
https://www.interviewbit.com/problems/diffk-ii/
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int isValidSudoku(final List<String> A) {
        ArrayList<HashSet<Character>> vertical = new ArrayList<>();
        ArrayList<ArrayList<HashSet<Character>>> circle = new ArrayList<>();
        int y = 2;
        for(int i = 0; i < A.size(); i++) {
            HashSet<Character> horizontal = new HashSet<>();
            //System.out.println();
            int x = 2;
            if(i%3 == 0) y = (y + 1) % 3;
            if(y == 0) circle.add(new ArrayList<>());
            for(int j = 0; j < A.size(); j++) {
                Character curr = A.get(i).charAt(j);
                //System.out.print(curr + " ");
                //HORIZONTAL CHECK
                if(horizontal.contains(curr)) return 0;
                else if(!curr.equals('.'))horizontal.add(curr);

                //VERTICAL CHECK
                if(i == 0) {
                    if (curr.equals('.')) {
                        vertical.add(new HashSet<>());
                    } else {
                        vertical.add(new HashSet<>(Collections.singletonList(curr)));
                    }
                }
                else if(vertical.get(j).contains(curr)) return 0;
                else if(!curr.equals('.')) vertical.get(j).add(curr);
                //CIRCLE CHECK
                if(j%3 == 0) x = (x + 1) % 3;
                if(x == 0 && i%3 == 0) circle.get(y).add(new HashSet<>());
                if(circle.get(y).get(x).contains(curr)) return 0;
                else if(!curr.equals('.')) circle.get(y).get(x).add(curr);
            }
        }
        return 1;
    }
}