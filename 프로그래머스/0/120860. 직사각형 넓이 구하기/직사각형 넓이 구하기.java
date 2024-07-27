class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        // x좌표와 y좌표의 최소 최대값을 찾아냄
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;

        // 주어진 x좌표와 y좌표를 탐색
        for(int i = 0; i < dots.length; i++) {
                int x = dots[i][0];
                int y = dots[i][1];

                if(x < xMin){
                    xMin = x;
                }
                if(y < yMin){
                    yMin = y;
                }
                if(x > xMax){
                    xMax = x;
                }
                if(y > yMax){
                    yMax = y;
                }
        }

        int width = xMax - xMin;
        int height = yMax - yMin;

        answer = width * height;

        return answer;
    }
}