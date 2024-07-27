import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ;

        if (myStr.contains("a")) {
            myStr = myStr.replace("a", " ");
        }
        if (myStr.contains("b")) {
            myStr = myStr.replace("b", " ");
        }
        if (myStr.contains("c")) {
            myStr = myStr.replace("c", " ");
        }

        String[] str = myStr.split(" ");

       ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if(!str[i].isBlank()){
                list.add(str[i]);
            }
        }

        if(str.length == 0){
            list.add("EMPTY");
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }



        return answer;
    }
}