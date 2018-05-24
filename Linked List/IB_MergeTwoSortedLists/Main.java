package ProgrammingExercises.LinkedList.IB_MergeTwoSortedLists;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode tmp = null;
        ListNode listA = null;
        ListNode listB = null;

        for(int i = 1; i < 13; i++) {
            if(i%2 != 1)continue;
            if(tmp == null) {
                tmp = new ListNode(i);
                listA = tmp;
                continue;
            }
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        tmp = null;
        for(int i = 2; i < 12; i++) {
            if(i%2 != 0) continue;
            if(tmp == null) {
                tmp = new ListNode(i);
                listB = tmp;
                continue;
            }
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        System.out.println(listA);
        System.out.println(listB);

        System.out.println(solution.mergeTwoLists(listA, listB));

        System.out.println();
    }
}
