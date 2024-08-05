import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <='z'){
                // 소문자 처리
                char shifted = (char)(ch+n);
                if(shifted > 'z') {
                    shifted -= 26; // z를 넘어가면 a로 돌아오기
                }
                sb.append(shifted);
            } else if (ch>='A' && ch <= 'Z'){
                // 대문자 처리
                char shifted = (char)(ch+n);
                if(shifted > 'Z'){
                    shifted -= 26; // Z를 넘가면 A로 돌아오기
                }
                sb.append(shifted);
            } else {
                // 공백 처리
                sb.append(ch);
            }
        }

        answer = sb.toString();


        return answer;
    }
}