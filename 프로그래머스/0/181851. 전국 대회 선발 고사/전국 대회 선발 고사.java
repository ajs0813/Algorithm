import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            list.add(rank[i]);
            if (!attendance[i]) {
                rank[i] = 0;
            }
        }

        Arrays.sort(rank);

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < list.size(); i++) {
            a = list.indexOf(rank[i]);

            if (a >= 0) {
                rank[i] = 0;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            b = list.indexOf(rank[i]);
            if (b >= 0) {
                rank[i] = 0;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            c = list.indexOf(rank[i]);
            if (c >= 0) {
                rank[i] = 0;
                break;
            }
        }

        answer = 10000 * a + 100 * b + c;


        return answer;
    }
}