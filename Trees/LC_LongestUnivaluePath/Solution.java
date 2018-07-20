package ProgrammingExercises.Trees.LC_LongestUnivaluePath;
/*
IB_ValidBinarySearchTree
https://www.interviewbit.com/problems/valid-binary-search-tree/
*/

public class Solution {
    int index = 0;
    int prevIndex = 0;
    public int longestUnivaluePath(int[] arr) {
        if(index == arr.length) {
            System.out.println("\nEND");
            return index;
        }
        ++index;
        prevIndex = longestUnivaluePath(arr);
        index--;
        System.out.print(arr[index]+ ":" + prevIndex +  " ");
        return index;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}