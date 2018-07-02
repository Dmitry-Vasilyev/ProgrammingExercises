package ProgrammingExercises.LinkedList.IB_SwapListNodesInPairs;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listA = null;
        ListNode tmp = null;

        listA = new ListNode(1);
        tmp = listA;

        for(int i = 2; i < 7; i++) {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        ListNode result = solution.swapPairs(listA);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
