package ProgrammingExercises.Math.IB_FizzBuzz;
/*
All Factors
https://www.interviewbit.com/problems/all-factors/
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        StringBuilder str;
        while (i <= A) {
            str = new StringBuilder();
            if(i%3 == 0) str.append("Fizz");
            if(i%5 == 0) str.append("Buzz");
            if(str.length() == 0) str.append(Integer.toString(i));
            list.add(str.toString());
            ++i;
        }
        return list;
    }
}