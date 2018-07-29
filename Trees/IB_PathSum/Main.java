package ProgrammingExercises.Trees.IB_PathSum;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.left.left = new TreeNode(3);
        tree.left.left.left.left = new TreeNode(3); //12




        tree.right = new TreeNode(3);
        tree.right.right = new TreeNode(7);
        tree.right.right.right = new TreeNode(7);
        tree.right.right.right.right = new TreeNode(7); //25

        System.out.println(solution.hasPathSum(tree, 25));
    }

}
