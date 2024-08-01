import java.util.*;
class Solution {
    public long[] solution(long x, int n) {

        ArrayList<Long> list = new ArrayList<>();
        long check = x;
        for (int i = 0; i < n; i++) {
            list.add(x);
            x += check;
        }
        long[] answer = new long[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}