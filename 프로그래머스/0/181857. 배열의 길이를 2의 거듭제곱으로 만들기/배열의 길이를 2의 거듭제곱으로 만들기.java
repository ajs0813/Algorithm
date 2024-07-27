import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int Pow = 1;

        for (int j = 0; j < arr.length; j++) {
            list.add(arr[j]);
        }

        while (list.size() != Pow) {
            if(list.size() < Pow){
                list.add(0);
            } else if(list.size()>Pow){
                Pow = Pow*2;
            }
        }


        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}