package ProgrammingExercises.Trees.IB_SymmetricBinaryTree;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree = new TreeNode(0);

        tree.left = new TreeNode(4);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(4);
        tree.left.left.left.left = new TreeNode(4); //5




        tree.right = new TreeNode(4);
        tree.right.right = new TreeNode(4);
        tree.right.right.right = new TreeNode(4);
        tree.right.right.right.right = new TreeNode(4);

        System.out.println(solution.isSymmetric(tree));
    }

}
