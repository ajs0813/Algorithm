class Solution {
    public int[] solution(int[] numlist, int n) {
        // 배열을 복사해서 사용
        int[] answer = numlist.clone();

        // 버블 정렬을 사용하여 정렬
        for(int i = 0; i<answer.length-1; i++){
            for(int j = 0; j<answer.length -1 -i; j++){
                int diff1 = Math.abs(answer[j] - n);
                int diff2 = Math.abs(answer[j+1] -n);

                // 거리가 같다면 더 큰 수가 앞에 오도록
                if(diff1>diff2 || (diff1 == diff2 && answer[j] < answer[j+1])){
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }


        return answer;
    }
}