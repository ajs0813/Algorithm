class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer;

        for(int i = 0; i< arr.length; i++){ // arr 모든 원소 탐색
            for(int j = 0; j< queries.length; j++){ // 총 3번 돌려서 확인할 것
                if(i>=queries[j][0] && i<=queries[j][1]){ // 인덱스 i는 queries의 0,1행 사이값
                    if(i%queries[j][2] == 0){
                        arr[i] += 1;
                    }
                }
            }
        }

        answer = arr.clone();


        return answer;
    }
}