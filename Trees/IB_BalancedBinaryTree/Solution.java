package ProgrammingExercises.Trees.IB_BalancedBinaryTree;
/*
IB_IdenticalBinaryTrees
https://www.interviewbit.com/problems/identical-binary-trees/
*/

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public int isBalanced(TreeNode A) {
        AtomicInteger answer = new AtomicInteger(1);
        isBalanced(A, answer);
        return answer.get();
    }

    public int isBalanced(TreeNode A, AtomicInteger answ) {
        if(A == null) return -1;

        int left = isBalanced(A.left, answ);
        int right = isBalanced(A.right, answ);

        if(Math.abs(left - right) > 1) answ.set(0);

        return Math.max(left, right) + 1;
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