package ProgrammingExercises.Trees.CW_FindMaxValueInTree;
/*
CW_FindMaxValueInTree
http://www.codewars.com/kata/find-max-tree-node/train/java
*/

public class Solution {
    static int findMax(TreeNode  root) {
        if(root == null) return Integer.MIN_VALUE;
        int max = Math.max(findMax(root.left), root.value);
        max = Math.max(findMax(root.right), max);
        return max;
    }



}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        value = x;
        left = null;
        right = null;
    }
}