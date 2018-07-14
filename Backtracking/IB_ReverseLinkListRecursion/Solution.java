package ProgrammingExercises.Backtracking.IB_ReverseLinkListRecursion;
/*
IB_ReverseLinkListRecursion
https://www.interviewbit.com/problems/list-cycle/
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode head = A;

        while(head.next != null) {
            head = head.next;
        }
        reverse(A);
        A.next = null;
        return head;
    }

    private ListNode reverse(ListNode a) {
        ListNode curr = null;

        if(a.next == null) return a;

        curr = reverse(a.next);
        curr.next = a;
        return a;
    }

}


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}