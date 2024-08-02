class Solution {
    public String solution(int n) {
        String answer = "";
        int count = 1;
        while(count <= n){
            if(count%2 == 1){
                answer += "수";
            } else {
                answer += "박";
            }
            count++;
        }
        
        
        return answer;
    }
}