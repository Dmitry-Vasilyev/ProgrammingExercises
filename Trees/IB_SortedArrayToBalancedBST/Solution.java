package ProgrammingExercises.Trees.IB_SortedArrayToBalancedBST;
/*
IB_SortedArrayToBalancedBST
https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public TreeNode sortedArrayToBST(final List<Integer> a) {

        int mid = a.size() / 2;

        if(a.size()%2 == 1) ++mid;

        return makeNode(a, 1, mid, a.size());
    }

    private TreeNode makeNode(List<Integer> list, int left, int mid, int right) {
        if(mid == 0) return null;

        TreeNode node = new TreeNode(list.get(mid - 1));

        int range = mid - left;
        if(range % 2 == 1) range++;
        int newMid = mid - range / 2;
        if(range == 0) newMid = 0;
        node.left = makeNode(list, left, newMid, mid - 1);

        range = right - mid;
        if(range % 2 == 1) range++;
        newMid = range / 2 + mid;
        if(range == 0) newMid = 0;
        node.right = makeNode(list, mid + 1, newMid, right);

        return node;
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