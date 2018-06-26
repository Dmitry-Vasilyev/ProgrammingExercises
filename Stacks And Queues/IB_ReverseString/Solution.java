package ProgrammingExercises.StacksAndQueues.IB_ReverseString;
/*
IB_Reverse String
https://www.interviewbit.com/problems/reverse-string/
*/

public class Solution {

    public String reverseString(String A) {
        Stack<Character> rev = new Stack<>();
        for(int i = 0; i < A.length(); i++) {
            rev.push(A.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i = A.length()-1; i >= 0; i--) {
            sb.append(rev.pop());
        }
        return sb.toString();
    }

}
class Stack<E> {

    private Node top = null;

    void push(E n) {
        Node temp = new Node(n);
        temp.next = top;
        top = temp;
    }
    E pop() {
        Node temp = top;
        top = temp.next;
        return temp.data;
    }
    public E peek() {
        return top.data;
    }

    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
