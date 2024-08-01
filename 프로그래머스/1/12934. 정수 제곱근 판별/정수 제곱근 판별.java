class Solution {
    public long solution(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n); // n 제곱근
        
        if(sqrt == (long)sqrt){
            // 제곱근이 정수인 경우, 제곱근 +1의 제곱을 반환합니다.
            long x = (long)sqrt;
            return (x+1)*(x+1);
        } else {
            return -1;
        }
        
    }
}