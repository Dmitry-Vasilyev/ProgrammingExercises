package ProgrammingExercises.Hashing.IB_Anagrams;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("cat", "dog", "god", "tca"));
        System.out.println(solution.anagrams(arrayList));
    }
}
