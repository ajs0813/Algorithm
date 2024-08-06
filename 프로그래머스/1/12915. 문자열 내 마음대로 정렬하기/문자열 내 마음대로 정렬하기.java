import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] check  = new String[strings.length];

        for(int i = 0; i < strings.length; i++) {
            check[i] = strings[i].charAt(n) +"";
        }

        Arrays.sort(check);

        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j < check.length; j++) {
                if(Character.toString(strings[i].charAt(n)).equals(check[j]) && answer[j] == null){
                    answer[j] = strings[i];
                    break;
                }
            }
        }

        for(int i = 0; i < answer.length-1; i++) {
            String temp = "";
            for(int j = i+1; j < answer.length; j++) {
                if(answer[i].charAt(n) == answer[j].charAt(n) && answer[i].compareTo(answer[j]) > 0) {
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }
}