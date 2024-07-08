import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        int a = 0;
        for (int i = 1; i <= n; i++) {
            a = k * i;
            if (a <= n) {
                list.add(k * i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}