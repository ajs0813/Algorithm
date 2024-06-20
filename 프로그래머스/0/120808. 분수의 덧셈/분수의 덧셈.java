class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 분모가 같을 때
        if (denom1 == denom2) {
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        } else {
            // 최소 공배수(LCM) 계산
            int lcm = lcm(denom1, denom2);
            answer[0] = (lcm / denom1) * numer1 + (lcm / denom2) * numer2;
            answer[1] = lcm;
        }

        // 기약분수로 만들기 위해 최대 공약수(GCD)로 나누기
        int gcd = gcd(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;

        return answer;
    }

    // 최대 공약수(GCD) 계산
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수(LCM) 계산
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}