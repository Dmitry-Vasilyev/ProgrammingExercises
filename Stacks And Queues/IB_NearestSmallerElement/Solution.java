package ProgrammingExercises.StacksAndQueues.IB_NearestSmallerElement;
/*
IB_NearestSmallerElement
https://www.interviewbit.com/problems/nearest-smaller-element/
*/

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> retval=new ArrayList<>();
        Stack<Integer> st=new Stack<Integer>();

        for(int i=0;i<arr.size();++i){
            while(!st.isEmpty() && arr.get(i)<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                retval.add(-1);
            }
            else{
                retval.add(st.peek());
            }
            st.add(arr.get(i));
        }

        return retval;
    }
}
