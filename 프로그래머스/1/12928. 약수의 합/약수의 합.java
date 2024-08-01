class Solution {
    public int solution(int n) {
        int answer = 0;
        int check = 1;
        while(check <= n){
            if(n%check == 0){
                answer += check;
            }
            check++;
        }

        return answer;
    }
}