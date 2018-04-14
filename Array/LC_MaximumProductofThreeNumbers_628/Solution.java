package ProgrammingExercises.Array.LC_MaxAreaofIsland_695;
/*
695. Max Area of Island
https://leetcode.com/problems/max-area-of-island/description/
*/

public class Solution {

    private boolean [][]seen;
    private int [][]grid;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        seen = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                count = Math.max(count, dfs(i, j));
            }
        }
        return count;
    }

    private int dfs(int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || seen[i][j] || grid[i][j] == 0) {
            return 0;
        }
        seen[i][j] = true;
        return 1 + dfs(i-1, j) + dfs(i, j-1) + dfs(i+1, j) + dfs(i, j+1);
    }
}
