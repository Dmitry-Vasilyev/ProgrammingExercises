package ProgrammingExercises.StacksAndQueues.IB_MinStack;
/*
IB_MinStack
https://www.interviewbit.com/problems/min-stack/
*/


import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    private class Node {
        int val;
        int min;
    }

    private Deque<Node> stack = new ArrayDeque<>();

    public void push(int x) {
        Node n = new Node();
        n.val = x;
        n.min = stack.peek() != null ? Math.min(stack.peek().min, n.val) : n.val;
        stack.push(n);
    }

    public void pop() {
        if(stack.peek() != null) stack.pop();
    }

    public int top() {
        return stack.peek() != null ? stack.peek().val : -1;
    }

    public int getMin() {
        return stack.peek() != null ? stack.peek().min : -1;
    }
}
