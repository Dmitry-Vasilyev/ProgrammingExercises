package ProgrammingExercises.Trees.IB_PostorderTraversal;
/*
IB_PostorderTraversal
https://www.interviewbit.com/problems/postorder-traversal/
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        TreeNode curr = A;

        if(A == null) return new ArrayList<>();

        stack.push(A);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            list.addFirst(curr.val);
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
        }


        return new ArrayList<>(list);
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