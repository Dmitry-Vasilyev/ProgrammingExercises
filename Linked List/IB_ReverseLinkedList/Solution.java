package ProgrammingExercises.LinkedList.IB_ReverseLinkedList;
/*
Intersection of Linked Lists
https://www.interviewbit.com/problems/intersection-of-linked-lists/
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
    public ListNode reverseList(ListNode A) {
        int length = length(A);
        ListNode next = null, current = A, prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
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
}