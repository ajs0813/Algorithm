class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String check = "";
        for (int i = 0; i < myString.length(); i++) {
            check = myString.substring(0, myString.length() - i);
            if(check.endsWith(pat)){
                answer = check;
                break;
            }
        }

        return answer;
    }
}