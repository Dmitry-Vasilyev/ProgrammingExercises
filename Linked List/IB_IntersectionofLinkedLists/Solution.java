package ProgrammingExercises.LinkedList.IB_IntersectionofLinkedLists;
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
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        int n = length(a);
        int m = length(b);
        int d = n - m;

        if(n < m) {
            ListNode tmp = a;
            a = b;
            b = tmp;
            d = m - n;
        }
        for(int i = 0; i < d; i++) {
            a = a.next;
        }
        while(a != null) {
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
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