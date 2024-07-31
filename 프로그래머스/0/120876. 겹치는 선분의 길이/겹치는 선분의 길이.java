class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] count = new int[201];

        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < lines.length; j++) {
                if(i>=lines[j][0]+100 && i< lines[j][1]+100) {
                    count[i]++;
                }
            }
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i]>1) {
                answer++;
            }
        }

        return answer;
    }
}