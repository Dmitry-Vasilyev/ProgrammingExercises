package ProgrammingExercises.StacksAndQueues.IB_SimplifyDirectoryPath;
/*
IB_Simplify Directory Path
https://www.interviewbit.com/problems/simplify-directory-path/
*/


import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public String simplifyPath(String A) {
        Deque<String> path = new ArrayDeque<>(A.length());
        StringBuilder command = new StringBuilder();
        command.append("/");

        for(int i = 0; i < A.length(); i++) {
            if(A.length() == 0) break;
            char ch = A.charAt(i);
            String curCom = command.toString();

            if(ch == '/') {
                if(command.length() == 0) command.append(ch);

                if(curCom.equals("/")) continue;
                else if(curCom.equals("/.")) command = new StringBuilder().append(ch);
                else if(curCom.equals("/..")) {
                    if(path.size() > 0) {
                        path.pop();
                        command = new StringBuilder().append(ch);
                    } else {
                        command = new StringBuilder().append("/");
                    }
                } else {
                    path.push(curCom);
                    command = new StringBuilder().append(ch);
                }
            } else {
                command.append(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(path.isEmpty() && command.length() == 0) path.push("/");
        else if(command.toString().equals("/.") || command.toString().equals("/")) command = new StringBuilder();
        else if(command.toString().equals("/..")) {
            if(path.size() > 1) {
                path.pop();
            }
        } else {
            path.push(command.toString());
        }
        if(path.isEmpty()) path.push("/");
        while (!path.isEmpty()) sb.append(path.removeLast());
        return sb.toString();
    }

}
