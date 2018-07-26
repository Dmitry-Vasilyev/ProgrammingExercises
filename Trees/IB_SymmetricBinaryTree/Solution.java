package ProgrammingExercises.Trees.IB_SymmetricBinaryTree;
/*
IB_SymmetricBinaryTree
https://www.interviewbit.com/problems/symmetric-binary-tree/
*/

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public int isSymmetric(TreeNode A) {
        if(A == null) return 0;
        return isSameTree(A.left, A.right);


    }

    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null) return 1;

        if(A == null || B == null) return 0;

        if(A.val != B.val) return 0;

        if(Math.min(isSameTree(A.left, B.right), isSameTree(A.right, B.left)) != 0)
            return 1;

        return 0;
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