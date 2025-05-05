class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 1. 행렬의 결과 형태는 첫행렬의 행과 두번째 행렬의 열의 형태로 미리 형태를 알 수 있다
        int[][] answer = new int[arr1.length][arr2[0].length]; // 3x2의 형태 행렬이 나올 것

        // 2. 행렬의 곱은 삼중 포문으로 구현 가능
        for(int i = 0; i < arr1.length; i++) { // 첫번째 행렬의 행값 가져올 1번째 포문
            for(int j = 0; j < arr2[0].length; j++) { // 두번째 행렬의 열값 가져올 2번째 포문
                for(int k = 0; k < arr1[0].length; k++) { // 첫번째 행렬에서는 각 행의 열값을, 두번째 행렬에서는 첫번째 행에서 가져온 값과 곱할 값을 가져올 3번째 포문
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}