import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= elements.length; i++) { // 길이 1~5까지 부분 수열 for문
            for(int j = 0; j < elements.length ; j++) { // 시작 점
                int sum = 0;
                for(int k = j; k < j+i; k++) {
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }

        answer = set.size();
        return answer;
    }
}