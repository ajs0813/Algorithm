class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        for(int i = 0; i < sizes.length; i++){
            maxW = Math.max(maxW, sizes[i][0]);
            maxH = Math.max(maxH, sizes[i][1]);
        }

        answer = maxW * maxH;

        return answer;
    }
}