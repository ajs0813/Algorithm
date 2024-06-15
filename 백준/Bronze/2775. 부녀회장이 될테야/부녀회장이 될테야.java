import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        // 최대 k와 n이 14이므로 충분히 큰 DP 테이블을 만든다.
        int[][] dp = new int[15][15];

        // 0층 초기화
        for(int i =1; i<=14; i++){
            dp[0][i] = i;
        }

        // DP 테이블 채우기
        for(int k = 1; k<=14; k++){ // 층수
            for(int n = 1; n<=14; n++){ // 호수
                for(int j = 1; j <= n; j++){ // K층의 N호에 사는 사람의 수는 K-1층의 1호+2호+...+N호
                    dp[k][n] += dp[k-1][j];
                }
            }
        }

        // 입력받은 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(dp[k][n]);
        }
        sc.close();
    }
}

