import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<>();
        String str = "";

        for (int i = 0; i < t.length() - p.length() +1; i++) {
            for(int j = 0; j < p.length(); j++) {
                str += t.charAt(j+i);
                if(str.length() == p.length()) {
                    list.add(str);
                    str = "";
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(Long.parseLong(list.get(i)) <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}