package ProgrammingExercises.Trees.IB_MinDepthOfBinaryTree;
/*
IB_MinDepthOfBinaryTree
https://www.interviewbit.com/problems/min-depth-of-binary-tree/
*/

public class Solution {



    public int minDepth(TreeNode A) {
        if(A == null) return 0;

        int left = minDepth(A.left);
        int right = minDepth(A.right);

        if(left == 0 && right == 0) return 1;

        if(left == 0) return right + 1;
        if(right == 0) return left + 1;

        return 1 + Math.min(left, right);
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