package ProgrammingExercises.StacksAndQueues.IB_Subtract;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.simplifyPath("/../"));
        System.out.println(solution.simplifyPath("/1/2/3/4"));
        System.out.println(solution.simplifyPath("/1dasd"));
        System.out.println(solution.simplifyPath("/a/./b/../../c/"));
        System.out.println(solution.simplifyPath("/asda/../..jkk/.."));
        System.out.println(solution.simplifyPath("/../.."));
        System.out.println(solution.simplifyPath("/../.."));


    }
}
