package ProgrammingExercises.LinkedList.IB_SwapListNodesInPairs;
/*
IB_SwapListNodesInPairs
https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/
*/

import java.util.List;

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
    public ListNode swapPairs(ListNode A) {
        ListNode prev = null;
        ListNode next = A;
        ListNode first = A;
        ListNode second;
        ListNode head;
        if(next.next != null) head = next.next;
        else head = next;

        while (next != null && next.next != null) {
            next = first.next.next;
            second = first.next;
            second.next = first;
            if(prev != null) {
                prev.next = second;
            }
            prev = first;
            first.next = next;
            first = next;
        }
        return head;
    }
}


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }


}

