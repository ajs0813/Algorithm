class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int check1 = Math.min(a,b);
        int check2 = Math.max(a,b);
        
        while(check1 <= check2){
            answer += check1;
            check1++;
        }
        
        
        return answer;
    }
}