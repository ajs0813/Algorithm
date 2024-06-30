class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1; // 1! 2! 3!.. 팩토리얼의 값

        while (true) {
            if (factorial > n) { // 팩토리얼 값이 주어진 n보다 작다면
                return i - 1;
            }
            i++;
            factorial *= i;
        }
    }
}