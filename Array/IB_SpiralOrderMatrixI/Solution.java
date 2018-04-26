package ProgrammingExercises.Array.IB_SpiralOrderMatrixI;
/*
Spiral Order Matrix I
https://www.interviewbit.com/problems/spiral-order-matrix-i/
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
//        Грани матрицы по которым мы будем прходить и затем уменьшать размер грани на 1
        int T = 0; int B = A.size()-1;
        int L = 0; int R = A.get(0).size()-1;
//        Направления нашего движения 0 ->, 1 - down и т. д.
        int dir = 0;

        while(T <= B && L <= R) {
            if(dir == 0) {
                for(int i = L; i <= R; i++) result.add(A.get(T).get(i));
                T++;
            } else if(dir == 1) {
                for(int i = T; i <= B; i++) result.add(A.get(i).get(R));
                R--;
            } else if (dir == 2) {
                for(int i = R; i >= L; i--) result.add(A.get(B).get(i));
                B--;
            } else if (dir == 3) {
                for(int i = B; i >= T; i--) result.add(A.get(i).get(L));
                L++;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}