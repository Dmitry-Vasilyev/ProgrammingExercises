package ProgrammingExercises.Trees.IB_IdenticalBinaryTrees;
/*
IB_IdenticalBinaryTrees
https://www.interviewbit.com/problems/identical-binary-trees/
*/

public class Solution {



    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null) return 1;

        if(A == null || B == null) return 0;

        if(A.val != B.val) return 0;

        if(Math.min(isSameTree(A.left, B.left), isSameTree(A.right, B.right)) != 0)
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