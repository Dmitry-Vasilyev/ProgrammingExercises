package ProgrammingExercises.Array.LC_MaxAreaofIsland_695;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int arr[][] = {
                {0,1,1,0,0},
                {1,1,1,0,0},
                {0,0,1,1,1}};

        System.out.println(solution.maxAreaOfIsland(arr));
    }
}
