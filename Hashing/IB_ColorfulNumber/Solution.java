package ProgrammingExercises.Hashing.IB_ColorfulNumber;
/*
IB_DiffkII
https://www.interviewbit.com/problems/diffk-ii/
*/

import java.util.HashSet;
import java.util.List;

public class Solution {
    public int colorful(int A) {
        int[] numbers = new int[numLength(A)];
        int tmpNum = A;
        HashSet<Integer> set = new HashSet<>();

        for(int i = numbers.length-1; i >= 0; --i) {
            numbers[i] = tmpNum%10;
            tmpNum = tmpNum / 10;
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length - i; j++) {
                int num = numbers[j];
                for(int z = 1; z <= i; z++) {
                    num *= numbers[j+z];
                }
                if(set.contains(num)) return 0;
                set.add(num);
            }
        }

        return 1;
    }

    private int numLength(int num) {
        int length = 0;
        if(num == 0) return 1;
        while (num != 0) {
            ++length;
            num = num / 10;
        }

        return length;
    }
}