class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            
                for(int k = 0; k<arr.length; k++) {
                    if(k>=queries[i][0] && k<=queries[i][1]){
                        arr[k]++;
                    }
                }

        }

        answer = arr.clone();

        return answer;
    }
}