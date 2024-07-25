import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(j>=intervals[i][0] && j<=intervals[i][1]) {
                    list.add(arr[j]);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}