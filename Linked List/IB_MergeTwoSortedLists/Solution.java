package ProgrammingExercises.LinkedList.IB_MergeTwoSortedLists;
/*
IB_Merge Two Sorted Lists
https://www.interviewbit.com/problems/merge-two-sorted-lists/
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
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head = new ListNode(0);
        ListNode tail = head;

        while(A != null && B != null) {
            if(A.val <= B.val) {
                tail.next = A;
                A = A.next;
            } else {
                tail.next = B;
                B = B.next;
            }
            tail = tail.next;
        }

        if(A != null) {
            tail.next = A;
        } else {
            tail.next = B;
        }
        return head.next;
    }

    private int length(ListNode list) {
        int counter = 0;
        while (list != null) {
            ++counter;
            list = list.next;
        }
        return counter;
    }
}


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(Integer.toString(val));
        ListNode tmp = next;
        while (tmp != null) {
            sb.append(" " + tmp.val);
            tmp = tmp.next;
        }
        return sb.toString();
    }
}