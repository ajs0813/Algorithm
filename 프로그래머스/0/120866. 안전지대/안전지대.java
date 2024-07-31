class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] markBoard = new int[board.length][board[0].length];
        int[][] mark = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < mark.length; k++) {
                        markBoard[i][j] = 1;

                        if (i + mark[k][0] >=0 && i + mark[k][0]< markBoard.length && j + mark[k][1] >=0 && j + mark[k][1]< markBoard[i].length) {
                            markBoard[i + mark[k][0]][j + mark[k][1]] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < markBoard.length; i++) {
            for (int j = 0; j < markBoard[i].length; j++) {
                if (markBoard[i][j] == 0) {
                    answer++;
                }
            }
        }


        return answer;
    }
}