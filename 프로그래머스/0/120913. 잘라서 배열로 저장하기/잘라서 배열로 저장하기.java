import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {

        ArrayList<String> list = new ArrayList<>();
        String[] str = my_str.split("");
        String check = "";

        for (int i = 0; i < str.length; i++) {
            check += str[i];
            if (check.length() >= n) {
                list.add(check);
                check = "";
            }
        }

        if(check.length() > 0) {
            list.add(check);
        }


        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i);

        }


        return answer;
    }
}