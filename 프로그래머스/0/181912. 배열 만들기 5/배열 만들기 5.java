import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            list.add(intStrs[i].substring(s, s+l));
        }

        for(int i = 0; i < list.size(); i++) {
            int check = Integer.parseInt(list.get(i));
            if(check > k){
                list2.add(check);
            }
        }
        int[] answer = new int[list2.size()];

        for (int i = 0; i < list2.size(); i++) {
            answer[i] = list2.get(i);
        }


        return answer;
    }
}