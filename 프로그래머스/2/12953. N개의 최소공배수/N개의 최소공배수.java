class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int lcmCheck = LCM(arr[0], arr[1]); // 첫 공배수

        for (int i = 2; i < arr.length; i++) {
            int temp = lcmCheck;
            lcmCheck = LCM(temp, arr[i]);
        }

        answer = lcmCheck;

        return answer;
    }

    public int GCD(int a, int b){
        if(b == 0){
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public int LCM(int a, int b){
        return (a*b) / GCD(a, b);
    }
}