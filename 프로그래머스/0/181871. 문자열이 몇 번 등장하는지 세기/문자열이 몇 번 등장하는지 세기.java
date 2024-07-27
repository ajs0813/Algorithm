class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        for (int i = 0; i < myString.length() - pat.length() +1; i++) {
            str = myString.substring(i, i+pat.length());
            if(str.contains(pat)){
                answer++;
            }
        }

        return answer;
    }
}