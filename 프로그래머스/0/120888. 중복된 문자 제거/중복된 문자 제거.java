import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        String[] str = my_string.split("");
        for(int i = 0; i < str.length; i++) {
            if(!(list.contains(str[i]))){
                list.add(str[i]);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }


        return answer;
    }
}