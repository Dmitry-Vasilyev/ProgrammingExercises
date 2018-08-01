package ProgrammingExercises.Trees.IB_KthSmallestElementInTree;
/*
IB_InverttheBinaryTree
https://www.interviewbit.com/problems/invert-the-binary-tree/
*/

public class Solution {

    Integer curK = 0;

    public int kthsmallest(TreeNode A, int B) {
        if(A == null) return -1;

        int left = kthsmallest(A.left, B);

        if(left != -1) return left;

        curK++;

        if(B == curK) return A.val;

        return kthsmallest(A.right, B);
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