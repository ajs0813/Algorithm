import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] ball = new int[2];

        // 1. 최소 당첨볼 갯수 구하는 방법
        boolean check = Arrays.stream(lottos).allMatch(i -> i == 0);
        if(check) answer[1] = 6;

        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if(win_nums[i] == lottos[j]){
                    ball[1]++;
                }
            }
        }

        // 2. 최대 당첨볼 갯수 구하는 방법
        for(int i = 0; i < win_nums.length; i++){
            for(int j = 0; j < lottos.length; j++){
                if(win_nums[i] == lottos[j]){
                    ball[0]++;
                }
            }
        }

        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                ball[0]++;
            }
        }

        // 3. 순위 맞춰주기
        for(int i = 0; i < ball.length; i++){
            if(ball[i] == 0 || ball[i] == 1){
                answer[i] = 6;
            } else if(ball[i] == 2){
                answer[i] = 5;
            } else if(ball[i] == 3){
                answer[i] = 4;
            } else if(ball[i] == 4){
                answer[i] = 3;
            } else if(ball[i] == 5){
                answer[i] = 2;
            } else if(ball[i] == 6){
                answer[i] = 1;
            }
        }



        return answer;
    }
}