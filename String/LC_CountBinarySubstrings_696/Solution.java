package ProgrammingExercises.String.LC_CountBinarySubstrings_696;
/*
696. Count Binary Substrings
https://leetcode.com/problems/count-binary-substrings/description/
*/


public class Solution {

    public int countBinarySubstrings(String s) {
        int counter = 0;
        int zero = 0;
        int one = 0;
        boolean lustIsZero = false;

        for (int i = 0; i < s.length(); i++) {
            if(zero == 0 && one == 0) {
                if(s.charAt(i) == '0') {
                    ++zero;
                    lustIsZero = true;
                } else {
                    ++one;
                    lustIsZero = false;
                }
                continue;
            }

            if(s.charAt(i) == '1' && !lustIsZero) {
                ++one;
                if(one < zero) {
                    ++counter;
                }
                if(one == zero) {
                    ++counter;
                    zero = 0;
                }
            }
            if(s.charAt(i) == '0' && lustIsZero) {
                ++zero;
                if(one > zero) {
                    ++counter;
                }
                if(one == zero) {
                    ++counter;
                    one = 0;
                }
            }
            if(s.charAt(i) == '1' && lustIsZero) {
                one = 0;
                ++one;
                lustIsZero = false;
                if(zero >= one) {
                    ++counter;
                }
            }
            if(s.charAt(i) == '0' && !lustIsZero) {
                zero = 0;
                ++zero;
                lustIsZero = true;
                if(zero <= one) {
                    ++counter;
                }
            }
        }

        return counter;
    }
}
