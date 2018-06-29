package ProgrammingExercises.StacksAndQueues.IB_EvaluateExpression;
/*
IB_Simplify Directory Path
https://www.interviewbit.com/problems/simplify-directory-path/
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int evalRPN(String[] A) {
        Deque<Integer> nums = new ArrayDeque<>();
        int a, b;

        for(String item: A) {
            switch (item) {
                case "*":
                    b = nums.pop();
                    a = nums.pop();
                    nums.push(a * b);
                    break;
                case "/":
                    b = nums.pop();
                    a = nums.pop();
                    nums.push(a / b);
                    break;
                case "-":
                    b = nums.pop();
                    a = nums.pop();
                    nums.push(a - b);
                    break;
                case "+":
                    b = nums.pop();
                    a = nums.pop();
                    nums.push(a + b);
                    break;
                default:
                    nums.push(Integer.valueOf(item));
            }
        }
        return nums.pop();
    }

}
