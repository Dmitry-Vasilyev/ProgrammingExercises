package ProgrammingExercises.Array.LC_ReshapeTheMatrix_566;
/*
566. Reshape the Matrix
https://leetcode.com/problems/reshape-the-matrix/description/
*/

import java.util.LinkedList;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int shapeOld = nums.length * nums[0].length;
        int shapeNew = r * c;
        if(shapeOld != shapeNew) return nums;
        LinkedList<Integer> list = new LinkedList<>();
        for(int[]i: nums) {
            for (int n:i){
                list.add(n);
            }
        }

        int[][] shape = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; ++j) {
                shape[i][j] = list.poll();
            }
        }
        return shape;
    }
}
