package ProgrammingExercises.String.LC_StudentAttendanceRecordI_551;
/*
551. Student Attendance Record I
https://leetcode.com/problems/student-attendance-record-i/description/
*/


public class Solution {
    public boolean checkRecord(String s) {
        char[] chArr = s.toCharArray();
        boolean isAbsentAgain = false;
        int lateCoung = 0;

        for(char ch: chArr) {
            if(isAbsentAgain && ch == 'A') return false;

            if(ch == 'A') {
                isAbsentAgain = true;
            }
            if(ch == 'P' || ch == 'A') {
                lateCoung = 0;
            }
            if(ch == 'L') {
                ++lateCoung;
            }
            if(ch == 'L' && lateCoung > 2) {
                return false;
            }
        }
        return true;
    }
}
