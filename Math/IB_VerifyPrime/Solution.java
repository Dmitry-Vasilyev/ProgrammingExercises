package ProgrammingExercises.Math.IB_VerifyPrime;
/*
Verify Prime
https://www.interviewbit.com/problems/verify-prime/
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int isPrime(int A) {
        if(A == 1) return 0;
        for(int i = 2; i <= Math.sqrt(A); ++i) {
            if(A%i == 0) return 0;
        }
        return 1;
    }
}