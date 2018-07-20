package ProgrammingExercises.Trees.CW_FindMaxValueInTree;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(5);

        System.out.print(Solution.findMax(treeNode));


    }
}
