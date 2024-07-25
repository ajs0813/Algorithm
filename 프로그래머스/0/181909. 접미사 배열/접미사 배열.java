import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> list = new ArrayList<>();
        String[] str = my_string.split("");
        String check = "";
        
        for(int i = 0; i<str.length; i++){
            check = my_string.substring(i, str.length);
            list.add(check);
        }
        String[] answer = new String[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        
        
        return answer;
    }
}