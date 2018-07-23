package ProgrammingExercises.Trees.IB_MinDepthOfBinaryTree;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.left.left = new TreeNode(3);
        tree.left.left.left.left = new TreeNode(3); //5




//        tree.right = new TreeNode(3);
//        tree.right.right = new TreeNode(7);
//        tree.right.right.right = new TreeNode(7);
//        tree.right.right.right.right = new TreeNode(7);

        System.out.println(solution.minDepth(tree));
    }

}
