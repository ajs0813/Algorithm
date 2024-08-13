class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            max = Math.max(max, Integer.parseInt(str[i]));
            min = Math.min(min, Integer.parseInt(str[i]));
        }

        answer = min + " " + max;


        return answer;
    }
}