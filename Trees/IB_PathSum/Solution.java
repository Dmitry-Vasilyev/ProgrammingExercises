package ProgrammingExercises.Trees.IB_PathSum;
/*
IB_PathSum
https://www.interviewbit.com/problems/path-sum/
*/

public class Solution {



    public int hasPathSum(TreeNode A, int B) {
        return hasPathSum(A, 0, B);
    }

    public int hasPathSum(TreeNode A, int currSumm, int checkSum) {
        if(A == null) return 0;
        currSumm += A.val;
        if(A.left == null && A.right == null && currSumm == checkSum) return 1;

        return Math.max(hasPathSum(A.left, currSumm, checkSum), hasPathSum(A.right, currSumm, checkSum));
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