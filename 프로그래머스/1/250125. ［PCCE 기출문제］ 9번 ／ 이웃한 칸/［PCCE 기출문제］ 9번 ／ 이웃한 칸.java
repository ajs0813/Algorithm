class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int count = 0; // 같은 색의 갯수를 카운트 할 변수
        String check = board[h][w];

        if (h - 1 >= 0 && h < board.length && w >= 0 && w < board.length) {
            if (board[h - 1][w].equals(check)) {
                count = count + 1;
            }
        }
        if (h >= 0 && h + 1 < board.length && w >= 0 && w < board.length) {
            if (board[h + 1][w].equals(check)) {
                count = count + 1;
            }
        }
        if (h >= 0 && h < board.length && w - 1 >= 0 && w < board.length) {
            if (board[h][w - 1].equals(check)) {
                count = count + 1;
            }
        }
        if (h >= 0 && h < board.length && w >= 0 && w + 1 < board.length) {
            if (board[h][w + 1].equals(check)) {
                count = count + 1;
            }
        }

        answer = count;

        return answer;
    }
}