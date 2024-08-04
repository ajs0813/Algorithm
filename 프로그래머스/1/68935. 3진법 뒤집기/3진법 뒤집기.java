class Solution {
    public int solution(int n) {
        int answer = 0;
        // 3진법으로 변환
        String ternaryString = Integer.toString(n,3);

        // 3진법 문자열을 뒤집기
        String reversedString = new StringBuilder(ternaryString).reverse().toString();

        // 뒤집힌 3진법 문자열을 10진법 정수로 변환
        answer = Integer.parseInt(reversedString, 3);
        return answer;
    }
}