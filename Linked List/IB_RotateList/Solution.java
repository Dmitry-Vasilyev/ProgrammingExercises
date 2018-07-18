package ProgrammingExercises.LinkedList.IB_RotateList;
/*
IB_RotateList
https://www.interviewbit.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode A, int B) {
        int listLength = length(A);

        ListNode tail = A;
        ListNode head;
        ListNode result = A;

        for(int i = 0; i < listLength - B % listLength - 1; i++) {
            tail = tail.next;
        }
        if(listLength > 1 && B % listLength != 0) {
            result = tail.next;

            head = tail;
            while (head.next != null) head = head.next;

            head.next = A;
            tail.next = null;
        }
        return result;
    }

    private int length(ListNode A) {
        ListNode tmp = A;
        int counter = 0;

        while (tmp != null) {
            counter++;
            tmp = tmp.next;
        }
        return counter;
    }
}


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }


}

