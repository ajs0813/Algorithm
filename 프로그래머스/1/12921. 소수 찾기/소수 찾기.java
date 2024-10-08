import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n<2) return 0;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        // 에라토스테네스의 체 알고리즘 적용
        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        
        // 소수 개수 세기
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        
        answer = count;

        return answer;
    }
}