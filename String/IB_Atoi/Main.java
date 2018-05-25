package ProgrammingExercises.String.IB_Atoi;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.atoi("+7"));
        System.out.println(solution.atoi(" 1234 "));
        System.out.println(solution.atoi("qwerty"));
        System.out.println(solution.atoi("gg123"));
        System.out.println(solution.atoi("gg-123"));
        System.out.println(solution.atoi("-123gg"));
        System.out.println(solution.atoi("-999999999999999999999"));
    }
}
