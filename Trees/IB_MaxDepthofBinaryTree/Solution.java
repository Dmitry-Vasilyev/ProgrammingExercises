package ProgrammingExercises.Trees.IB_MaxDepthofBinaryTree;
/*
IB_MaxDepthofBinaryTree
https://www.interviewbit.com/problems/max-depth-of-binary-tree/
*/

public class Solution {



    public int maxDepth(TreeNode A) {
        if(A == null) return 0;

        return 1 + Math.max(maxDepth(A.left), maxDepth(A.right));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
     val = x;
     left=null;
     right=null;
     }

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}