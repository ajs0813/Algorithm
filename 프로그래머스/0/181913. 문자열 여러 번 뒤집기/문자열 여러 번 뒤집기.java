import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();

        String[] str = my_string.split("");

        for(int i = 0; i<queries.length; i++) {
            for(int j = queries[i][0]; j<=queries[i][1]; j++) {
                list.add(str[j]);
            }
            for(int k = queries[i][0]; k<=queries[i][1]; k++){
                str[k] = list.get((list.size()-1));
                list.remove(list.size()-1);
            }
        }

        answer = String.join("",str);


        return answer;
    }
}