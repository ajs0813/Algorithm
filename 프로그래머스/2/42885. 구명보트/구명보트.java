import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        ArrayList<Integer> list = new ArrayList<>();

        for(int lists : people){
            list.add(lists);
        }

        while(!list.isEmpty()){
            if(list.get(0) + list.get(list.size()-1) <= limit && list.size() != 1){
                list.remove(0);
                list.remove(list.size()-1);
                answer++;
            } else {
                list.remove(list.size()-1);
                answer++;
            }
        }

        return answer;
    }
}