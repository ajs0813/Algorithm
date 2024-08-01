class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; // 현재 숫자
        int x = 0, y = 0; // 현재 위치

        // 방향 배열 (오른쪽, 아래쪽, 왼쪽, 위쪽)
        int[] dx = {0,1,0,-1}; // dx[0], dy[0] 이런 식으로 한 묶음
        int[] dy = {1,0,-1,0}; // 오른쪽, 아래쪽, 왼쪽, 위쪽
        int direction = 0; // direction은 dx와 dy의 인덱스 역할을 함, ex) dx[direction] dy[direction] 여기서 direction이 0이면 오른쪽으로, 1이면 아래쪽으로...

        while(num <= n*n){
            // 현재 위치에 숫자 배치
            answer[x][y] = num++;

            // 다음 위치 계산
            int newX = x + dx[direction];
            int newY = y + dy[direction];

            // 경계 검사 및 방향 변경
            if(newX < 0 || newX >= n || newY < 0 || newY >= n || answer[newX][newY] != 0){ // answer[newX][newY]는 혹여나 가려는 위치에 이미 값이 있나 체크용
                direction = (direction +1) % 4; // direction은 4가지 방향을 나타내는 인덱스이므로 0 1 2 3 값만 나타내면 되기에 %4로 처리
                newX = x + dx[direction];
                newY = y + dy[direction];
            }

            // 이동
            x = newX;
            y = newY;
        }

        return answer;
    }
}