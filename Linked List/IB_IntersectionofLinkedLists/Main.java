package ProgrammingExercises.LinkedList.IB_IntersectionofLinkedLists;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode tmp = null;
        ListNode listA = null;
        ListNode listB = null;

        for(int i = 1; i < 6; i++) {
            if(tmp == null) {
                tmp = new ListNode(i);
                listA = tmp;
                continue;
            }
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        tmp = null;
        for(int i = 6; i < 9; i++) {
            if(tmp == null) {
                tmp = new ListNode(i);
                listB = tmp;
                continue;
            }
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        tmp.next = listA.next.next;
        tmp = listB;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }

        System.out.println(solution.getIntersectionNode(listA, listB).val);
    }
}
