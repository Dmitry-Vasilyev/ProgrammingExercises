package ProgrammingExercises.StacksAndQueues.IB_EvaluateExpression;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
        System.out.println(solution.evalRPN(new String[] {"4", "13", "5", "/", "+"}));

    }
}
