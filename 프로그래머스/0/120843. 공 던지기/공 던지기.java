class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int currentIndex = 0; // 현재 던지는 사람의 인덱스

        for(int i = 1; i <= k; i++){ // 공 던지는 횟수

             if(i == k){ // 공 던지는 횟수가 k번째 일 때
                 answer = numbers[currentIndex]; // numbers의 현재 인덱스 사람이 정답
             }

            // 현재 던지는 사람의 인덱스는 오른쪽으로 한 명을 건너뛰고 공을 던지므로 +2
            // 배열을 초과할 경우 배열의 길이 값만큼 나눠서 나머지를 반환하면
            // 문제가 요구하는 던지는 사람의 인덱스를 반환 가능
            // 이걸 어떻게 생각해내지?
            currentIndex = (currentIndex + 2) % numbers.length;
        }


        return answer;
    }
}