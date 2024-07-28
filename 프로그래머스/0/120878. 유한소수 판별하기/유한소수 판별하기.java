class Solution {
    public int solution(int a, int b) {
        // a와 b의 최대공약수를 구함
        int gcd = GCD(a,b);

        // 기약분수로 만들기 위해 b를 최대 공약수로 나눔
        b /= gcd;

        // 분모가 2와 5로만 나누어 떨어지게 함
        while(b%2 == 0){
            b/=2;
        }

        while(b%5 == 0){
            b/=5;
        }

        // 분모가 1이면 유한소수, 그렇지 않으면 무한소수

        int answer = (b==1) ? 1:2;

        return answer;
    }

    public int GCD(int a, int b) {
        if(b==0){
            return a;
        } else{
            return GCD(b, a % b);
        }
    }
}