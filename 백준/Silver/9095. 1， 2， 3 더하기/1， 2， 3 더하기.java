import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        // 최대 입력값인 10에 대한 dp 배열을 미리 선언하고 초기화

        int[] dp = new int[11];
        dp[1] = 1; // 1을 1의 합으로 나타내는 방법: 1
        dp[2] = 2; // 2를 1, 2의 합으로 나타내는 방법: 1+1, 2
        dp[3] = 4; // 3을 1, 2, 3의 합으로 나타내는 방법: 1+1+1, 1+2, 2+1, 3

        // dp 배열을 채우기
        for(int i = 4; i<=10; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        // 각 테스트 케이스에 대해 정답 출력
        for (int t = 0; t < T; t++){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}

