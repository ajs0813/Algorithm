class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int check = 0;
        int[] lengths = new int[31];

        for(int i = 0; i < strArr.length; i++) {
            check = strArr[i].length();
            lengths[check]++;
        }

        int Max = Integer.MIN_VALUE;

        for(int i = 0; i < lengths.length; i++) {
            Max = Math.max(Max, lengths[i]);
        }

        answer = Max;

        return answer;
    }
}