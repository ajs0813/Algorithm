class Solution {
    public long solution(int n) {
        long answer = 0;

        // 결과값을 저장할 배열 생성, dp[1] -> 1칸 / dp[2] -> 2칸 / dp[3] -> 3칸
        long[] dp = new long[n + 1]; // dp[0]은 쓰지 않음

        // 초기 값 설정
        dp[1] = 1; // 1칸을 뛰는 방법을 1가지 (1칸)
        if(n>1){
            dp[2] = 2; // 2칸을 뛰는 방법은 2가지 (1칸 + 1칸, 2칸)
        }

        // dp[3]을 가는 법은 dp[1] 을 가는 수 + dp[2]을 가는 수 => 3가지
        // (1칸) + (1칸+1칸), (1칸) + (2칸), (2칸) + (1칸)
        // dp[4]를 가는 법는 dp[3] + dp[2] 점화식 성립

        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        answer = dp[n];

        return answer;
    }
}