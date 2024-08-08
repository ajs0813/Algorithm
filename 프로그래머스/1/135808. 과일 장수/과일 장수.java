import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 점수 배열을 내림차순으로 정렬
        Arrays.sort(score);

        // 가장 높은 점수부터 한 상자에 담을 사과들을 선택
        for(int i = score.length -m; i >=0; i-=m){
            // 현재 상자의 최저 점수는 i번째 사과의 점수
            answer += score[i] * m;
        }


        return answer;
    }
}