package ProgrammingExercises.Heaps.IB_MagicianandChocolates;
/*
IB_MagicianandChocolates
https://www.interviewbit.com/problems/magician-and-chocolates/
*/

import java.util.ArrayList;

public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        long counter = 0;
        int allEmpty = 0;
        int times = 0;
        int bag = 0;

        while(allEmpty < B.size() && times < A) {
            bag = times % B.size();
            counter += B.get(bag);
            B.set(bag, mgc(B.get(bag)));
            ++times;
            if(B.get(bag) == 0) ++allEmpty;
        }
        return (int) (counter % (Math.pow(10, 9) + 7));
    }

    private int mgc(int i) {
        return i/2;
    }
}