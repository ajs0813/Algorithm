import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        int[][] board2 = new int[board.length][board[0].length];

        for (int i = 0; i < board2.length; i++) {
            for (int j = 0; j < board2[i].length; j++) {
                board2[i][j] = board[j][i];
            }
        }


        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board2[moves[i] - 1].length; j++) {
                if (board2[moves[i] - 1][j] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board2[moves[i] - 1][j]);
                    } else {
                        if (stack.peek() == board2[moves[i] - 1][j]) {
                            stack.pop();
                            answer++;
                        } else {
                            stack.push(board2[moves[i] - 1][j]);
                        }
                    }

                    board2[moves[i] - 1][j] = 0;
                    break;
                }
            }
        }


        return answer*2;
    }
}