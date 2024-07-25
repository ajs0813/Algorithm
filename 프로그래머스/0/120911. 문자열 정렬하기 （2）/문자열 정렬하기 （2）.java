import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";

        my_string = my_string.toLowerCase();

        String[] str = my_string.split("");

        Arrays.sort(str);

        answer = String.join("",str);

        return answer;
    }
}