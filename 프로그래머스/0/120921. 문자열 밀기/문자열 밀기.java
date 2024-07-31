import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp = "";
        int count = 1;

        if(A.equals(B)) {
            return 0;
        }

        while(count < A.length()) {
            String[] str = A.split("");
            String[] check = new String[str.length];

            for (int i = 0; i < str.length; i++) {
                if (i < str.length - 1) {
                    check[i + 1] = str[i];
                } else {
                    check[0] = str[str.length - 1];
                }
            }

            A = String.join("", check);

            if (A.equals(B)) {
                return count;
            }

            count++;
        }


        return answer;
    }
}