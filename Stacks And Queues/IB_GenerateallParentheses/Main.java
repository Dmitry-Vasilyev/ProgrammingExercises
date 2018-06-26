package ProgrammingExercises.StacksAndQueues.IB_GenerateallParentheses;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("{}[]()"));
        System.out.println(solution.isValid("}"));
    }
}
