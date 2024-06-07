import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 보드의 행 수
        int M = sc.nextInt(); // 보드의 열 수
        sc.nextLine(); // 개행 문자 처리

        char[][] board = new char[N][M];

        // 보드 입력 받기
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        sc.close();

        int minCount = Integer.MAX_VALUE;

        // 가능한 모든 8x8 체스판에 대해 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = countRepaints(board, i, j); // 다시 칠해야 하는 정사각형의 개수 계산
                minCount = Math.min(minCount, count); // 최소값 업데이트
            }
        }

        System.out.println(minCount);
    }

    // 다시 칠해야 하는 정사각형의 개수 계산하는 함수
    private static int countRepaints(char[][] board, int startX, int startY) {
        char[] colors = {'W', 'B'}; // 체스판의 색깔

        int repaints1 = 0; // 시작이 W로 시작하는 경우
        int repaints2 = 0; // 시작이 B로 시작하는 경우

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                // 체스판의 해당 위치의 색깔과 다시 칠해야 하는 색깔을 비교하여 칠해야 하는 경우 카운트 증가
                if (board[i][j] != colors[(i + j) % 2]) {
                    repaints1++;
                }
                if (board[i][j] != colors[(i + j + 1) % 2]) {
                    repaints2++;
                }
            }
        }

        // 두 경우 중에서 더 작은 값 반환
        return Math.min(repaints1, repaints2);
    }
}
