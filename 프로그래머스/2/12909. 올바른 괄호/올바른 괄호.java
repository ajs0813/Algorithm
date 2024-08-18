import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c); // 열린 괄호를 스택에 추가
            } else {
                if (stack.isEmpty()) {
                    return false; // 닫는 괄호가 나왔을 때 스택이 비어 있으면 올바르지 않은 괄호
                }
                stack.pop(); // 열린 괄호가 있으면 닫는 괄호와 짝을 맞춤
            }
        }

        return stack.isEmpty(); // 스택이 비어 있으면 모든 괄호가 올바르게 짝지어진 것
    }
}