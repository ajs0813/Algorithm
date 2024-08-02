class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6){
            answer = false;
        }

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(!Character.isDigit(chars[i])){
                answer = false;
            }
        }

        return answer;
    }
}