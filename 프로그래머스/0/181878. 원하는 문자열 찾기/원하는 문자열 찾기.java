class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newMyString = myString.toLowerCase();
        String newPat = pat.toLowerCase();

        if(newMyString.contains(newPat)){
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}