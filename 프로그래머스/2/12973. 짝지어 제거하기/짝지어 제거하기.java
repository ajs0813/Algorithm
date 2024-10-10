import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 스택이 비어 있지 않고, 스택의 최상단 문자와 현재 문자가 같으면 제거
            if(!stack.isEmpty() && stack.peek() == current){
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        if(stack.isEmpty()){
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}