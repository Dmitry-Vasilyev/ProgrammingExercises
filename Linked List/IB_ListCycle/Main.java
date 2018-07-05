package ProgrammingExercises.LinkedList.IB_ListCycle;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode A = new ListNode(1);
        ListNode tmp = A;

        for(int i = 2; i < 12; ++i) {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }

        tmp.next = null;
        ListNode res = solution.detectCycle(A);

        System.out.println(res == null ? "null" : res.val);
    }
}
