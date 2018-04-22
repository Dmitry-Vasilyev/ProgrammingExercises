package ProgrammingExercises.String.LC_RansomNote_383;
/*
383. Ransom Note
https://leetcode.com/problems/ransom-note/description/
*/


import java.util.Hashtable;
import java.util.Set;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] noteArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();

        Hashtable<Character, Integer> noteHT = new Hashtable<>();
        Hashtable<Character, Integer> magazineHT = new Hashtable<>();

        for(Character ch: noteArr) {
            if(noteHT.containsKey(ch)) {
                noteHT.put(ch, noteHT.get(ch) + 1);
            } else {
                noteHT.put(ch, 1);
            }
        }
        for(Character ch: magazineArr) {
            if(magazineHT.containsKey(ch)) {
                magazineHT.put(ch, magazineHT.get(ch) + 1);
            } else {
                magazineHT.put(ch, 1);
            }
        }
        Set<Character> keys = noteHT.keySet();

        for (Character key : keys) {
            Integer noteCount = noteHT.get(key);
            Integer mgznCount = magazineHT.get(key);
            if (mgznCount == null) {
                return false;
            }
            if (mgznCount.intValue() < noteCount.intValue()) return false;
        }
        return true;
    }
}
