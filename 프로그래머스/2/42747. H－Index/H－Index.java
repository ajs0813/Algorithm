import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int[] check = new int[citations.length];

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            int cnt = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i+1) {
                    cnt++;
                }
            }
            check[i] = cnt;
        }

        for(int i = check.length-1; i >= 0; i--) {
            if( i+1 <= check[i]){
                return i+1;
            }
        }

        return answer;
    }
}
