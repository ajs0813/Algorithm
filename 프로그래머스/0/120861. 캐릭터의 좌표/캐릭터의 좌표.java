class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int[][] walk = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        int x = 0;
        int y = 0;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                x += walk[2][0];
            } else if (keyinput[i].equals("right")) {
                x += walk[3][0];
            } else if (keyinput[i].equals("up")) {
                y += walk[0][1];
            } else if (keyinput[i].equals("down")) {
                y += walk[1][1];
            }

            if(Math.abs(x) > Math.abs((board[0]-1) / 2 )){
                if(x>0){
                    x--;
                } else {
                    x++;
                }
            }
            if(Math.abs(y) > Math.abs((board[1]-1) / 2 )){
                if(y>0){
                    y--;
                } else {
                    y++;
                }
            }
        }


        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}