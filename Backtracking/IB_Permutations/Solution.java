package ProgrammingExercises.Backtracking.IB_Permutations;
/*
IB_Permutations
https://www.interviewbit.com/problems/permutations/
*/


import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        p(A, new ArrayList<>(), res);
        return res;
    }

    private void p(ArrayList<Integer> a, ArrayList<Integer> r, ArrayList<ArrayList<Integer>> res) {
        if (a.isEmpty()) {
            res.add(r);
        }
        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> na = new ArrayList<>(a);
            ArrayList<Integer> nr = new ArrayList<>(r);
            nr.add(na.remove(i));
            p(na, nr, res);
        }
    }

}