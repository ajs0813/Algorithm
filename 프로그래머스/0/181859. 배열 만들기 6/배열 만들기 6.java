import java.util.*;
class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> skt = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (skt.isEmpty()) {
                skt.add(arr[i]);
            } else if (skt.get(skt.size() - 1) == arr[i]) {
                skt.remove(skt.size() - 1);
            } else if (skt.get(skt.size() - 1) != arr[i]) {
                skt.add(arr[i]);
            }
        }

        if(skt.size() == 0){
            skt.add(-1);
        }

        int[] answer = new int[skt.size()];

        for(int i = 0; i < skt.size(); i++) {
            answer[i] = skt.get(i);
        }


        return answer;
    }
}