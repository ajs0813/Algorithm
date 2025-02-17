import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int n = park.length; // 공원의 세로 크기
        int m = park[0].length; // 공원의 가로 크기

        // 큰 돗자리부터 시도하기 위해 내림차순 정렬
        Arrays.sort(mats);
        for(int i = mats.length -1; i >= 0; i--){
            int size = mats[i]; // 현재 시도할 돗자리 크기

            // 공원에서 가능한 위치 확인
            if(canPlaceMat(size, park, n, m)){
                return size;
            }
        }
        return answer; // 어떤 돗자리도 깔 수 없는 경우
    }

    boolean canPlaceMat(int size, String[][] park, int n, int m){
        // 모든 시작점을 탐색
        for(int i = 0; i <= n - size; i++){
            for(int j = 0; j <= m -size; j++){
                if(isValidArea(i, j, size, park)){
                    return true;
                }

            }

        }
        return false;
    }

    boolean isValidArea(int x, int y, int size, String[][] park){
        // size x size 영역이 모두 "-1"인지 확인
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(!park[i][j].equals("-1")){
                    return false; // 사람이 있는 경우 불가능
                }
            }
        }

        return true;
    }
}