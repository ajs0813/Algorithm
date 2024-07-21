class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 필요한 배열의 길이는 계산 횟수 만큼

        for (int i = 0; i < queries.length; i++) { // 쿼리의 갯수만큼 계산이 이루어짐
            int set = Integer.MAX_VALUE; // 비교용 변수, 최소값을 구하는 로직이기에 비교용으로 최대값을 넣어둠
            for (int j = 0; j < arr.length; j++) { // arr 값을 전부 비교하기 위해 길이만큼 돌림

                if (j >= queries[i][0] && j <= queries[i][1]) { // arr 인덱스 j가 쿼리의 범위 요구를 충족하면

                    if (arr[j] > queries[i][2]) { // 그 값이 쿼리의 비교 숫자보다 큰 가

                        if (arr[j] < set) { // 비교 숫자보다 크다면 그 값은 이전에 세팅된 값보다 작은가?
                            set = arr[j];
                            answer[i] = arr[j];
                        }

                    }
                }
            }

            if(answer[i] == 0){
                answer[i] = -1;
            }
        }


        return answer;
    }
}