package ProgrammingExercises.String.LC_JudgeRouteCircle_657;
/*
657. Judge Route Circle
https://leetcode.com/problems/judge-route-circle/description/
*/


import java.util.HashMap;

public class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> steps = new HashMap<>();
        steps.put('U', 0);
        steps.put('D', 0);
        steps.put('L', 0);
        steps.put('R', 0);

        char[] chars = moves.toCharArray();
        for(char ch: chars) {
            steps.put(ch, steps.get(ch) + 1);
        }
        boolean X = steps.get('L').intValue() == steps.get('R').intValue();
        boolean Y = steps.get('U').intValue() == steps.get('D').intValue();
        return  X && Y ;
    }
}
