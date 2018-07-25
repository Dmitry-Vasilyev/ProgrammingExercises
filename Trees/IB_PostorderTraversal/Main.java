package ProgrammingExercises.Trees.IB_PostorderTraversal;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);

        tree.left.left = new TreeNode(4);
        tree.right.right = new TreeNode(5);

        tree.left.left.left = new TreeNode(6);
        tree.right.right.right = new TreeNode(7);

        tree.left.left.left.left = new TreeNode(8); //5
        tree.right.right.right.right = new TreeNode(9);

        System.out.println(solution.postorderTraversal(tree));
    }

}
