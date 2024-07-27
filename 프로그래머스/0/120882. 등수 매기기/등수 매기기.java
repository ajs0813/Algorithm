class Solution {
    public int[] solution(int[][] score) {

        int[] avg = new int[score.length];
        int[] rank = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]);
        }

        int Max = Integer.MIN_VALUE;

        int rankNum = 1;
        int check = 0;

        while (rankNum < score.length+1) {
            for (int i = 0; i < score.length; i++) {
                Max = Math.max(Max, avg[i]);
            }

            for (int i = 0; i < avg.length; i++) {
                if (Max == avg[i]) {
                    rank[i] += rankNum;
                    avg[i] = Integer.MIN_VALUE;
                    check++;
                }
            }
            rankNum += check;
            check = 0;
            Max = Integer.MIN_VALUE;
        }

        int[] answer = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            answer[i] = rank[i];
        }
        return answer;
    }
}