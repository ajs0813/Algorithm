class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        String result1 = A+B;
        int result2 = 2*a*b;
        
        int result3 = Integer.parseInt(result1);
        
        if(result3>result2){
            answer = result3;
        }
        
        if(result3<result2){
            answer = result2;
        }
        
        if(result3 == result2){
            answer = result3;
        }
        
        return answer;
    }
}