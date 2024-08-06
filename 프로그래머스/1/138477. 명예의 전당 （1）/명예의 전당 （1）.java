import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> honorList = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                honorList.add(score[i]);
                min = Math.min(min, score[i]);
                answer[i] = min;
            } else {
                honorList.add(score[i]);
                for (int j = 0; j < honorList.size(); j++) {
                    min = Math.min(min, honorList.get(j));
                }
                for (int x = 0; x < honorList.size(); x++) {
                    if (honorList.get(x) == min) {
                        honorList.remove(x);
                        break;
                    }
                }
                min = Integer.MAX_VALUE;
                for (int z = 0; z < honorList.size(); z++) {
                    min = Math.min(min, honorList.get(z));
                }
                answer[i] = min;
                min = Integer.MAX_VALUE;
            }
        }


        return answer;
    }
}