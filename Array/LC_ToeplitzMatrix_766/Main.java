package ProgrammingExercises.Array.LC_ToeplitzMatrix_766;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[][] = {
                {1,2,3,4},
                {5,1,2,3},
                {6,5,1,2},
                {7,6,5,1}
        };
        System.out.println(solution.isToeplitzMatrix(arr));
    }
}
