package ProgrammingExercises.Array.LC_BestTimetoBuyandSellStockII;
/*
Best Time to Buy and Sell Stock II
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/
*/



public class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }

        return total;
    }
}
