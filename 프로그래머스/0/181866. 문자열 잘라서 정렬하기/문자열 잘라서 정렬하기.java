import java.util.*;
class Solution {
    public String[] solution(String myString) {
        
        String[] test = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < test.length; i++) {
            if(!test[i].isBlank()){
                list.add(test[i]);
            }
        }

        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        



        return answer;
    }
}