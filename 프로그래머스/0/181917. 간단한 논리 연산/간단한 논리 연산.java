class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        boolean check1 =true;
        boolean check2 = true;

        check1 = x1 || x2;
        check2 = x3 || x4;

        answer = check1 && check2;

        return answer;
    }
}