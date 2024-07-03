class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        String result1 = A+B;
        String result2 = B+A;
        
        int result3 = Integer.parseInt(result1);
        int result4 = Integer.parseInt(result2);
        
        if(result3>result4){
            answer = result3;
        }
        
        if(result3<result4){
            answer = result4;
        }
        
        if(result3 == result4){
            answer = result3;
        }
        
        return answer;
    }
}