import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        while (true) {

            list.add((list.get(list.size() - 1) + list.get(list.size() - 2)) % 1234567);

            cnt++;

            if (cnt == n) {
                break;
            }
        }

        answer = list.get(list.size() - 1);


        return answer;
    }
}