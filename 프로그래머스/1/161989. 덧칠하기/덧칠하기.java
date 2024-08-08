import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        boolean[] board = new boolean[n];

        Arrays.fill(board, true);

        for(int i = 0; i < section.length; i++) {
            board[section[i]-1] = false;
        }

        for(int i = 0; i < n; i++) {
            if(!board[i]){
                for(int j = 0; j < m; j++) {
                    if(i+j < board.length) {
                        board[i + j] = true;
                    }
                }
                answer++;
            }
        }

        return answer;
    }
}