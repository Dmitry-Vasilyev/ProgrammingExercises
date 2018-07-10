package ProgrammingExercises.Backtracking.IB_ReverseLinkListRecursion;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode A = new ListNode(1);
        ListNode tmp = A;

        for(int i = 2; i < 12; ++i) {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        tmp = A;
        while (tmp != null) {
            System.out.print(tmp + "->");
            tmp = tmp.next;
        }

        System.out.println();

        ListNode res = solution.reverseList(A);

        while (res != null) {
            System.out.print(res + "->");
            res = res.next;
        }


    }
}
