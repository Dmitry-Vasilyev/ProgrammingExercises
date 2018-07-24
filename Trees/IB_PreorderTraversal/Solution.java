package ProgrammingExercises.Trees.IB_PreorderTraversal;
/*
IB_PreorderTraversal
https://www.interviewbit.com/problems/preorder-traversal/
*/

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = A;

        if(A == null) return arr;

        stack.push(A);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            arr.add(curr.val);

            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
        }

        return arr;
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