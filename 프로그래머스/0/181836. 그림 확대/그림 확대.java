import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            String temp = "";
            for (int j = 0; j < picture[i].length(); j++) {
                for (int x =0; x<k; x++) {
                    temp += picture[i].charAt(j);
                }
            }

            for(int a = 0; a < k; a++){
                list.add(temp);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}