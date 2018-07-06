package ProgrammingExercises.StacksAndQueues.IB_Subtract;
/*
IB_Subtract
https://www.interviewbit.com/problems/subtract/
*/


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {this.val = x; next = null;}
    }

    public ListNode subtract(ListNode A) {
        if(A == null) return null;
        ListNode tmp = A;
        Deque<Integer> stack = new LinkedList<>();
        int length = 0;

        while(tmp != null) {
            ++length;
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        tmp = A;
        for(int i = 0; i < length / 2; i++) {
            tmp.val = stack.pop() - tmp.val;
            tmp = tmp.next;
        }
        return A;
    }

}
