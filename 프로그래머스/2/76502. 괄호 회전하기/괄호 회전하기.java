import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = -1;

        Stack<String> stack = new Stack<>();
        int cnt = 0;


        for (int j = 0; j < s.length(); j++) {

            String[] str = s.split("");

            for (int i = 0; i < str.length; i++) {

                if (stack.isEmpty()) {
                    stack.push(str[i]);
                } else if (stack.peek().equals("[") && str[i].equals("]")) {
                    stack.pop();
                } else if (stack.peek().equals("(") && str[i].equals(")")) {
                    stack.pop();
                } else if (stack.peek().equals("{") && str[i].equals("}")) {
                    stack.pop();
                } else {
                    stack.push(str[i]);
                }
            }

            if (stack.isEmpty()) {
                cnt++;
            }

            String temp = s.substring(0, 1);
            s = s.substring(1) + temp;
            stack.clear();

        }

        answer = cnt;

        return answer;
    }
}