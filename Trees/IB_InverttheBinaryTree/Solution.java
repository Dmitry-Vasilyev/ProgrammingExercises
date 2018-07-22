package ProgrammingExercises.Trees.IB_InverttheBinaryTree;
/*
IB_InverttheBinaryTree
https://www.interviewbit.com/problems/invert-the-binary-tree/
*/

import java.util.*;

public class Solution {



    public TreeNode invertTree(TreeNode A) {

        if(A == null) return A;

        TreeNode tmp = A.left;
        A.left = A.right;
        A.right = tmp;

        invertTree(A.left);
        invertTree(A.right);

        return A;
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