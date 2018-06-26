package ProgrammingExercises.StacksAndQueues.IB_GenerateallParentheses;
/*
IB_GenerateallParentheses
https://www.interviewbit.com/problems/generate-all-parentheses/
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int isValid(String A) {
        Deque <Character> stack = new ArrayDeque<>();
        for(int i = A.length()-1; i >= 0; --i) {
            stack.push(A.charAt(i));
        }
        int a, b, c;
        a = b = c = 0;
        while (!stack.isEmpty()) {
            Character ch = stack.pop();

            switch (ch) {
                case ']':
                    --a;
                    break;
                case ')':
                    --b;
                    break;
                case '}':
                    --c;
                    break;
                case '[':
                    ++a;
                    break;
                case '(':
                    ++b;
                    break;
                case '{':
                    ++c;
                    break;
            }
        }
        if(a != 0 || b != 0 || c != 0) return 0;
        return 1;
    }
}
