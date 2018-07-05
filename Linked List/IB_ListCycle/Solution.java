package ProgrammingExercises.LinkedList.IB_ListCycle;
/*
IB_ListCycle
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
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ListNode detectCycle(ListNode a) {
        if(a == null) return null;
        ListNode fastRunner = a;
        ListNode slowRunner = a;

        while (fastRunner.next != null && fastRunner.next.next != null) {

            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;

            if(fastRunner == slowRunner) {
                slowRunner = a;
                while (true) {
                    if(fastRunner == slowRunner) return slowRunner;
                    slowRunner = slowRunner.next;
                    fastRunner = fastRunner.next;
                }
            }

        }

        return null;
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