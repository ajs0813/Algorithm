class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        while(x <= n){
            if(n%x == 1){
                return x;
            }

            x++;
        }

        return answer;
    }
}