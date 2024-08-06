import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < food.length; i++) {
            if(i!=0 && food[i]%2 ==1){
                food[i] = food[i]-1;
            }
        }

        for (int i = 1; i < food.length; i++) {
            for(int j=0; j<food[i]/2;j++){
                list.add(i);
            }
        }

        list.add(0);

        for(int i = food.length-1; i>0; i--){
            for(int j=0; j<food[i]/2;j++){
                list.add(i);
            }
        }

        for(int i=0; i<list.size(); i++){
            answer += Integer.toString(list.get(i));
        }

        return answer;
    }
}