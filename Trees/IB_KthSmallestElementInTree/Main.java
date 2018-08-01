package ProgrammingExercises.Trees.IB_KthSmallestElementInTree;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println(solution.kthsmallest(tree, 2));
    }

}
